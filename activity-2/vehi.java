package activity2;

import java.util.*;
class Vehicle{
    protected String make;
    protected String vehicleNumber;
    protected String fuelType;
    protected int fuelCapacity;
    protected int cc;
    public Vehicle(String make, String vehicleNumber,String fuelType,int fuelCapacity,int cc){
        this.make = make;
        this.vehicleNumber = vehicleNumber;
        this.fuelType = fuelType;
        this.fuelCapacity = fuelCapacity;
        this.cc = cc;
    }
    public void displayMake(){
        System.out.println("***"+this.make+"***");
    }
    public void displayBasiInfo(){
        System.out.println("---Basic Information---");
        System.out.println("Vehicle Number:"+this.vehicleNumber);
        System.out.println("Fuel Capacity:"+this.fuelCapacity);
        System.out.println("Fuel Type:"+this.fuelType);
        System.out.println("CC:"+this.cc);
    }
    public void displayDetailInfo(){
        
    }
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getVehicleNumber() {
		return vehicleNumber;
	}
	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}
	public String getFuelType() {
		return fuelType;
	}
	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}
	public int getFuelCapacity() {
		return fuelCapacity;
	}
	public void setFuelCapacity(int fuelCapacity) {
		this.fuelCapacity = fuelCapacity;
	}
	public int getCc() {
		return cc;
	}
	public void setCc(int cc) {
		this.cc = cc;
	}
    
}
class TwoWheeler extends Vehicle{
    private boolean kickStartAvailable;
    
    
    public TwoWheeler(String make, String vehicleNumber, String fuelType, int fuelCapacity, int cc,boolean kickStartAvailable) {
		super(make, vehicleNumber, fuelType, fuelCapacity, cc);
		this.kickStartAvailable = kickStartAvailable;
		
	}
	public void displayDetailInfo(){
		System.out.println("---Detail Information---");
		String value = this.kickStartAvailable?"YES":"NO";
		System.out.println("Kick Start Available:"+value);
    }
	public boolean isKickStartAvailable() {
		return kickStartAvailable;
	}
	public void setKickStartAvailable(boolean kickStartAvailable) {
		this.kickStartAvailable = kickStartAvailable;
	}
}
class FourWheeler extends Vehicle{
    private String audioSystem;
    private int numberofDoors;
    
    
    public FourWheeler(String make, String vehicleNumber, String fuelType, int fuelCapacity, int cc,String audioSystem,int numberofDoors) {
		super(make, vehicleNumber, fuelType, fuelCapacity, cc);
		this.audioSystem = audioSystem;
		this.numberofDoors = numberofDoors;
	}
	public void displayDetailInfo(){
		System.out.println("---Detail Information---");
		System.out.println("Audio System:"+this.audioSystem);
		System.out.println("Number of Doors:"+this.numberofDoors);
    }
	public String getAudioSystem() {
		return audioSystem;
	}
	public void setAudioSystem(String audioSystem) {
		this.audioSystem = audioSystem;
	}
	public int getNumberofDoors() {
		return numberofDoors;
	}
	public void setNumberofDoors(int numberofDoors) {
		this.numberofDoors = numberofDoors;
	}
}


public class vehi {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1.Four Wheeler");
		System.out.println("2.Two Wheeler");
		System.out.println("Enter Vehile Type:");
		int choice = sc.nextInt();
		sc.nextLine();
		System.out.println("Vehicle Make:");
		String make = sc.nextLine();
		System.out.println("Vehicle Number:");
		String vehicleNumber = sc.nextLine();
		System.out.println("Fuel Type:\n1.Petrol\n2.Diesel");
		int Type = sc.nextInt();
		String fuelType[] = {"Petrol","Diesel"};
		System.out.println("Fuel Capacity:");
		int capacity = sc.nextInt();
		System.out.println("Engine CC:");
		int cc = sc.nextInt();
		if(choice==2) {
			sc.nextLine();
			System.out.println("Kick Start Available(yes/no):");
			String value = sc.nextLine();
			boolean kickAvailable = false;
			if(value.equalsIgnoreCase("yes")) {
				kickAvailable = true;
			}
			TwoWheeler twowheeler = new TwoWheeler(make,vehicleNumber,fuelType[Type-1], capacity,cc,kickAvailable);
			twowheeler.displayMake();
			twowheeler.displayBasiInfo();
			twowheeler.displayDetailInfo();
		}
		if(choice==1) {
			sc.nextLine();
			System.out.println("Audio System:");
			String audiotype = sc.nextLine();
			System.out.println("Number of Doors:");
			int doors = sc.nextInt();
			FourWheeler fourwheeler = new FourWheeler(make,vehicleNumber,fuelType[Type-1], capacity,cc,audiotype,doors);
			fourwheeler.displayMake();
			fourwheeler.displayBasiInfo();
			fourwheeler.displayDetailInfo();
		
		}
		sc.close();
	}

}
