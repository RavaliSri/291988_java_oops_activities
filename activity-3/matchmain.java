package activity3;

import java.util.*;
abstract class Match
{
	private int currentscore;
	private float currentover;
	private int target;
	public int getCurrentscore() {
		return currentscore;
	}
	public void setCurrentscore(int currentscore) {
		this.currentscore = currentscore;
	}
	public float getCurrentover() {
		return currentover;
	}
	public void setCurrentover(float currentover) {
		this.currentover = currentover;
	}
	public int getTarget() {
		return target;
	}
	public void setTarget(int target) {
		this.target = target;
	}
	public Match(int currentscore, float currentover, int target) {
		super();
		this.currentscore = currentscore;
		this.currentover = currentover;
		this.target = target;
	}
	public abstract float calculateRunRate(int currentscore,float currentover,int target);
	public abstract int calculateBalls(int currentscore,float currentover,int target);
	public abstract void display();
	
	
}

class ODIMatch extends Match
{

	public ODIMatch(int currentscore, float currentover, int target) {
		super(currentscore, currentover, target);
		
	}
	int overs=50;
	@Override
	public float calculateRunRate(int currentscore, float currentover, int target) {
		float remainovers=overs-getCurrentover();
		int runs=getTarget()-getCurrentscore();
		return runs/remainovers;
		
		
	}
	@Override
	public int calculateBalls(int currentscore, float currentover, int target) {
		float remainovers=overs-getCurrentover();
		return (int) (remainovers*6);
	
	}
	@Override
	public void display() {
		int runs=getTarget()-getCurrentscore();
        System.out.println("Requirements:");
		System.out.println("Need "+runs+" runs in "+calculateBalls(getCurrentscore(), getCurrentover(), getTarget())+" balls");
		double d=calculateRunRate(getCurrentscore(), getCurrentover(), getTarget());
		System.out.println("Required runrate:"+String.format("%.2f",d));
	}
	
}
class TestMatch extends Match
{

	public TestMatch(int currentscore, float currentover, int target) {
		super(currentscore, currentover, target);
		
	}
	int overs=90;
	@Override
	public float calculateRunRate(int currentscore, float currentover, int target) {
		float remainovers=overs-getCurrentover();
		int runs=getTarget()-getCurrentscore();
		return runs/remainovers;
	
	}
	@Override
	public int calculateBalls(int currentscore, float currentover, int target) {
		
		float remainovers=overs-getCurrentover();
		return (int) (remainovers*6);
	}
	@Override
	public void display() {
		int runs=getTarget()-getCurrentscore();
        System.out.println("Requirements:");
        System.out.println("Need "+runs+" runs in "+calculateBalls(getCurrentscore(), getCurrentover(), getTarget())+" balls");
		double d=calculateRunRate(getCurrentscore(), getCurrentover(), getTarget());
		System.out.println("Required runrate:"+String.format("%.2f",d));
		
	}
	
}
class T20Match extends Match
{

	public T20Match(int currentscore, float currentover, int target) {
		super(currentscore, currentover, target);
		
	}
	
	int overs=20;

	@Override
	public float calculateRunRate(int currentscore, float currentover, int target) {
		float remainovers=overs-getCurrentover();
		int runs=getTarget()-getCurrentscore();
		return runs/remainovers;
		
	}

	@Override
	public int calculateBalls(int currentscore, float currentover, int target) {
		
		float remainovers=overs-getCurrentover();
		return (int) (remainovers*6);
	}

	@Override
	public void display() {
		int runs=getTarget()-getCurrentscore();
        System.out.println("Requirements:");
System.out.println("Need "+runs+" runs in "+calculateBalls(getCurrentscore(), getCurrentover(), getTarget())+" balls");
		double d=calculateRunRate(getCurrentscore(), getCurrentover(), getTarget());
		System.out.println("Required runrate:"+String.format("%.2f",d));
		
	}
}

public class matchmain {
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the match format");
		System.out.println("1.ODI\n2.T20\n3.Test");
		int k=sc.nextInt();
		System.out.println("Enter the Current score");
		int currentscore=sc.nextInt();
		System.out.println("Enter the Current over");
		int currentover=sc.nextInt();
		System.out.println("Enter the Target score");
		int target=sc.nextInt();
		
		ODIMatch o=new ODIMatch(currentscore, currentover, target);
		TestMatch t=new TestMatch(currentscore, currentover, target);
		T20Match m=new T20Match(currentscore, currentover, target);
		o.setCurrentscore(currentscore);
		o.setCurrentover(currentover);
		o.setTarget(target);
		t.setCurrentscore(currentscore);
		t.setCurrentover(currentover);
		t.setTarget(target);
		m.setCurrentscore(currentscore);
		m.setCurrentover(currentover);
		m.setTarget(target);
		if(k==1)
		{
			o.display();
		}
		if(k==2)
		{
			m.display();
		}
		if(k==3)
		{
			t.display();
		}
		
		}

}
