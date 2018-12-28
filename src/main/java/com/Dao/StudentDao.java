package com.Dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;


import com.model.Student;

public class StudentDao {
JdbcTemplate jdt;
public void setJdt(JdbcTemplate jdt) {
	this.jdt = jdt;
}
public int saveEmployee(Student e){

	String query="insert into student(name,age,address) values('"+e.getName()+"','"+e.getAge()+"','"+e.getAddress()+"')";
	return jdt.update(query);
}
public List getEmployees(){

	String query="select * from student";
	return jdt.queryForList(query);
}

}
