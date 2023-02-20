package org.student;

import org.department.Department;

public class Student extends Department{

	public void studentName() 
	{
		System.out.println("My Name is Jansi");
	}
	public void studentDeptName()
	{
		System.out.println("My dept name is: Electronics");
	}
	public void studentId() 
	{
		System.out.println("My id is: EC6789");
	}
	public static void main(String[] args) {
		Student sd=new Student();
		sd.departmentName();
		sd.studentDeptName();
		sd.studentId();
		sd.studentName();
		sd.collegeName();
		sd.collegeCode();
		sd.collegeRank();
		
	}
}
