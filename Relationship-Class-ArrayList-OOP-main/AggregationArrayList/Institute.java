package AggregationArrayList;
import java.util.*;

public class Institute {
	 // Attributes of Institute
    String instituteName;
    private ArrayList<Department> departments;
 
    // Constructor of institute class
    Institute(String instituteName,ArrayList<Department> departments)
    {
        // This keyword refers to current instance itself
        this.instituteName = instituteName;
        this.departments = departments;
    }
 
    // Method of Institute class
    // Counting total students of all departments
    // in a given institute
    public int getTotalStudentsInInstitute()
    {
        int noOfStudents = 0;
        ArrayList<Student> students;
 
        for (Department dept : departments) {
            students = dept.getStudents();
 
            for (Student s : students) {
                noOfStudents++;
            }
        }
 
        return noOfStudents;
    }
    
    public void viewStudents() {
    	ArrayList<Student> students;
    	 
        for (Department dept : departments) {
            students = dept.getStudents();
            System.out.println("Department: "+dept.name);
            for (Student s : students) {
               System.out.println("- "+s.id+"-"+s.name);
            }
            System.out.println();
        }
    }
}
