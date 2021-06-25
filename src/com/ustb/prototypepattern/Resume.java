package com.ustb.prototypepattern;

public class Resume implements Cloneable {
    public String name;
    public String sex;
    public String age;
    // 如果 WorkExperience 类中未实现 clone方法，
    // 在Resume clone时 只会简单的复制引用
    // 在克隆出的实体里对 workExperience 也会造成原型的修改
    // 这就是浅复制,
    public WorkExperience workExperience;

    public Resume(String name) {
        this.name = name;
        workExperience = new WorkExperience();
    }

    public Resume(WorkExperience workExperience){
        this.workExperience = workExperience.copy();
    }

    public void setPersonInfo(String sex, String age) {
        this.sex = sex;
        this.age = age;
    }

    public void setWorkExperienceInfo(String workDate, String company) {
        workExperience.setWorkDate(workDate);
        workExperience.setCompany(company);
    }

    // 在客户端调用 resumeA.clone() 会不断递归调用 this.clone() 没有递归退出条件
    // 造成stackoverflowercuowu
//    public Resume clone(){
//        return this.clone();
//    }

    public Resume cope() {
// 浅复制
//        Resume resumeCope = null;
//        try {
//            resumeCope = (Resume) this.clone();
//        } catch (CloneNotSupportedException e) {
//            e.printStackTrace();
//        }
//        return resumeCope;
        Resume resumeCope = new Resume(this.workExperience);
        resumeCope.age = this.age;
        resumeCope.sex = this.sex;
        resumeCope.name = this.name;
        return resumeCope;
    }

    @Override
    public String toString() {
        return "Resume{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age='" + age + '\'' +
                ", workExperience=" + workExperience +
                '}';
    }
}
