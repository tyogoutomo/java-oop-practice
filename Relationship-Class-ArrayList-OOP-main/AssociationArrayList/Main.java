package AssociationArrayList;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Creating objects of bank and Employee class
        Bank bank = new Bank("ICICI");
        Employee emp = new Employee("Ridhi");
 
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(emp);
 
        bank.setEmployees(employees);
 
        System.out.println(emp.getEmployeeName()+ " belongs to bank "+ bank.getBankName());
	}

}
/*
 * Penjelasan
 *
 * Dalam contoh di atas, dua kelas terpisah Bank dan Karyawan dikaitkan melalui Objeknya. 
 * Bank bisa mempunyai banyak pegawai, jadi merupakan hubungan one-to-many. 
 * 
 * 
 */