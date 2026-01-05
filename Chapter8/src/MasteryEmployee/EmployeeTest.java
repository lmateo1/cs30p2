package MasteryEmployee;

public class EmployeeTest {

	public static void main(String[] args) 
	{
		//Declare faculty and staff objects
        Faculty f = new Faculty(2147483647, "Firstname Lastname", "Department A");
        Staff s = new Staff(1, "ABCD EFG", "HIJK LMNOP");
        
        System.out.println("Faculty:\n" + "Name: " + f.getName() + "\nSalary: " + f.getSalary() + "\nDepartment: "
        		+ f.getDepart());	
        System.out.println("\nStaff:\n" + "Name: " + s.getName() + "\nSalary: " + s.getSalary() + "\nJob Title: "
        		+ s.getTitle());
    
	}

}
