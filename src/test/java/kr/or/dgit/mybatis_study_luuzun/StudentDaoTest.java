package kr.or.dgit.mybatis_study_luuzun;

import java.util.List;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import kr.or.dgit.mybatis_study_luuzun.dto.Student;
import kr.or.dgit.mybatis_study_luuzun.service.StudentService;

public class StudentDaoTest {
	private static StudentService studentService; 
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		studentService = studentService.getInstance();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		studentService = null;
	}

	@Test
	public void testSelectStudentByAll() {
		List<Student> lists = studentService.selectStudentByAll();
		Assert.assertNotNull(lists);
	}

}
