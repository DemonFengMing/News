package cn.bdqn.service.impl;

import cn.bdqn.dao.CommentDao;
import cn.bdqn.dao.NewsDao;
import cn.bdqn.pojo.News;
import cn.bdqn.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Administrator on 2018/5/6/006.
 */
@Service
public class NewsServiceImpl implements NewsService {

    @Autowired
    private NewsDao newsDao;
    @Autowired
    private CommentDao commentDao;

    @Override
    public List<News> findAll() {
        return newsDao.findAll();
    }

    @Override
    @Transactional
    public boolean delete(Long id) {
        //数据库事务
            //先删除评论
            commentDao.delete(id);
            //int i=1/0;
            //再删除新闻
            newsDao.delete(id);

        return true;
    }
}
