package com.elias.mcsrb.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;

import java.io.Serializable;


@TableName("TS_GCI_CUST_BASE_INFO")
@ApiModel(value = "TsGciCustBaseInfo", description = "")
public class TsGciCustBaseInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;

    private String custServiceId;

    private String custName;

    private String code;

    private String groupCustLevel;

    private String custId;

    private Integer organizeId;

    private String organizeName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCustServiceId() {
        return custServiceId;
    }

    public void setCustServiceId(String custServiceId) {
        this.custServiceId = custServiceId;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getGroupCustLevel() {
        return groupCustLevel;
    }

    public void setGroupCustLevel(String groupCustLevel) {
        this.groupCustLevel = groupCustLevel;
    }

    public String getCustId() {
        return custId;
    }

    public void setCustId(String custId) {
        this.custId = custId;
    }

    public Integer getOrganizeId() {
        return organizeId;
    }

    public void setOrganizeId(Integer organizeId) {
        this.organizeId = organizeId;
    }

    public String getOrganizeName() {
        return organizeName;
    }

    public void setOrganizeName(String organizeName) {
        this.organizeName = organizeName;
    }

    @Override
    public String toString() {
        return "TsGciCustBaseInfo{" +
        "id = " + id +
        ", custServiceId = " + custServiceId +
        ", custName = " + custName +
        ", code = " + code +
        ", groupCustLevel = " + groupCustLevel +
        ", custId = " + custId +
        ", organizeId = " + organizeId +
        ", organizeName = " + organizeName +
        "}";
    }
}
