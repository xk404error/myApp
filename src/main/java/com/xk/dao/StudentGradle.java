package com.xk.dao;

public class StudentGradle {
    private Integer id;

    private String studentName;

    private Integer studentId;

    private String coursenName;

    private Integer coursenId;

    private Long grade;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName == null ? null : studentName.trim();
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public String getCoursenName() {
        return coursenName;
    }

    public void setCoursenName(String coursenName) {
        this.coursenName = coursenName == null ? null : coursenName.trim();
    }

    public Integer getCoursenId() {
        return coursenId;
    }

    public void setCoursenId(Integer coursenId) {
        this.coursenId = coursenId;
    }

    public Long getGrade() {
        return grade;
    }

    public void setGrade(Long grade) {
        this.grade = grade;
    }
}