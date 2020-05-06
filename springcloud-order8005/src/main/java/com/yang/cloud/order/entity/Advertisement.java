package com.yang.cloud.order.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * advertisement
 * @author 
 */
public class Advertisement implements Serializable {
    /**
     * 主键
     */
    private Long id;
    /**
     * 广告名称
     */
    private String advertName;

    /**
     * 广告类型1启动广告2暂定广告3加载广告
     */
    private String advertType;

    /**
     * 广告大小KB
     */
    private String size;

    /**
     * 播放时长S
     */
    private String playDuration;

    /**
     * 创建人
     */
    private String createUser;

    /**
     * 1启用2不启用
     */
    private String open;

    /**
     * 0删除1未删除
     */
    private String isDelete;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAdvertName() {
        return advertName;
    }

    public void setAdvertName(String advertName) {
        this.advertName = advertName;
    }

    public String getAdvertType() {
        return advertType;
    }

    public void setAdvertType(String advertType) {
        this.advertType = advertType;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getPlayDuration() {
        return playDuration;
    }

    public void setPlayDuration(String playDuration) {
        this.playDuration = playDuration;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public String getOpen() {
        return open;
    }

    public void setOpen(String open) {
        this.open = open;
    }

    public String getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(String isDelete) {
        this.isDelete = isDelete;
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

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Advertisement other = (Advertisement) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getAdvertName() == null ? other.getAdvertName() == null : this.getAdvertName().equals(other.getAdvertName()))
            && (this.getAdvertType() == null ? other.getAdvertType() == null : this.getAdvertType().equals(other.getAdvertType()))
            && (this.getSize() == null ? other.getSize() == null : this.getSize().equals(other.getSize()))
            && (this.getPlayDuration() == null ? other.getPlayDuration() == null : this.getPlayDuration().equals(other.getPlayDuration()))
            && (this.getCreateUser() == null ? other.getCreateUser() == null : this.getCreateUser().equals(other.getCreateUser()))
            && (this.getOpen() == null ? other.getOpen() == null : this.getOpen().equals(other.getOpen()))
            && (this.getIsDelete() == null ? other.getIsDelete() == null : this.getIsDelete().equals(other.getIsDelete()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getAdvertName() == null) ? 0 : getAdvertName().hashCode());
        result = prime * result + ((getAdvertType() == null) ? 0 : getAdvertType().hashCode());
        result = prime * result + ((getSize() == null) ? 0 : getSize().hashCode());
        result = prime * result + ((getPlayDuration() == null) ? 0 : getPlayDuration().hashCode());
        result = prime * result + ((getCreateUser() == null) ? 0 : getCreateUser().hashCode());
        result = prime * result + ((getOpen() == null) ? 0 : getOpen().hashCode());
        result = prime * result + ((getIsDelete() == null) ? 0 : getIsDelete().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", advertName=").append(advertName);
        sb.append(", advertType=").append(advertType);
        sb.append(", size=").append(size);
        sb.append(", playDuration=").append(playDuration);
        sb.append(", createUser=").append(createUser);
        sb.append(", open=").append(open);
        sb.append(", isDelete=").append(isDelete);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}