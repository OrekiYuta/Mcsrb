package com.elias.mcsrb.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 
 * </p>
 *
 * @author OrekiYuta
 * @since 2023-05-09
 */
@TableName("TS_GCI_GRP_CONTACT")
@ApiModel(value = "TsGciGrpContact对象", description = "")
public class TsGciGrpContact implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;

    private String contName;

    private String custServiceId;

    private Integer contType;

    private String contMobile;

    private String custName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getContName() {
        return contName;
    }

    public void setContName(String contName) {
        this.contName = contName;
    }

    public String getCustServiceId() {
        return custServiceId;
    }

    public void setCustServiceId(String custServiceId) {
        this.custServiceId = custServiceId;
    }

    public Integer getContType() {
        return contType;
    }

    public void setContType(Integer contType) {
        this.contType = contType;
    }

    public String getContMobile() {
        return contMobile;
    }

    public void setContMobile(String contMobile) {
        this.contMobile = contMobile;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    @Override
    public String toString() {
        return "TsGciGrpContact{" +
        "id = " + id +
        ", contName = " + contName +
        ", custServiceId = " + custServiceId +
        ", contType = " + contType +
        ", contMobile = " + contMobile +
        ", custName = " + custName +
        "}";
    }
}
