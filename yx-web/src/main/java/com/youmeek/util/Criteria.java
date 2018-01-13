package com.youmeek.util;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
/**
 * @author Administrator
 */
public class Criteria  implements Serializable{

    private Map<String, Object> condition;

    protected boolean distinct;

    protected String orderByClause;

    private Integer mysqlOffset;

    private Integer mysqlLength;
    public  Criteria(){
        this.condition = new HashMap<String, Object>();
    }

    public  Criteria(String key, String value){
        this();
        this.condition.put(key, value);
    }

    public Criteria(Criteria example) {
        this.condition = example.condition;
        this.distinct = example.distinct;
        this.orderByClause = example.orderByClause;
        this.mysqlOffset = example.mysqlOffset;
        this.mysqlLength = example.mysqlLength;
    }

    public void clear(){
        this.condition.clear();
        this.distinct = false;
        this.orderByClause = null;
        this.mysqlOffset = null;
        this.mysqlLength = null;
    }

    public Criteria put(String key, Object value) {
        this.condition.put(key, value);
        return this;
    }















    public Map<String, Object> getCondition() {
        return condition;
    }

    public void setCondition(Map<String, Object> condition) {
        this.condition = condition;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public Integer getMysqlOffset() {
        return mysqlOffset;
    }

    public void setMysqlOffset(Integer mysqlOffset) {
        this.mysqlOffset = mysqlOffset;
    }

    public Integer getMysqlLength() {
        return mysqlLength;
    }

    public void setMysqlLength(Integer mysqlLength) {
        this.mysqlLength = mysqlLength;
    }
}
