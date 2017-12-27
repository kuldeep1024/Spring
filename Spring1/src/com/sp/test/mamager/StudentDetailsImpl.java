package com.sp.test.mamager;

import java.util.ArrayList;
import java.util.List;

import com.sp.test.model.Address;
import com.sp.test.model.Student;

public class StudentDetailsImpl implements StudentDetails {

	@Override
	public Student getStudent() {
		Student st= new Student();
		st.setR_no(1);
		st.setName("Kuldeep");
		st.setAddress("Noida");
		st.setPhone_number("123456");
		return st;
	}

	@Override
	public List<Student> studentList() {
		List<Student> list= new ArrayList<Student>();
		
		Student s2= new Student(2, "Ram", "Noida 125", "898989");
		s2.setHomeAddress(new Address());
		
		Student s3= new Student(3, "Shyam", "Noida 120", "565656");
		
		Student s4= new Student(4, "Mohan", "Noida 121", "34344");
		
		list.add(s2);
		list.add(s3);
		list.add(s4);
		
		return list;
	}

}
