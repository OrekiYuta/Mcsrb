package com.elias.mcsrb.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;

import java.io.Serializable;


@TableName("TS_DEVICE_BIND_DETAIL")
@ApiModel(value = "TsDeviceBindDetail", description = "")
public class TsDeviceBindDetail implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;

    private String deviceBindId;

    private String deviceId;

    private String deviceName;

    private String deviceModel;

    private String createTime;

    private String delFlag;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDeviceBindId() {
        return deviceBindId;
    }

    public void setDeviceBindId(String deviceBindId) {
        this.deviceBindId = deviceBindId;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public String getDeviceModel() {
        return deviceModel;
    }

    public void setDeviceModel(String deviceModel) {
        this.deviceModel = deviceModel;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag;
    }

    @Override
    public String toString() {
        return "TsDeviceBindDetail{" +
        "id = " + id +
        ", deviceBindId = " + deviceBindId +
        ", deviceId = " + deviceId +
        ", deviceName = " + deviceName +
        ", deviceModel = " + deviceModel +
        ", createTime = " + createTime +
        ", delFlag = " + delFlag +
        "}";
    }
}
