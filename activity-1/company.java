package employee;
import java.util.*;

class companymain
{
	String name;
	String employees;
	String teamlead;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmployees() {
		return employees;
	}
	public void setEmployees(String employees) {
		this.employees = employees;
	}
	public String getTeamlead() {
		return teamlead;
	}
	public void setTeamlead(String teamlead) {
		this.teamlead = teamlead;
	}
	@Override
	public String toString() {
		return "Name=" + name + "\nEmployees=" + employees + "\nLead=" + teamlead + " ";
	}
	
}

public class company {
	public static void main(String[] args) {
		companymain c=new companymain();
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter company name:");
		String name=sc.nextLine();
		System.out.println("Enter the employees:");
		String employees=sc.next();
		System.out.println("Enter teamlead:");
		String teamlead=sc.next();
	    String[] values=employees.split(",");
	    boolean test=false;
	    for(String element:values)
	    {
	    	if(element.equals(teamlead))
	    	{
	    		test=true;
	    		break;
	    	}
	    }
	    if(test==true)
	    {
	    	c.setName(name);
		    c.setEmployees(employees);
		    c.setTeamlead(teamlead);
	        System.out.println(c);}
	    else
	    {
	    	System.out.println("Invalid input");}
	}}
		


