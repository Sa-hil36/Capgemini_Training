package com.labs;

public class Department {

    private int deptId;
    private String deptName;
    private int mgrId;

    public Department(int deptId, String deptName, int mgrId) {
        this.deptId = deptId;
        this.deptName = deptName;
        this.mgrId = mgrId;
    }

    public int getDepartmentId() {
        return deptId;
    }

    public void setDepartmentId(int deptId) {
        this.deptId = deptId;
    }

    public String getDepartmentName() {
        return deptName;
    }

    public void setDepartmentName(String deptName) {
        this.deptName = deptName;
    }

    public int getManagerId() {
        return mgrId;
    }

    public void setManagerId(int mgrId) {
        this.mgrId = mgrId;
    }

    @Override
    public String toString() {
        return deptName;
    }
}
