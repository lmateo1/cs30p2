package MasteryEmployee;

public class EmployeeTest {

	public static void main(String[] args) 
	{
		//Declare faculty and staff objects
        Faculty f = new Faculty(100000, "Firstname Lastname", "Department A");
        Staff s = new Staff(123456, "ABC DEF", "XYZ");
        
        System.out.println("Faculty:\n" + "Name: " + f.getName() + "\nSalary: " + f.getSalary() + "\nDepartment: "
        		+ f.getDepart());	
        System.out.println("\nStaff:\n" + "Name: " + s.getName() + "\nSalary: " + s.getSalary() + "\nJob Title: "
        		+ s.getTitle());
    
	}

}
