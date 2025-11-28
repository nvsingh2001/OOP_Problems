package enrollmentsystem;

import java.math.BigInteger;

public class Student {
    private final int id;
    private String name;
    private String phoneNumber;
    private String Address;
    private final Course[]  coursesEnrolledIn;
    private int numberOfCourses;
    private String gender;

    public Student(int id, String name, String phoneNumber, String Address, String gender) {
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.Address = Address;
        this.coursesEnrolledIn = new Course[10];
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getAddress() {
        return Address;
    }

    public String getGender() {
        return gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setAddress(String address) {
        this.Address = address;
    }

    public void enrollInCourse(Course course) {
        for (int i = 0; i < this.coursesEnrolledIn.length; i++) {
            if (this.coursesEnrolledIn[i] == null) {
                this.coursesEnrolledIn[i] = course;
                numberOfCourses++;
                break;
            }
        }
    }

    public void leaveCourse(Course course) {
        for (int i = 0; i < this.coursesEnrolledIn.length; i++) {
            if (this.coursesEnrolledIn[i] == course) {
                this.coursesEnrolledIn[i] = null;
                break;
            }
        }
    }

    public int getNumberOfCourses() {
        return numberOfCourses;
    }

    public Course[] getCoursesEnrolledIn() {
        return coursesEnrolledIn;
    }
}
