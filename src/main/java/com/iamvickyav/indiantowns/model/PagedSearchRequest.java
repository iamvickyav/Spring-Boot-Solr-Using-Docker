package com.iamvickyav.indiantowns.model;

public class PagedSearchRequest extends SearchRequest {
    private Integer page = 0;
    private Integer size = 20;

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }
}
