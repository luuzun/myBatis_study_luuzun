package kr.or.dgit.mybatis_study_luuzun.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import kr.or.dgit.mybatis_study_luuzun.dao.StudentDao;
import kr.or.dgit.mybatis_study_luuzun.dto.Student;
import kr.or.dgit.mybatis_study_luuzun.util.MybatisSqlSessionFactory;

public class StudentService {
	private static final StudentService instance= new StudentService();
	public static StudentService getInstance(){
		return instance;
	}
	private StudentService() {};
	
	public List<Student> selectStudentByAll(){
		SqlSession sqlSession = MybatisSqlSessionFactory.openSession();
		StudentDao studentDao = sqlSession.getMapper(StudentDao.class);
		//sqlSession.close();
		return studentDao.selectStudentByAll();
	}
}
