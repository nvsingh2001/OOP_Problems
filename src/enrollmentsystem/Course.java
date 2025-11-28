package enrollmentsystem;

import java.util.Arrays;

public class Course {
    private int courseID;
    private String[] content;
    private String faculty;
    private char grade;
    private int DurationOfCourse;
    private boolean[] attendance;

    public Course(int courseID, String[] content, String faculty, int DurationOfCourse) {
        this.courseID = courseID;
        this.content = content;
        this.faculty = faculty;
        this.DurationOfCourse = DurationOfCourse;
        this.attendance = new boolean[DurationOfCourse];
    }

    public void markAttendance(int day,boolean attendanceOfDay) {
        if(day > DurationOfCourse || day < 0) {
            System.out.println("Invalid day");
        }
        attendance[day] = attendanceOfDay;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }

    public int getCourseID() {
        return courseID;
    }

    public String[] getContent() {
        return content;
    }

    public String getFaculty() {
        return faculty;
    }

    public char getGrade() {
        return grade;
    }

    public int getDurationOfCourse() {
        return DurationOfCourse;
    }

    public boolean[] getAttendance() {
        return attendance;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseID=" + courseID +
                ", content=" + Arrays.toString(content) +
                ", faculty='" + faculty + '\'' +
                ", grade=" + grade +
                ", DurationOfCourse=" + DurationOfCourse +
                ", attendance=" + Arrays.toString(attendance) +
                '}';
    }
}
