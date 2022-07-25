package week2;

public class EmployeeDetails {

	public void printEmployeeName(String empName,int empid) {
		System.out.println(empName);
		System.out.println(empid);
	}
	public void getEmployeeAddress(String empAddress) {
		System.out.println(empAddress);
	}
	public void printEmployeeSalary(double empsalary) {
		System.out.println(empsalary);
	}
	public void printEmployeeMobileNumber(long mobnum) {
		System.out.println(mobnum);
	}
	public static void main(String[] args) {
		EmployeeDetails emp=new EmployeeDetails();
		emp.printEmployeeName("Padmashini",11);
		emp.getEmployeeAddress("Thanjavur");
		emp.printEmployeeSalary(50000);
		emp.printEmployeeMobileNumber(9047536376L);
		
	}
}
	
	
