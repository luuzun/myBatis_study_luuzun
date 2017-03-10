package kr.or.dgit.mybatis_study_luuzun.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import kr.or.dgit.mybatis_study_luuzun.dao.StudentMapper;
import kr.or.dgit.mybatis_study_luuzun.dto.Student;
import kr.or.dgit.mybatis_study_luuzun.util.MybatisSqlSessionFactory;

public class StudentService implements StudentMapper{
	private static final StudentService instance= new StudentService();
	public static StudentService getInstance(){
		return instance;
	}
	private StudentService() {};
	
	@Override
	public List<Student> selectStudentByAll(){
		SqlSession sqlSession = MybatisSqlSessionFactory.openSession();
		StudentMapper studentDao = sqlSession.getMapper(StudentMapper.class);
		//sqlSession.close();
		return studentDao.selectStudentByAll();
	}
	
	@Override
	public int insertStudent(Student student){
		SqlSession sqlSession = MybatisSqlSessionFactory.openSession();
		StudentMapper studentDao = sqlSession.getMapper(StudentMapper.class);
		int res = studentDao.insertStudent(student);
		sqlSession.commit();
		return res;
	}
	
	@Override
	public Student selectStudentByNo(int studNo) {
		SqlSession sqlSession = MybatisSqlSessionFactory.openSession();
		StudentMapper studentDao = sqlSession.getMapper(StudentMapper.class);
		return studentDao.selectStudentByNo(studNo);
	}
	
	@Override
	public int insertStudentWithPhone(Student student) {
		int res = -1;
		try(SqlSession sqlSession = MybatisSqlSessionFactory.openSession();){
			StudentMapper studentDao = sqlSession.getMapper(StudentMapper.class);
			res = studentDao.insertStudentWithPhone(student);
			sqlSession.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return res;
	}
}
