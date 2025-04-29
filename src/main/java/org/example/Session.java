package org.example;

public abstract class Session {
    private int sessionId;
    private Student student;
    private Mentor mentor;
    private String dateTime;

    private static int nextSessionId = 1; // Use to generate unique IDs for each new session
    public Session(Student student, Mentor mentor, String dateTime) {
        this.sessionId = nextSessionId++;
        this.student = student;
        this.mentor = mentor;
        this.dateTime = dateTime;
    }
    //getters
    public int getSessionId() {
        return sessionId;
    }
    public Student getStudent() {
        return student;
    }
    public Mentor getMentor() {
        return mentor;
    }
    public String getDateTime() {
        return dateTime;
    }

    public abstract String getType(); // Abstract method to be implemented by subclasses
    public abstract String getDetails();

    public String toString(){
        return "Session#" + sessionId + " (" + getType() + " - " + getDetails() +
                ") [Student: " + student.getName() + ", Mentor: " + mentor.getName() + "]";
    }
}
