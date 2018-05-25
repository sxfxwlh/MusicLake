package com.cyl.musiclake.bean;

import org.litepal.crud.DataSupport;

/**
 * Created by master on 2018/4/26.
 */

public class SearchHistoryBean extends DataSupport {
    private long id;
    private String title;

    public SearchHistoryBean(long id, String title) {
        this.id = id;
        this.title = title;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
