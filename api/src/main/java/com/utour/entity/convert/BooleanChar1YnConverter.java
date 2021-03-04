package com.utour.entity.convert;

import com.utour.common.contrants.Constants;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;
import java.util.Optional;

@Converter
public class BooleanChar1YnConverter implements AttributeConverter<Boolean, String> {

    @Override
    public String convertToDatabaseColumn(Boolean attribute) {
        return Optional.ofNullable(attribute).map(b -> b?Constants.Y:Constants.N).orElse(Constants.N);
    }

    @Override
    public Boolean convertToEntityAttribute(String dbData) {
        return Constants.Y.equals(dbData);
    }
}
