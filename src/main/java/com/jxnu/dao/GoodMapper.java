package com.jxnu.dao;

import com.jxnu.pojo.Goods;

import java.util.List;

public interface GoodMapper {
    List<Goods> queryBookByUserid(String userid);
    List<Goods> queryAllBook();

}
