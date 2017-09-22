/**
 * 
 */
package edu.fjnu.cse.rest.serivce;

import com.alibaba.fastjson.JSON;

import edu.fjnu.cse.rest.domain.Student;
import edu.fjnu.cse.rest.mapper.StudentMapper;

/**
 * @author Javon
 *
 */
public class StudentServiceImpl implements StudentService {
	
	private StudentMapper studentMapper;
	
	public StudentMapper getStudentMapper() {
		return studentMapper;
	}

	public void setStudentMapper(StudentMapper studentMapper) {
		this.studentMapper = studentMapper;
	}

	
	@Override
	public String loadStudentByStuNo(String stuNo) {
		Student student = studentMapper.loadStudentById(stuNo);
		String studentJsonStr = JSON.toJSONString(student);
		return studentJsonStr;
	}
	
	
}
