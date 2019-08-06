package dev.nardos.springmvc101.services;

import dev.nardos.springmvc101.model.Course;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@Profile(value = "map")
public class MapCoursesService implements CoursesService {

    private Map<String, Course> coursesMap;

    public MapCoursesService() {
        this.coursesMap = new HashMap<>();
        loadCourses();
    }

    private Map<String, Course> getCoursesMap() {
        return this.coursesMap;
    }

    @Override
    public List<Course> getAllCourses() {
        return new ArrayList<>(getCoursesMap().values());
    }

    @Override
    public Course getCourseById(String id) {
        return (Course) getCoursesMap().get(id);
    }

    private void loadCourses() {
        Map<String, Course> courses = getCoursesMap();
        /* Course("ID", "CREDIT_HOURS", "SUBJECT", "CATALOGNBR", "NAME", "PREPREQUISITES", "CATEGORY", "FIELD"); */
        Course course = null;
        course = new Course("CSC-435", 4, "CSC", 435, "Distributed Systems I", "CSC-403&CSC-407", "Advanced Courses", "Distributed Systems");
        courses.put(course.getId(), course);
        course = new Course("SE-459", 4, "SE", 459, "Agile Software Development", "SE-450", "Advanced Courses", "Software Development");
        courses.put(course.getId(), course);
        course = new Course("SE-480", 4, "SE", 480, "Software Architecture I", "SE-450", "Advanced Courses", "Software Architecture");
        courses.put(course.getId(), course);
        course = new Course("SE-491", 4, "SE", 491, "Software Engineering Studio", "SE-450|SE-456", "Capstone", "Software Engineering");
        courses.put(course.getId(), course);
        course = new Course("SE-430", 4, "SE", 430, "Object Oriented Modeling", "CSC-403", "Foundation Courses", "Software Engineering");
        courses.put(course.getId(), course);
        course = new Course("SE-433", 4, "SE", 433, "Software Testing and Quality Assurance", "CSC-403", "Foundation Courses", "Software Engineering");
        courses.put(course.getId(), course);
        course = new Course("SE-441", 4, "SE", 441, "Continuous Delivery and Devops", "CSC-403", "Foundation Courses", "Software Engineering");
        courses.put(course.getId(), course);
        course = new Course("SE-450", 4, "SE", 450, "Object-Oriented Software Development", "CSC-403", "Foundation Courses", "Software Engineering");
        courses.put(course.getId(), course);
        course = new Course("SE-477", 4, "SE", 477, "Software and Systems Project Management", "SE-430|ECT-455|IS-425|MIS-555|APPROPRIATE WORK EXPERIENCE", "Foundation Courses","Software Engineering,[Project Management]");
        courses.put(course.getId(), course);
        course = new Course("SE-475", 4, "SE", 475, "Managing Globally Distributed Software Development", "CSC-403", "Foundation Courses", "Project Management");
        courses.put(course.getId(), course);
        course = new Course("CSC-400", 4, "CSC", 400, "Discrete Structures for Computer Science", "", "Introductory Courses", "Introductory Courses");
        courses.put(course.getId(), course);
        course = new Course("CSC-401", 4, "CSC", 401, "Introduction to Programming", "", "Introductory Courses", "Introductory Courses");
        courses.put(course.getId(), course);
        course = new Course("CSC-402", 4, "CSC", 402, "Data Structures I", "CSC-401", "Introductory Courses", "Introductory Courses");
        courses.put(course.getId(), course);
        course = new Course("CSC-403", 4, "CSC", 403, "Data Structures II", "CSC-402", "Introductory Courses", "Introductory Courses");
        courses.put(course.getId(), course);
        course = new Course("CSC-406", 4, "CSC", 406, "Systems I", "CSC-401", "Introductory Courses", "Introductory Courses");
        courses.put(course.getId(), course);
        course = new Course("CSC-407", 4, "CSC", 407, "Systems II", "CSC-402&CSC-406", "Introductory Courses", "Introductory Courses");
        courses.put(course.getId(), course);
        course = new Course("CNS-450", 4, "CNS", 450, "Digital Forensic Techniques", "CSC-407|CNS-418", "Major Elective", "Computer Security");
        courses.put(course.getId(), course);
        course = new Course("CNS-533", 4, "CNS", 533, "Enterprise Security Infrastructure Controls and Regulatory Compliance", "CNS-440", "Major Elective", "Project Management");
        courses.put(course.getId(), course);
        course = new Course("CSC-438", 4, "CSC", 438, "Computer Animation Survey", "GPH-425|GPH-469", "Major Elective", "Software Development");
        courses.put(course.getId(), course);
        course = new Course("CSC-439", 4, "CSC", 439, "Computer Security", "CSC-407", "Major Elective", "Computer Security");
        courses.put(course.getId(), course);
        course = new Course("CSC-447", 4, "CSC", 447, "Concepts of Programming Languages", "CSC-403&CSC-406", "Major Elective", "Programming Languages and Compiler");
        courses.put(course.getId(), course);
        course = new Course("CSC-448", 4, "CSC", 448, "Compiler Design", "CSC-447", "Major Elective", "Programming Languages and Compiler");
        courses.put(course.getId(), course);
        course = new Course("CSC-461", 4, "CSC", 461, "Optimized C++","CSC-400&CSC-403&CSC-406", "Major Elective", "Software Development");
        courses.put(course.getId(), course);
        course = new Course("CSC-462", 4, "CSC", 462, "Optimized C++ Multithreading", "GAM-491|CSC-461", "Major Elective", "Software Development");
        courses.put(course.getId(), course);
        course = new Course("CSC-471", 4, "CSC", 471, "Mobile Application Development for iOS", "CSC-403&CSC-407", "Major Elective", "Software Development");
        courses.put(course.getId(), course);
        course = new Course("CSC-472", 4, "CSC", 472, "Mobile Application Development for Android", "CSC-403&CSC-407", "Major Elective", "Software Development");
        courses.put(course.getId(), course);
        course = new Course("CSC-486", 4, "CSC", 486, "Real-Time Networking (Formerly GAM 490)","CSC-461&(SE-456|SE-450)", "Major Elective", "Gaming and Entertainment Technology");
        courses.put(course.getId(), course);
        course = new Course("CSC-535", 4, "CSC", 535, "Formal Semantics of Programming Languages", "CSC-447", "Major Elective", "Programming Languages and Compiler");
        courses.put(course.getId(), course);
        course = new Course("CSC-536", 4, "CSC", 536, "Distributed Systems II", "CSC-435", "Major Elective", "Distributed Systems");
        courses.put(course.getId(), course);
        course = new Course("CSC-548", 4, "CSC", 548, "Advanced Compiler Design", "CSC-448", "Major Elective", "Programming Languages and Compiler");
        courses.put(course.getId(), course);
        course = new Course("CSC-552", 4, "CSC", 552, "Concurrent Software Development", "SE-450&CSC-407", "Major Elective", "Software Development, Distributed Systems");
        courses.put(course.getId(), course);
        course = new Course("CSC-555", 4, "CSC", 555, "Mining Big Data", "((CSC-401&(CSC-453|DSC-450)&(DSC-441|DSC-478))|(MAT-491&MAT-449))", "Major Elective", "Data Science");
        courses.put(course.getId(), course);
        course = new Course("CSC-575", 4, "CSC", 575, "Intelligent Information Retrieval", "CSC-403", "Major Elective", "Data Science");
        courses.put(course.getId(), course);
        course = new Course("DSC-423", 4, "DSC", 423, "Data Analysis and Regression (Formerly CSC 423)", "IT-403", "Major Elective", "Data Science");
        courses.put(course.getId(), course);
        course = new Course("DSC-424", 4, "DSC", 424, "Advanced Data Analysis (Formerly CSC 424)", "DSC-423|INSTRUCTOR PERMISSION", "Major Elective", "Data Science");
        courses.put(course.getId(), course);
        course = new Course("DSC-425", 4, "DSC", 425, "Time Series Analysis and Forecasting (Formerly CSC 425)", "DSC-423|MAT-456|INSTRUCTOR PERMISSION", "Major Elective", "Data Science");
        courses.put(course.getId(), course);
        course = new Course("DSC-441", 4, "DSC", 441, "Fundamentals of Data Science (Formerly IS 467)", "IT-403|DSC-423", "Major Elective", "Data Science");
        courses.put(course.getId(), course);
        course = new Course("DSC-465", 4, "DSC", 465, "Data Visualization (Formerly CSC 465)", "(IT-403|MAT-453)&(CSC-401|IT-411|MAT-449)", "Major Elective", "Data Science");
        courses.put(course.getId(), course);
        course = new Course("DSC-478", 4, "DSC", 478, "Programming Machine Learning Applications (Formerly CSC 478)", "DSC-441&CSC-401", "Major Elective", "Data Science");
        courses.put(course.getId(), course);
        course = new Course("DSC-540", 4, "DSC", 540, "Advanced Machine Learning (Formerly CSC 529)", "DSC-424&(DSC-441|DSC-484|CSC-578)", "Major Elective", "Data Science");
        courses.put(course.getId(), course);
        course = new Course("GAM-453", 4, "GAM", 453, "Tool Programming for Game Development", "CSC-461&(SE-456|SE-450)", "Major Elective", "Gaming and Entertainment Technology");
        courses.put(course.getId(), course);
        course = new Course("GAM-475", 4, "GAM", 475, "Game Engine Programming I", "CSC-461&(SE-456|SE-450)", "Major Elective", "Gaming and Entertainment Technology");
        courses.put(course.getId(), course);
        course = new Course("GAM-575", 4, "GAM", 575, "Game Engine Programming II", "GAM-475", "Major Elective", "Gaming and Entertainment Technology");
        courses.put(course.getId(), course);
        course = new Course("HCI-430", 4, "HCI", 430, "Prototyping and Implementation", "IT-411&(HCI-440|HCI-441)*", "Major Elective", "User Centered Development");
        courses.put(course.getId(), course);
        course = new Course("HCI-440", 0, "HCI", 440, "Introduction to User-Centered Design", "", "Major Elective", "User Centered Development");
        courses.put(course.getId(), course);
        course = new Course("IS-535", 4, "IS", 535, "Information Technology Investment Financial Analysis", "SE-477|IS-565|ACCT-500|IS-430|PM-430|ECT-455", "Major Elective", "Project Management");
        courses.put(course.getId(), course);
        course = new Course("IS-556", 4, "IS", 556, "Agile Enterprise Project Management", "IS-430|PM-430", "Major Elective", "Project Management");
        courses.put(course.getId(), course);
        course = new Course("IS-560", 4, "IS", 560, "Enterprise Systems", "ADVANCED STANDING", "Major Elective", "Project Management");
        courses.put(course.getId(), course);
        course = new Course("IS-565", 4, "IS", 565, "IT Outsourcing", "COMPLETION OF 5 OR MORE SoC MS LEVEL COURSES", "Major Elective", "Project Management");
        courses.put(course.getId(), course);
        course = new Course("SE-452", 4, "SE", 452, "Object-Oriented Enterprise Computing", "CSC-403", "Major Elective", "Software Development");
        courses.put(course.getId(), course);
        course = new Course("SE-453", 4, "SE", 453, "Architecture and Frameworks for Developing Client Applications", "SE-452", "Major Elective", "Software Development, User Centered Development");courses.put(course.getId(), course);
        course = new Course("SE-456", 4, "SE", 456, "Architecture of Real-Time Systems", "CSC-403", "Major Elective", "Software Architecture, Gaming and Entertainment Technology");courses.put(course.getId(), course);
        course = new Course("SE-457", 4, "SE", 457, "Service-Oriented Architecture", "SE-450|CSC-435", "Major Elective", "Software Architecture");
        courses.put(course.getId(), course);
        course = new Course("SE-482", 4, "SE", 482, "Requirements Engineering", "SE-450|SE-430", "Major Elective", "Software Development");
        courses.put(course.getId(), course);
        course = new Course("SE-525", 4, "SE", 525, "Software Security Architecture", "CSC-435&SE-450", "Major Elective", "Computer Security");
        courses.put(course.getId(), course);
        course = new Course("SE-526", 4, "SE", 526, "Software Security Assessment", "CSC-435", "Major Elective", "Computer Security");
        courses.put(course.getId(), course);
        course = new Course("SE-529", 4, "SE", 529, "Software Risk Management", "IT-403&SE-430|INSTRUCTOR PERMISSION", "Major Elective", "Project Management");
        courses.put(course.getId(), course);
        course = new Course("SE-533", 4, "SE", 533, "Software Validation and Verification", "SE-450", "Major Elective","Software Development, Programming Languages and Compiler");courses.put(course.getId(), course);
        course = new Course("SE-546", 4, "SE", 546, "Software Architecture and Design for Desktop Applications", "SE-450", "Major Elective", "User Centered Development");
        courses.put(course.getId(), course);
        course = new Course("SE-549", 4, "SE", 549, "Model-Driven Software Development", "SE-450|SE-430", "Major Elective", "Software Architecture");
        courses.put(course.getId(), course);
        course = new Course("SE-554", 4, "SE", 554, "Enterprise Component Architecture", "SE-450|SE-452", "Major Elective", "Software Architecture");
        courses.put(course.getId(), course);
        course = new Course("SE-560", 4, "SE", 560, "Structured Document Interchange and Processing", "SE-450|(CSC-301&SE-430)", "Major Elective", "Software Development");
        courses.put(course.getId(), course);
        course = new Course("SE-579", 4, "SE", 579, "Analytics and Data Mining in Software Engineering", "SE-450", "Major Elective", "Project Management");
        courses.put(course.getId(), course);
        course = new Course("SE-581", 4, "SE", 581, "Software Architecture II", "SE-480", "Major Elective", "Software Architecture");
        courses.put(course.getId(), course);
        course = new Course("SE-695", 4, "SE", 695, "Master's Research (4 or 8 credits)", "Consent of research advisor. Independent study form required. Successful completion of the foundation courses", "Major Elective", "Software Engineering Research");
        courses.put(course.getId(), course);
        course = new Course("SE-696", 4, "SE", 696, "Master's Project (4 credits)", "ADVISOR CONSENT", "Major Elective", "Software Engineering Research");
        courses.put(course.getId(), course);
        course = new Course("SE-698", 0, "SE", 698, "Master's Thesis (0 credits)", "Successful defense of a Master's Thesis", "Major Elective", "Software Engineering Research");
        courses.put(course.getId(), course);
        course = new Course("CSC-453", 4, "CSC", 453, "Database Technologies", "CSC-403", "Major Elective", "Data Science, Software Development");
        courses.put(course.getId(), course);
    }
}
