package org.student;

import org.department.Department;

public class Student extends Department {
public void studentName() {
System.out.println("Student Name");	
}
public void studentDepartment() {
	System.out.println("Student Department");
}
public void studentId() {
	System.out.println("Student Id");
}
public static void main(String[] args) {
	Student stud=new Student();
	stud.collegeName();
	stud.collegeCode();
	stud.collegeRank();
    stud.studentName();
    stud.deptName();
	stud.studentDepartment();
	stud.studentId();
	
}
}
