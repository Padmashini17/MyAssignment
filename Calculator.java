package week2;

public class Calculator {
	public void add (int a,int b) {
		int c=a+b;
		System.out.println(c);
	}
	public void sub(int e, int f) {
		int d=e-f;
		System.out.println(d);
	}
	public void multi(double i,double j) {
double g=i*j;
System.out.println(g);
	}
	public void divide(float x,float y) {
		float z= x/y;
		System.out.println(z);
	}
	public static void main(String[] args) {
		Calculator cal=new Calculator();
		cal.add(20,20);
	
		cal.sub(99,89);
		
		cal.multi(10,5);
		cal.divide(2,5);
	}
}
	
