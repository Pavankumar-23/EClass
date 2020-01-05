package com.demo.eclass.modal;

public class RecommendationDO {
    String subject;
    String faculty_name;

    public RecommendationDO(String subject, String faculty_name) {
        this.subject = subject;
        this.faculty_name = faculty_name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getFaculty_name() {
        return faculty_name;
    }

    public void setFaculty_name(String faculty_name) {
        this.faculty_name = faculty_name;
    }
}
