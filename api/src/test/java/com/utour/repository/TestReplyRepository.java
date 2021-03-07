package com.utour.repository;

import com.utour.TestLocalApplication;
import com.utour.common.contrants.Constants;
import com.utour.entity.Reply;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;

import java.util.List;

public class TestReplyRepository extends TestLocalApplication {

    @Autowired
    private ReplyRepository replyRepository;

    @Test
    public void testReplies(){
        List<Reply> replies = this.replyRepository.findByBoardId(1, PageRequest.of(0, Constants.DEFAULT_PAGING_COUNT));
        log.info("replies.size : {}", replies!= null ? replies.size() : -1);
    }
}
