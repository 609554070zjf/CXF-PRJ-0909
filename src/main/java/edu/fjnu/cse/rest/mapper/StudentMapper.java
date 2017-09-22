/**
 * 
 */
package edu.fjnu.cse.rest.mapper;

import edu.fjnu.cse.rest.domain.Student;

/**
 * @author Javon
 * 
 * 学生Mapper接口
 */
public interface StudentMapper {
	
	/**
	 * 根据学生学号获取学生
	 * @param stuNo 学生学号
	 * @return 学生对象
	 */
	Student loadStudentById(String stuNo);
}
