package com.ustb.prototypepattern;

public class WorkExperience implements Cloneable {
    public String workDate;
    public String company;

    public void setWorkDate(String workDate) {
        this.workDate = workDate;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public WorkExperience copy() {
        WorkExperience workExperienceCopy = null;
        try {
            workExperienceCopy = (WorkExperience) this.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return workExperienceCopy;
    }

    @Override
    public String toString() {
        return "WorkExperience{" +
                "workDate='" + workDate + '\'' +
                ", company='" + company + '\'' +
                '}';
    }
}
