package employee;
import java.util.*;

class Employeeemain
{
	String name;
	String address;
	String mobile;
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
	@Override
	public String toString() {
		return " Name:" + name + "\n Address:" + address + "\n Mobile:" + mobile + " ";
	}
	
}


public class Employeee {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		Employeeemain e=new Employeeemain();
		System.out.println("Enter name:");
		String name=sc.next();
		System.out.println("Enter address:");
		String address=sc.next();
		System.out.println("Enter mobile:");
		String mobile=sc.next();
		e.setName(name);
		e.setAddress(address);
		e.setMobile(mobile);
		System.out.println("Employee Details");
		System.out.println(e);
		System.out.println("Verify and Update the  details:");
		System.out.println("Menu");
		System.out.println(" 1.Update Employee Name\n 2.Update Employee Address\n 3.Update Employee Mobile\n 4.All inforamtion are correct/exit ");
		int k=sc.nextInt();
		if(k==2)
		{
			System.out.println("Current address is:"+e.getAddress());
			sc.nextLine();
			System.out.println("Enter the address:");
			String address1=sc.next();
			e.address=address1;
			System.out.println("Menu");
			System.out.println(" 1.Update Employee Name\n 2.Update Employee Address\n 3.Update Employee Mobile\n 4.All inforamtion are correct/exit ");
			
		}
		int k1=sc.nextInt();
		if(k1==4)
		{
			System.out.println("The details are:");
			System.out.println("Name:"+e.getName());
			System.out.println("Address:"+e.getAddress());
			System.out.println("Mobile:"+e.getMobile());
			System.exit(0);
		}
		
	}

}
