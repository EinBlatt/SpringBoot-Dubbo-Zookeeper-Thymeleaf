package com.einblatt.problem.vo;

import com.einblatt.problem.domain.Faqs;

import java.io.Serializable;

public class FaqsReturnWebVo extends Faqs implements Serializable {

    //分类类名
    private String cname;

    public FaqsReturnWebVo() {
    }

    public FaqsReturnWebVo(String cname) {
        this.cname = cname;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }
}
