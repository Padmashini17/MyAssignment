package week1.day2;

public class Car {
public void applyBreak() {
	System.out.println("apply break");
}
public void applyGear() {
	System.out.println("apply gear");
}
public void switchOnAc() {
	System.out.println("switch on Ac");
}
public void applyAcclerate() {
	System.out.println("apply acclerate");
}
public static void main(String[] args) {
 Car car=new Car();
	 car.applyBreak();
	 car.applyGear();
	 car.switchOnAc(); 
	 car.applyAcclerate();
}
}
 