package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class Student {
		
		private int student_id;
		private String student_name;
		private String phone_number;
		@Autowired
		@Qualifier("employee")
		private Employee employee;
		
		public Student() {
			super();
			System.out.println("Student Object is Created");
		}
		public int getStudent_id() {
			return student_id;
		}
		public void setStudent_id(int student_id) {
			this.student_id = student_id;
		}
		public String getStudent_name() {
			return student_name;
		}
		public void setStudent_name(String student_name) {
			this.student_name = student_name;
		}
		public String getPhone_number() {
			return phone_number;
		}
		public void setPhone_number(String phone_number) {
			this.phone_number = phone_number;
		}
		public void show() {
			System.out.println("Hello Mugundhan <--Print Statement from Student Class--->");
			employee.details();
		}
		
		
		
}
