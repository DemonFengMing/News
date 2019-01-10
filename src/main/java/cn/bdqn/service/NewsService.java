package cn.bdqn.service;

import cn.bdqn.pojo.News;

import java.util.List;

/**
 * Created by Administrator on 2018/5/6/006.
 */
public interface NewsService {
    List<News> findAll();
    boolean delete(Long id);
}
