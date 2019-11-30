package com.jxnu.service;

import com.jxnu.pojo.Goods;

import java.util.List;

public interface GoodService {
    List<Goods> queryBookByUserid(String userid);
    List<Goods> queryAllBook();
}
