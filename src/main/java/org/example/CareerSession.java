package org.example;

public class CareerSession extends Session{
    //A field to save what the career session is about (example: "Resume Review").
    private String topic;

    public CareerSession(Student student, Mentor mentor, String dateTime, String topic) {
        super(student, mentor, dateTime);
        this.topic = topic;
    }

    public String getTopic() {
        return topic;
    }

    @Override
    public String getType() {
        return "Career Coaching";
    }
    @Override
    public String getDetails(){
        return "Topic:" + topic + ", DateTime:" + getDateTime();
    }
}
