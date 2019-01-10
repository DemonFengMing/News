package cn.bdqn.dao;

import cn.bdqn.pojo.News;

import java.util.List;

/**
 * Created by Administrator on 2018/5/6/006.
 */

public interface NewsDao {
    List<News> findAll();
    int delete(Long id);
}
