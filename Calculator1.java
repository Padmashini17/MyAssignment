package week2;

public class Calculator1 {
public int add(int a,int b) {
	int c=a+b;
	return c;
	
	
}
public int sub(int e,int f) {
	int g=e-f;
	return g;
}
public double multi(double i, double j) {
	double d=i*j;
	return d ;
}
public float divide(float x,float y) {
	float z=x/y;
	return z;
}
public static void main(String[] args) {
	Calculator1 cal=new Calculator1();
int add	=cal.add(20,20);
	System.out.println(add);
int sub	=cal.sub(99,89);
	System.out.println(sub);
double multi	=cal.multi(10,5);
	System.out.println(multi);
float divide	=cal.divide(2,5);
	System.out.println(divide);
}

}
