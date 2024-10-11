package AssociationArrayList;

import java.util.*;

public class Bank {
	// Attributes of bank
    private String name;
 
    private ArrayList<Employee> employees;
    // Constructor of this class
    Bank(String name)
    {
        // this keyword refers to current instance itself
        this.name = name;
    }
 
    // Method of Bank class
    public String getBankName()
    {
        // Returning name of bank
        return this.name;
    }
 
    public void setEmployees(ArrayList<Employee> employees)
    {
        this.employees = employees;
    }
    
    public ArrayList<Employee> getEmployees(ArrayList<Employee> employees)
    {
        return this.employees;
    }
}
