package com.einblatt.problem.service;

import com.einblatt.problem.domain.Faqs;

import java.util.List;

public interface FaqsService {
    int deleteByPrimaryKey(Integer id);

    int insert(Faqs record);

    int insertSelective(Faqs record);

    Faqs selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Faqs record);

    int updateByPrimaryKey(Faqs record);

    //获取所有列表
    List<Faqs> getFaqsList();

    //根据关键字查询问题
    List<Faqs> getFaqListByMainKey(String mainkey);
}
