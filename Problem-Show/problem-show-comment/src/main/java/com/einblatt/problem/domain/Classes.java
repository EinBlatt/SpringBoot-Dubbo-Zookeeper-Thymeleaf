package com.einblatt.problem.domain;

import java.io.Serializable;

public class Classes implements Serializable {
    private Integer id;

    private String cname;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname == null ? null : cname.trim();
    }
}