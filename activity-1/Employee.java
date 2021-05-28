package employee;
import java.util.*;

 class EmployeeMain {
	  
	 
	String name, address, mobile;  
	  
	//Getter and setters for getting and setting properties  
	 
  
	public String getName() {  
	    return name;  
	}  
	public void setName(String name) {  
	    this.name = name;  
	}  
	public String getAddress() {  
	    return address;  
	}  
	public void setAddress(String address) {  
	    this.address = address;  
	}  
	public String getMobile() {  
	    return mobile;  
	}  
	public void setMobile(String mobile) {  
	    this.mobile = mobile;  
	}  
	  
	  
	//Overriding toString() method  
	@Override  
	public String toString() {  
	         return "Employee Details \n Name: " + name + " \n Address: " + address + " \n Mobile: " + mobile + " ";  
	    }  
	      
	}  
	//Creating main class  
	public class Employee{  
	    //main() method start  
	    public static void main(String args[]) {  
	          
	        //Creating object of EmployeeMain class  
	        EmployeeMain emp = new EmployeeMain();
	        try (Scanner sc = new Scanner(System.in)) {
				System.out.println("enter name:");
				String name=sc.nextLine();
				System.out.println("enter address:");
				String address=sc.nextLine();
				System.out.println("enter mobile:");
				String mobile=sc.nextLine();
				//Setting values to the properties  
				  
				emp.setName(name);  
				emp.setAddress(address);  
				emp.setMobile(mobile);
			}
	        //Showing Employee details  
	        System.out.println(emp);  
	          
	       
	    }  
	}  



