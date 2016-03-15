package com.copywrite.dybatis.bean;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * Created by copywrite on 16/3/14.
 */

public class DogeQuery implements Serializable {
    private static final long serialVersionUID = 7530298660063892170L;

    /**
     * auto increment
     */
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}