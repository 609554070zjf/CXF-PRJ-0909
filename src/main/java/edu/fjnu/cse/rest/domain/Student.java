/**
 * 
 */
package edu.fjnu.cse.rest.domain;

/**
 * @author Javon
 * 
 * 学生实体类
 */
public class Student extends ValueObject{
	
	/**学生学号**/
	private String stuNo;
	/**学生姓名**/
	private String stuName;
	/**学生性别（M:男,F:女）**/
	private String stuSex;
	/**学生地址**/
	private String stuAddress;
	
	public Student() {
		super();
	}

	public String getStuNo() {
		return stuNo;
	}

	public void setStuNo(String stuNo) {
		this.stuNo = stuNo;
	}

	public String getStuName() {
		return stuName;
	}

	public void setStuName(String stuName) {
		this.stuName = stuName;
	}

	public String getStuSex() {
		return stuSex;
	}

	public void setStuSex(String stuSex) {
		this.stuSex = stuSex;
	}

	public String getStuAddress() {
		return stuAddress;
	}

	public void setStuAddress(String stuAddress) {
		this.stuAddress = stuAddress;
	}

	@Override
	public String toString() {
		return "Student [stuNo=" + stuNo + ", stuName=" + stuName + ", stuSex="
				+ stuSex + ", stuAddress=" + stuAddress + "]";
	}
}
