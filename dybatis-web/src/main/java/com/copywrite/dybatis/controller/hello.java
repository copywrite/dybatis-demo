package com.copywrite.dybatis.controller;

import com.alibaba.fastjson.JSON;
import com.copywrite.dybatis.bean.DogeDO;
import com.copywrite.dybatis.bean.DogeQuery;
import com.copywrite.dybatis.dao.DogeDAO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by copywrite on 16/3/14.
 */

@Controller
public class hello {

    @Resource
    private DogeDAO pintuanItemDAO;

    @RequestMapping(value = "/hello")
    @ResponseBody
    public String hello(HttpServletRequest httpRequest) {

        try {
            DogeQuery dogeQuery = new DogeQuery();
            List<DogeDO> dogeDOList = pintuanItemDAO.getList(dogeQuery);

            return JSON.toJSONString(dogeDOList);
        }catch (Exception e) {
            return "error";
        }
    }
}
