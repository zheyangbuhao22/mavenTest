package com.tu.domain;

public class bug {
    private Integer bugId;
    private String bugName;

    public Integer getBugId() {
        return bugId;
    }

    public void setBugId(Integer bugId) {
        this.bugId = bugId;
    }

    public String getBugName() {
        return bugName;
    }

    public void setBugName(String bugName) {
        this.bugName = bugName;
    }

    @Override
    public String toString() {
        return "bug{" +
                "bugId=" + bugId +
                ", bugName='" + bugName + '\'' +
                '}';
    }
}
