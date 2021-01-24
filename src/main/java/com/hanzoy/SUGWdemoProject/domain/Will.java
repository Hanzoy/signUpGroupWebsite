package com.hanzoy.SUGWdemoProject.domain;

public class Will {
    private Integer willid;

    private String organization;

    private String branch;

    public Integer getWillid() {
        return willid;
    }

    public void setWillid(Integer willid) {
        this.willid = willid;
    }

    public String getOrganization() {
        return organization;
    }

    public void setOrganization(String organization) {
        this.organization = organization;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", willid=").append(willid);
        sb.append(", organization=").append(organization);
        sb.append(", branch=").append(branch);
        sb.append("]");
        return sb.toString();
    }
}