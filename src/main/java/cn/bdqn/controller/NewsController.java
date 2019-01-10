package cn.bdqn.controller;

import cn.bdqn.pojo.JsonResult;
import cn.bdqn.pojo.News;
import cn.bdqn.service.NewsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Administrator on 2018/5/6/006.
 */
@RestController
public class NewsController {

    Logger logger = LoggerFactory.getLogger(NewsController.class);

    @Autowired
    private NewsService newsService;

    @RequestMapping(value="/newslist.do")
    public JsonResult<List<News>> newsList(){
        logger.info("list");
        List<News> list = newsService.findAll();
        return JsonResult.<List<News>>ok(list);
    }

    @RequestMapping(value="/newsdel.do")
    public JsonResult newsList(Long id){
        logger.info("delete");
        try{
            newsService.delete(id);
            return JsonResult.ok();
        }catch(Exception e){
            return JsonResult.fail();
        }

    }

}
