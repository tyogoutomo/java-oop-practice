package AggregationArrayList;
import java.util.*;

public class Department {
	// Attributes of Department class
    String name;
    private ArrayList<Student> students;
    Department(String name, ArrayList<Student> students)
    {
        // this keyword refers to current instance itself
        this.name = name;
        this.students = students;
    }
 
    // Method of Department class
    public ArrayList<Student> getStudents()
    {
        // Returning list of user defined type
        // Student type
        return students;
    }
}
