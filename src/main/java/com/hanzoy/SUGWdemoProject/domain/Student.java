package com.hanzoy.SUGWdemoProject.domain;

public class Student {
    private String stuid;

    private String stdname;

    private Integer major;

    private String classnum;

    private String stdqq;

    private String stdphone;

    private Integer firstwill;

    private Integer secondwill;

    private Boolean isdispensing;

    private String firstreason;

    private String secondreason;

    public String getStuid() {
        return stuid;
    }

    public void setStuid(String stuid) {
        this.stuid = stuid;
    }

    public String getStdname() {
        return stdname;
    }

    public void setStdname(String stdname) {
        this.stdname = stdname;
    }

    public Integer getMajor() {
        return major;
    }

    public void setMajor(Integer major) {
        this.major = major;
    }

    public String getClassnum() {
        return classnum;
    }

    public void setClassnum(String classnum) {
        this.classnum = classnum;
    }

    public String getStdqq() {
        return stdqq;
    }

    public void setStdqq(String stdqq) {
        this.stdqq = stdqq;
    }

    public String getStdphone() {
        return stdphone;
    }

    public void setStdphone(String stdphone) {
        this.stdphone = stdphone;
    }

    public Integer getFirstwill() {
        return firstwill;
    }

    public void setFirstwill(Integer firstwill) {
        this.firstwill = firstwill;
    }

    public Integer getSecondwill() {
        return secondwill;
    }

    public void setSecondwill(Integer secondwill) {
        this.secondwill = secondwill;
    }

    public Boolean getIsdispensing() {
        return isdispensing;
    }

    public void setIsdispensing(Boolean isdispensing) {
        this.isdispensing = isdispensing;
    }

    public String getFirstreason() {
        return firstreason;
    }

    public void setFirstreason(String firstreason) {
        this.firstreason = firstreason;
    }

    public String getSecondreason() {
        return secondreason;
    }

    public void setSecondreason(String secondreason) {
        this.secondreason = secondreason;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", stuid=").append(stuid);
        sb.append(", stdname=").append(stdname);
        sb.append(", major=").append(major);
        sb.append(", classnum=").append(classnum);
        sb.append(", stdqq=").append(stdqq);
        sb.append(", stdphone=").append(stdphone);
        sb.append(", firstwill=").append(firstwill);
        sb.append(", secondwill=").append(secondwill);
        sb.append(", isdispensing=").append(isdispensing);
        sb.append(", firstreason=").append(firstreason);
        sb.append(", secondreason=").append(secondreason);
        sb.append("]");
        return sb.toString();
    }
}