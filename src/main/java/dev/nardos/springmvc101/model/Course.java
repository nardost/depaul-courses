package dev.nardos.springmvc101.model;

public class Course {
    String id;
    String subject;
    Integer catalogNumber;
    String title;
    String prerequisites;
    String category;
    String field;

    public Course() {
    }

    public Course(String id, String subject, int catalogNumber, String title, String prerequisites, String category, String field) {
        this.id = id;
        this.subject = subject;
        this.catalogNumber = catalogNumber;
        this.title = title;
        this.prerequisites = prerequisites;
        this.category = category;
        this.field = field;
    }

    public String getId() {
        return id;
    }

    public String getSubject() {
        return subject;
    }

    public Integer getCatalogNumber() {
        return catalogNumber;
    }

    public String getTitle() {
        return title;
    }

    public String getPrerequisites() {
        return prerequisites;
    }

    public String getCategory() {
        return category;
    }

    public String getField() {
        return field;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setCatalogNumber(Integer catalogNumber) {
        this.catalogNumber = catalogNumber;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPrerequisites(String prerequisites) {
        this.prerequisites = prerequisites;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setField(String field) {
        this.field = field;
    }
}
