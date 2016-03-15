package com.copywrite.dybatis.bean;


import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by copywrite on 16/3/14.
 */

public class DogeDO implements Serializable{
    private static final long serialVersionUID = 8103032031687664207L;

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