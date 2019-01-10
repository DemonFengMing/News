package cn.bdqn.controller;

import cn.bdqn.pojo.Comment;
import cn.bdqn.pojo.JsonResult;
import cn.bdqn.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * Created by Administrator on 2018/5/6/006.
 */
@RestController
public class CommentController {

    @Autowired
    private CommentService commentService;

    @RequestMapping(value="/commentsave.do")
    public JsonResult commentSave(Comment comment){
        comment.setCreateDate(new Date());
        int cnt = commentService.save(comment);
        if(cnt > 0){
            return JsonResult.ok();
        }else{
            return JsonResult.fail();
        }

    }

}
