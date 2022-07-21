package week1.day2;

public class MobilePhone {
int ramSize=8;
long imeiNumber=43567100;
boolean isCharged=true;
String brandName="oppo";
String modelName="F15";
double mobilePrice=25000;
public static void main(String[] args) {
	MobilePhone mobile=new MobilePhone();
	int ramSize=8;
	System.out.println("Ram Size    :"+ramSize);
	long imeiNumber=43567100;
	System.out.println("Imei Number :"+ imeiNumber);
	boolean isCharged=true;
	System.out.println("Is Charged  :"+isCharged);
	String brandName="oppo";
	System.out.println("Brand Name  :"+brandName);
	String modelName="F15";
	System.out.println("Model Name  :"+modelName);
	double mobilePrice=25000;
	System.out.println("MobilePrice :"+mobilePrice);
}
}


