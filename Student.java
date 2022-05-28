package org.student;

import org.department.Department;

public class Student extends Department {
	
	public void studentName() {
		System.out.println("Name of the Student");
	}
	public void studentDept() {
		System.out.println("Student Department");
	}
	public void studentId() {
		System.out.println("Id of the Student");
	}

	public static void main(String[] args) {

		Student obje=new Student();
		obje.collegeCode();
		obje.collegeName();
		obje.collegeRank();
		obje.deptName();
		obje.studentDept();
		obje.studentName();
		obje.studentId();

	}

}
