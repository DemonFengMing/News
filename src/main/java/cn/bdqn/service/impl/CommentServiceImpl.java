package cn.bdqn.service.impl;

import cn.bdqn.dao.CommentDao;
import cn.bdqn.pojo.Comment;
import cn.bdqn.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2018/5/6/006.
 */
@Service
public class CommentServiceImpl implements CommentService {

    @Autowired
    private CommentDao commentDao;

    @Override
    public int save(Comment comment) {
        return commentDao.save(comment);
    }
}
