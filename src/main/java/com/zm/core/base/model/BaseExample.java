package com.zm.core.base.model;
/**
 * BaseExample 基类
 * @ClassName BaseExample
 * @Description 增加分页参数
 */
public abstract class BaseExample {

    protected PageInfo pageInfo;
    protected String groupByClause;

    public PageInfo getPageInfo() {
        return pageInfo;
    }

    public void setPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
    }

    public String getGroupByClause() {
        return groupByClause;
    }

    public void setGroupByClause(String groupByClause) {
        this.groupByClause = groupByClause;
    }
    
}