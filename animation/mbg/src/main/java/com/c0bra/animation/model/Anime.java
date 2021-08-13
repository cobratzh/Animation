package com.c0bra.animation.model;

import java.io.Serializable;
import java.util.Date;

public class Anime implements Serializable {

    private Integer id;

    private String name;

    private Integer productionId;

    private Date release;

    private Integer updateInterval;

    private Integer episode;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getProductionId() {
        return productionId;
    }

    public void setProductionId(Integer productionId) {
        this.productionId = productionId;
    }

    public Date getRelease() {
        return release;
    }

    public void setRelease(Date release) {
        this.release = release;
    }

    public Integer getUpdateInterval() {
        return updateInterval;
    }

    public void setUpdateInterval(Integer updateInterval) {
        this.updateInterval = updateInterval;
    }

    public Integer getEpisode() {
        return episode;
    }

    public void setEpisode(Integer episode) {
        this.episode = episode;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", productionId=").append(productionId);
        sb.append(", release=").append(release);
        sb.append(", updateInterval=").append(updateInterval);
        sb.append(", episode=").append(episode);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}