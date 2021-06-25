package com.ustb.prototypepattern;

public class Client {
    public static void main(String[] args) {
        Resume resumeA = new Resume("bian");
        resumeA.setPersonInfo("男", "23");
        resumeA.setWorkExperienceInfo("2016-2021", "青岛");
        System.out.println(resumeA);

        Resume resumeB =  resumeA.cope();
        resumeB.name = "chen";
        resumeA.setWorkExperienceInfo("2017-2022", "济南");
        System.out.println(resumeA);
        System.out.println(resumeB);
    }
}
