package org.example.beans;

public class SUB {
    private int subId;
    private String subName;
    private String subHead;

    public int getSubId() {
        return subId;
    }

    public void setSubId(int subId) {
        this.subId = subId;
    }

    public String getSubName() {
        return subName;
    }

    public void setSubName(String subName) {
        this.subName = subName;
    }

    public String getSubHead() {
        return subHead;
    }

    public void setSubHead(String subHead) {
        this.subHead = subHead;
    }

    public SUB(int subId, String subName, String subHead) {
        this.subId = subId;
        this.subName = subName;
        this.subHead = subHead;
    }

    public SUB() {
    }
}
