package org.example;

public class SubjectSession extends Session{
    private String subjectName;
    public SubjectSession(Student student, Mentor mentor, String dateTime, String subjectName) {
        super(student, mentor, dateTime);
        this.subjectName = subjectName;
    }

    public SubjectSession(Student student, Mentor mentor, String dateTime) {
        super(student, mentor, dateTime);
    }

    public String getSubjectName() {
        return subjectName;
    }

    @Override
    public String getType() {
        return "Subject 1-to-1";
    }
    @Override
    public String getDetails(){
        return "Subject:" + subjectName + ", DateTime:" + getDateTime();

    }
}
