package dev.nardos.springmvc101.model;

import javax.annotation.Generated;
import javax.persistence.*;

@Entity
public class Course {

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;
    @Version Integer version;
    private String subject;
    private Integer catalogNumber;
    private String title;
    private String prerequisites;
    private String category;
    private String field;

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

    public Integer getVersion() {
        return version;
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

    public void setVersion(Integer version) {
        this.version = version;
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
