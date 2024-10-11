package AggregationArrayList;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Creating object of Student class inside main()
        Student s1 = new Student("Mia", 1, "CSE");
        Student s2 = new Student("Priya", 2, "CSE");
        Student s3 = new Student("John", 1, "EE");
        Student s4 = new Student("Rahul", 2, "EE");
 
        // Creating a List of CSE Students
        ArrayList<Student> cse_students = new ArrayList<Student>();
 
        // Adding CSE students
        cse_students.add(s1);
        cse_students.add(s2);
 
        // Creating a List of EE Students
        ArrayList<Student> ee_students = new ArrayList<Student>();
 
        // Adding EE students
        ee_students.add(s3);
        ee_students.add(s4);
 
        // Creating objects of EE and CSE class inside
        // main()
        Department CSE = new Department("CSE", cse_students);
        Department EE = new Department("EE", ee_students);
 
        ArrayList<Department> departments = new ArrayList<Department>();
        departments.add(CSE);
        departments.add(EE);
        
 
        // Lastly creating an instance of Institute
        Institute institute = new Institute("BITS", departments);
 
        // Display message for better readability
        System.out.print("Total students in institute: ");
 
        // Calling method to get total number of students
        // in institute and printing on console
        System.out.println(institute.getTotalStudentsInInstitute());
        institute.viewStudents();
	}

}

/*
 * Penjelasan :
 * Dalam contoh ini, ada sebuah Lembaga yang tidak memiliki departemen seperti CSE, EE. 
 * Setiap departemen tidak punya siswa. 
 * Jadi, kita membuat kelas Institute yang memiliki referensi ke Object. 
 * Objek (yaitu Daftar Objek) dari kelas Departemen. 
 * Itu berarti kelas Institut dikaitkan dengan kelas Departemen melalui Objeknya. 
 * Dan kelas Departemen juga memiliki referensi ke Objek dari kelas Siswa yang berarti ia dikaitkan dengan kelas Siswa melalui Objeknya. 
 */
