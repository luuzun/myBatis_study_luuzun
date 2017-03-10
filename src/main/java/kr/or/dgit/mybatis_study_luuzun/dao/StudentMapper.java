package kr.or.dgit.mybatis_study_luuzun.dao;

import java.util.List;

import kr.or.dgit.mybatis_study_luuzun.dto.Student;

public interface StudentMapper {
	int insertStudent(Student student);
	List<Student> selectStudentByAll();
	Student selectStudentByNo(int studNo);

	int insertStudentWithPhone(Student student); //typehandler Ex
}
