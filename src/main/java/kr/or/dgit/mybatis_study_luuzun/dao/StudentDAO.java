package kr.or.dgit.mybatis_study_luuzun.dao;

import java.util.List;

import kr.or.dgit.mybatis_study_luuzun.dto.Student;

public interface StudentDAO {
	//int insertStudent(Student student);
	List<Student> selectStudentByAll();
}