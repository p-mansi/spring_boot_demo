package com.mansi.spring_boot_demo.DTOs;

public class About {

    private String intro;
    private String skills;
    private String details;

    public About(String intro, String skills, String details) {
        this.intro = intro;
        this.skills = skills;
        this.details = details;
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }
}
