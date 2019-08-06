package dev.nardos.springmvc101.model;

public class Course {
    String id;
    int creditHours;
    String subject;
    int catalogNumber;
    String name;
    String prerequisites;
    String category;
    String field;

    public Course(String id, int creditHours, String subject, int catalogNumber, String name, String prerequisites, String category, String field) {
        this.id = id;
        this.creditHours = creditHours;
        this.subject = subject;
        this.catalogNumber = catalogNumber;
        this.name = name;
        this.prerequisites = prerequisites;
        this.category = category;
        this.field = field;
    }

    public String getId() {
        return id;
    }

    public int getCreditHours() {
        return creditHours;
    }

    public String getSubject() {
        return subject;
    }

    public int getCatalogNumber() {
        return catalogNumber;
    }

    public String getName() {
        return name;
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
}
