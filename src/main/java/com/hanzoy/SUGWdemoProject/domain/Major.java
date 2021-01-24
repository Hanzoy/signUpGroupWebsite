package com.hanzoy.SUGWdemoProject.domain;

public class Major {
    private Integer majorid;

    private String majorname;

    public Integer getMajorid() {
        return majorid;
    }

    public void setMajorid(Integer majorid) {
        this.majorid = majorid;
    }

    public String getMajorname() {
        return majorname;
    }

    public void setMajorname(String majorname) {
        this.majorname = majorname;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", majorid=").append(majorid);
        sb.append(", majorname=").append(majorname);
        sb.append("]");
        return sb.toString();
    }
}