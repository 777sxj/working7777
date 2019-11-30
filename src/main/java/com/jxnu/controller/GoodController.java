package com.jxnu.controller;

import com.jxnu.pojo.Goods;
import com.jxnu.service.GoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class GoodController {
    @Autowired
    @Qualifier("GoodServiceImp")
    private GoodService goodService;


    @RequestMapping(value = "/main")
    public String showAllGood(HttpSession session){
        List<Goods> showAllGoodList = goodService.queryAllBook();
        for (int i=0;i<showAllGoodList.size();i++){
            System.out.println(showAllGoodList.get(i).getGoodname());
        }
        session.setAttribute("showAllGoodList",showAllGoodList);
        return "main";
    }

}
