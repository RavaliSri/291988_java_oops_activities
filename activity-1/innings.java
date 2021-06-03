package employee;

import java.util.*;
class inningsmain
{
       String teamname;
       String inningsname;
       int runs;
           
      public String getTeamname() {
		return teamname;
	}

	public void setTeamname(String teamname) {
		this.teamname = teamname;
	}

	public String getInningsname() {
		return inningsname;
	}

	public void setInningsname(String inningsname) {
		this.inningsname = inningsname;
	}

	public int getRuns() {
		return runs;
	}

	public void setRuns(int runs) {
		this.runs = runs;
	}

	public void DisplayInningsDetails()
      {
            String o=getInningsname();
            if(o.equals("Second"))
           {
                       System.out.println("Name : "+getTeamname());
                       System.out.println("Scored : "+getRuns());
                       System.out.println("Match Ended");
           }
           else if(o.equals("First"))
           {
                       System.out.println("Name : "+getTeamname());
                       System.out.println("Scored : "+getRuns());
                       System.out.println("Need "+(getRuns()+1)+" to win");
           }
           
      }
}

public class innings
{
      public static void main(String[] args)
      {
            
            @SuppressWarnings("resource")
			Scanner sc=new Scanner(System.in);
            System.out.println("Enter the team name:");
            String teamname=sc.nextLine();
            System.out.println("Enter session:");
            String inningsname=sc.nextLine();
            System.out.println("Enter runs:");
            int runs=sc.nextInt();
            inningsmain n=new inningsmain();
            n.setTeamname(teamname);
            n.setInningsname(inningsname);
            n.setRuns(runs);
            n.DisplayInningsDetails();
      }
}
