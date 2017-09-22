/**
 * 
 */
package edu.fjnu.cse.rest.mapper;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import edu.fjnu.cse.rest.domain.Student;

/**
 * @author Javon
 * 
 * 测试StudentMapper
 */
public class StudentMapperTest {

	private ApplicationContext applicationContext;

	//在setUp这个方法得到spring容器
	@Before
	public void setUp() throws Exception {
		applicationContext = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
	}

	/**
	 * 测试根据学生学号查询学生
	 */
	@Test
	public void testLoadStudentById() {
		StudentMapper studentMapper = (StudentMapper)applicationContext.getBean("studentMapper");
		System.out.println(studentMapper);
		Student student = studentMapper.loadStudentById("s002");
		System.out.println(student);
	}

}
