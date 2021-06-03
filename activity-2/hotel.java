package activity2;

import java.util.*;
class HotelRoom{
 protected String hotelname;
 protected int numofsqfeet;
 protected boolean hastv;
 protected boolean haswifi;
public HotelRoom(String hotelname, int numofsqfeet, boolean hastv, boolean haswifi) {

this.hotelname = hotelname;
this.numofsqfeet = numofsqfeet;
this.hastv = hastv;
this.haswifi = haswifi;
}
public int calculatetariff()
{
return getNumofsqfeet()*getratepersqfeet();
}

public int getratepersqfeet()
{
return 0;
}
public String getHotelname() {
return hotelname;
}
public void setHotelname(String hotelname) {
this.hotelname = hotelname;
}
public int getNumofsqfeet() {
return numofsqfeet;
}
public void setNumofsqfeet(int numofsqfeet) {
this.numofsqfeet = numofsqfeet;
}
public boolean isHastv() {
return hastv;
}
public void setHastv(boolean hastv) {
this.hastv = hastv;
}
public boolean isHaswifi() {
return haswifi;
}
public void setHaswifi(boolean haswifi) {
this.haswifi = haswifi;
}
 
 
}
 class DeluxRoom extends HotelRoom
 {
private int ratepersqfeet;

public DeluxRoom(String hotelname, int numofsqfeet, boolean hastv, boolean haswifi) {
super(hotelname, numofsqfeet, hastv, haswifi);
this.ratepersqfeet=10;
}


public int getratepersqfeet()
{

if(haswifi)
{
return this.ratepersqfeet+2;
}
return this.ratepersqfeet;
}
public int calculatetariff()
{
return getNumofsqfeet()*getratepersqfeet();
}


 }

class DeluxACRoom extends HotelRoom
{
private int ratepersqfeet;

public DeluxACRoom(String hotelname, int numofsqfeet, boolean hastv, boolean haswifi) {
super(hotelname, numofsqfeet, hastv, haswifi);
this.ratepersqfeet=12;
}

public int getratepersqfeet()
{


return this.ratepersqfeet;
}
public int calculatetariff()
{
return getNumofsqfeet()*getratepersqfeet();
}

}

class SuiteACRoom extends HotelRoom
{
private int ratepersqfeet;

public SuiteACRoom(String hotelname, int numofsqfeet, boolean hastv, boolean haswifi) {
super(hotelname, numofsqfeet, hastv, haswifi);
this.ratepersqfeet=15;
}

public int getratepersqfeet()
{


if(haswifi)
{
return this.ratepersqfeet+2;
}
return this.ratepersqfeet;
   
}
public int calculatetariff()
{
return getNumofsqfeet()*getratepersqfeet();
}


}

public class hotel{
public static void main(String[] args) {
@SuppressWarnings("resource")
Scanner sc=new Scanner(System.in);


System.out.println("Hotel Tarrif Calculator");
System.out.println("1.Delux Room\n2.Delux AC Room\n3.Suite AC Room");
System.out.println("Select Room Type:");
int k=sc.nextInt();
sc.nextLine();
System.out.println("Hotel name");
String hotelname=sc.nextLine();
System.out.println("Room Square Feet Area:");
int numofsqfeet=sc.nextInt();
sc.nextLine();
System.out.println("Room has TV(yes/no)");
String Hastv=sc.nextLine();
boolean hastv = Hastv.equalsIgnoreCase("yes")?true:false;
System.out.println("Room has wifi(yes/no)");
String Haswifi=sc.nextLine();
boolean haswifi = Haswifi.equalsIgnoreCase("yes")?true:false;
DeluxRoom deluxeroom = new DeluxRoom(hotelname,numofsqfeet,hastv,haswifi);
deluxeroom.setHotelname(hotelname);
deluxeroom.setNumofsqfeet(numofsqfeet);
deluxeroom.setHastv(hastv);
deluxeroom.setHaswifi(haswifi);
DeluxACRoom deluxeacroom = new DeluxACRoom(hotelname,numofsqfeet,hastv,haswifi);
deluxeacroom.setHotelname(hotelname);
deluxeacroom.setNumofsqfeet(numofsqfeet);
deluxeacroom.setHastv(hastv);
deluxeacroom.setHaswifi(haswifi);
SuiteACRoom suiteacroom = new SuiteACRoom(hotelname,numofsqfeet,hastv,haswifi);
suiteacroom.setHotelname(hotelname);
suiteacroom.setNumofsqfeet(numofsqfeet);
suiteacroom.setHastv(hastv);
suiteacroom.setHaswifi(haswifi);
if(k==1)
{

System.out.println("Room tarriff per day is:"+deluxeroom.calculatetariff());
}
else if(k==2)
{
System.out.println("Room tarriff per day is:"+deluxeacroom.calculatetariff());
}
else if(k==3)
{
    
System.out.println("Room tarriff per day is:"+suiteacroom.calculatetariff());
}
}

}