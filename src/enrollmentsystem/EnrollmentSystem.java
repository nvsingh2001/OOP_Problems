package enrollmentsystem;

public class EnrollmentSystem {
    public static void main(String[] args){
        Student[] students = new Student[3];

        students[0] = new Student(1,"Naman Vinay Singh", "7908254373", "Jalpaiguri, West Bengal", "Male");
        students[1] = new Student(2, "Krishna Paswan", "8478534658","Jalpaiguri, West Bengal", "Male");
        students[2] = new Student(3,"Ankit Kumar", "7845783454", "Ludhaina, Punjab", "Male");

        students[0].enrollInCourse(new Maths());
        students[1].enrollInCourse(new Maths());
        students[2].enrollInCourse(new Maths());

        students[0].enrollInCourse(new History());

        students[0].getCoursesEnrolledIn()[0].markAttendance(1,true);

        System.out.println(students[0].getCoursesEnrolledIn()[0]);

    }
}
