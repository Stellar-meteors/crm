package com.zch.crm.entity;

/**
 * @Description: TODO
 * @Author: 张楚涵
 * @Date: 2019/9/4 0004 9:22
 * @version:1.0.0
 */
public class Position {
    private Long id;

    private String positionname;

    private String positionmsg;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPositionname() {
        return positionname;
    }

    public void setPositionname(String positionname) {
        this.positionname = positionname == null ? null : positionname.trim();
    }

    public String getPositionmsg() {
        return positionmsg;
    }

    public void setPositionmsg(String positionmsg) {
        this.positionmsg = positionmsg == null ? null : positionmsg.trim();
    }


    @Override
    public String toString() {
        return "Position{" +
                "id=" + id +
                ", positionname='" + positionname + '\'' +
                ", positionmsg='" + positionmsg + '\'' +
                '}';
    }
}
