package com.qfedu.common;

public class JsonPage {
    private Integer page;
    private Integer limit;

    public JsonPage() {
    }

    public JsonPage(Integer page, Integer limit) {
        this.page = page;
        this.limit = limit;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }
}
