package employee;


import java.util.*;


class customermain
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

public class customer {
	
	public static void main(String[] args) {
		customermain c=new customermain();
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter details:");
			String s=sc.next();
			
			String[] values=s.split(",");
			 String name=values[0];
			 String address=values[1];
			 String mobile=values[2];
			 c.setName(name);
			 c.setAddress(address);
			 c.setMobile(mobile);
		}
		System.out.println(c);
		
		
	}

}
