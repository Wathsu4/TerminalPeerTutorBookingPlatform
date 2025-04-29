package org.example;

public class Student extends User implements Notifiable{
    private String major;
    private int graduationYear;

    public Student(String name, String major, int graduationYear) {
        super(name);
        this.major = major;
        this.graduationYear = graduationYear;
    }
// add getMajor() and getGraduationYear() methods
    public String getMajor() {
        return major;
    }
    public int getGraduationYear() {
        return graduationYear;
    }

    @Override
    public String getRole(){
        return "Student";
    }

    @Override
    public String toString() {
        //super.toString() to get the basic info (ID and Name)
        return super.toString() + ", Major=" + major + ", Graduation Year=" + graduationYear + "]";
    }
    @Override
    public void notify(String message){
        System.out.println("Notification for Student" + getName() + ":" + message);
    }
}
