package com.example.takeTicket.domain;

import java.util.Date;

public class coupon {
    private String couponId;

    private String shopId;

    private Long shareTimes;

    private String couponType;

    private String couponValue;

    private String backupColumn1;

    private String backupColumn2;

    private String isDelete;

    private Date createTime;

    private Date updateTime;

    private Long scanTimes;

    public String getCouponId() {
        return couponId;
    }

    public void setCouponId(String couponId) {
        this.couponId = couponId == null ? null : couponId.trim();
    }

    public String getShopId() {
        return shopId;
    }

    public void setShopId(String shopId) {
        this.shopId = shopId == null ? null : shopId.trim();
    }

    public Long getShareTimes() {
        return shareTimes;
    }

    public void setShareTimes(Long shareTimes) {
        this.shareTimes = shareTimes;
    }

    public String getCouponType() {
        return couponType;
    }

    public void setCouponType(String couponType) {
        this.couponType = couponType == null ? null : couponType.trim();
    }

    public String getCouponValue() {
        return couponValue;
    }

    public void setCouponValue(String couponValue) {
        this.couponValue = couponValue == null ? null : couponValue.trim();
    }

    public String getBackupColumn1() {
        return backupColumn1;
    }

    public void setBackupColumn1(String backupColumn1) {
        this.backupColumn1 = backupColumn1 == null ? null : backupColumn1.trim();
    }

    public String getBackupColumn2() {
        return backupColumn2;
    }

    public void setBackupColumn2(String backupColumn2) {
        this.backupColumn2 = backupColumn2 == null ? null : backupColumn2.trim();
    }

    public String getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(String isDelete) {
        this.isDelete = isDelete == null ? null : isDelete.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Long getScanTimes() {
        return scanTimes;
    }

    public void setScanTimes(Long scanTimes) {
        this.scanTimes = scanTimes;
    }
}