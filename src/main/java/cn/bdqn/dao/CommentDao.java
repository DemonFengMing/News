package cn.bdqn.dao;

import cn.bdqn.pojo.Comment;
import cn.bdqn.pojo.News;

import java.util.List;

/**
 * Created by Administrator on 2018/5/6/006.
 */
public interface CommentDao {
    int save(Comment comment);
    int delete(Long id);
}
