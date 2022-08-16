package students;

public class Students {
public void getStudentInfo(int id) {
	System.out.println(id);
}
public void getStudentInfo(String name) {
	System.out.println(name);
}
public void getStudentInfo(int id,String email) {
	System.out.println(id+" , "+email);
}
public void getStudentInfo(int phoneNumber,String name,String email) {
	System.out.println(phoneNumber+"  , "+name+" ,  "+email);
}
public static void main(String[] args) {
	Students stud=new Students();
	stud.getStudentInfo(24);
	stud.getStudentInfo("Padmashini");
	stud.getStudentInfo(24,"aaa1234@gmail.com");
	stud.getStudentInfo(770987653,"Padmashini","aaa1234@gmail.com" );
	
	stud.getStudentInfo(25);
	stud.getStudentInfo("Nila");
	stud.getStudentInfo(25,"nila123@gmail.com");
	stud.getStudentInfo(770987654,"Nila","nila123@gmail.com" );
}
}
