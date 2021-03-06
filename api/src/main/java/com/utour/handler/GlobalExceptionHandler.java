package com.utour.handler;

import com.utour.dto.ResponseDto;
import com.utour.exception.ValidException;
import lombok.RequiredArgsConstructor;
import org.springframework.context.support.MessageSourceAccessor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.Optional;

@ControllerAdvice
@RequiredArgsConstructor
public class GlobalExceptionHandler {

    private final MessageSourceAccessor messageSourceAccessor;

    /**
     * valid error 처리
     * @param throwable
     * @return
     */
    @ExceptionHandler(value = ValidException.class)
    public ResponseEntity<ResponseDto> validExceptionHandler(ValidException throwable) {
        String validErrorMessage = Optional.ofNullable(throwable.getBindingResult()).map(bindingResult -> {
            FieldError fieldError = bindingResult.getFieldError();
            return Optional.ofNullable(fieldError)
                    .map(f -> new StringBuilder("[" + fieldError.getField() + "]").append(" " + fieldError.getDefaultMessage()).toString())
                    .orElse(messageSourceAccessor.getMessage("error.valid.message"));
        }).orElse(messageSourceAccessor.getMessage("error.valid.message"));

        return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                .contentType(MediaType.APPLICATION_JSON)
                .body(ResponseDto.builder()
                        .status(HttpStatus.BAD_REQUEST.value())
                        .message(validErrorMessage)
                        .build());
    }
}
