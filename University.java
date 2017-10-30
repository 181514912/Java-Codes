/**
 * This class represents University and contains it's child domain classes(Course, Student, Sem, Department and Institute)
 */
package javacodes;

import java.util.*;

/**
 * This class is to represent a Student
 *
 */
class Students {

    String name = "";

    int roll = 0;

    double cgpa = 0.0;

    Students(String name, int roll, double cgpa) {
        this.name = name;

        this.roll = roll;

        this.cgpa = cgpa;
    }

    Students() {
    }

    //Student setter method
    void setstu(String name, int roll, double cgpa) {
        this.name = name;

        this.roll = roll;

        this.cgpa = cgpa;
    }

    //Student getter method
    void getstu() {
        System.out.println(name + "\t" + roll + "\t" + cgpa);
    }
}

/**
 * This class is to represent a Semester with containing students and other
 * information
 *
 */
class Sem {

    ArrayList<Students> li;

    void setsem() {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter number of Students in this Sem :");

        int n = in.nextInt();

        li = new ArrayList<Students>(n);

        String name;
        int roll;
        double cgpa;

        Students obj;

        for (int i = 0; i < n; ++i) {
            obj = new Students();

            System.out.println("Student " + (i + 1) + " :");

            System.out.print("Enter name :");

            name = in.next();

            System.out.print("Enter roll :");

            roll = in.nextInt();

            System.out.print("Enter cgpa :");

            cgpa = in.nextDouble();

            obj.setstu(name, roll, cgpa);

            li.add(obj);

        }
    }

    void showsem() {
        System.out.println("Name\tRoll\tCGPA");

        for (Students i : li) {
            i.getstu();
        }
    }
}

/**
 * This class represnts a Course in a Institute
 *
 */
class Course {

    String name;

    ArrayList<Sem> li;

    void setcourse() {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter name of this Course :");

        name = in.next();

        System.out.print("Enter number of Sem in this Course :");

        int n = in.nextInt();

        li = new ArrayList<Sem>(n);

        Sem obj;
        for (int i = 0; i < n; i++) {
            obj = new Sem();

            System.out.println("\tSemester " + (i + 1) + " :");

            obj.setsem();

            li.add(obj);

        }
    }

    void showcourse() {
        int c = 1;

        System.out.println(name);

        for (Sem i : li) {
            System.out.println("\tSemester " + c);

            i.showsem();

            c++;
        }
    }
}

/**
 * This class represents a Department in a Institute
 *
 */
class Department {

    String name;

    ArrayList<Course> li;

    void setdept() {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter name of this Department :");

        name = in.nextLine();

        System.out.print("Enter number of Courses in this Department :");

        int n = in.nextInt();

        li = new ArrayList<Course>(n);

        Course obj;

        for (int i = 0; i < n; i++) {
            obj = new Course();

            System.out.println("\tCourse " + (i + 1) + " :");

            obj.setcourse();

            li.add(obj);
        }
    }

    /*this funtion is used show the all item */
     void showdept()
    {
        int c=1;
        
        System.out.println(name);

        for (Course i : li) {
            System.out.print("\tCourse " + c + " :");

            i.showcourse();

            c++;
        }
    }
}

/**
 * This class represents an Institute
 *
 */
class Institute {

    String name;

    ArrayList<Department> li;

    void setinst() {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter name of this Institute :");

        name = in.next();

        System.out.print("Enter number of Departments in this Institute :");

        int n = in.nextInt();

        li = new ArrayList<Department>(n);

        Department obj;

        for (int i = 0; i < n; i++) {
            obj = new Department();

            System.out.println("\tDepartment " + (i + 1) + " :");

            obj.setdept();

            li.add(obj);
        }
    }

    void showinst() {
        int c = 1;

        System.out.println(name);

        for (Department i : li) {
            System.out.print("\tDepartment " + c + " :");

            i.showdept();

            c++;
        }
    }
}

/**
 * This class represents a University containing one or more Institute
 *
 */
public class University {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Welcome!");

        Institute obj = new Institute();

        obj.setinst();

        obj.showinst();
    }
}
