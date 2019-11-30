package com.jxnu.service;

import com.jxnu.dao.GoodMapper;
import com.jxnu.pojo.Goods;

import java.util.List;

public class GoodServiceImp implements GoodService {
    private GoodMapper goodMapper;

    public void setGoodMapper(GoodMapper goodMapper) {
        this.goodMapper = goodMapper;
    }

    public List<Goods> queryBookByUserid(String userid) {
        return goodMapper.queryBookByUserid(userid);
    }

    public List<Goods> queryAllBook() {
        return goodMapper.queryAllBook();
    }
}
