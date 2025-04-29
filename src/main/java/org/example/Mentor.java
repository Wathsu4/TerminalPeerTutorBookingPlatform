package org.example;

public class Mentor extends User implements Notifiable{
    private  String expertise;
    private int yearsOfExperience;

    public Mentor(String name, String expertise, int yearsOfExperience) {
        super(name);
        this.expertise = expertise;
        this.yearsOfExperience = yearsOfExperience;
    }
    public String getExpertise() {
        return expertise;
    }
    public int getYearsOfExperience() {
        return yearsOfExperience;
    }
    @Override
    public String getRole() {
        return "Mentor";
    }
    @Override
    public String toString() {
        //super.toString() to get the basic info (ID and Name)
        return super.toString() + ", Expertise=" + expertise + ", Years of Experience=" + yearsOfExperience + "]";
    }
    @Override
    public void notify(String message) {
        System.out.println("Notification for Mentor " + getName() + ": " + message);
    }


}
