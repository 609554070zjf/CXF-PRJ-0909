/**
 * 
 */
package edu.fjnu.cse.rest.serivce;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

/**
 * @author Javon
 * 
 * RESTful服务的studentService
 */
@Path("/studentService")
public interface StudentService {
	
	/**
	 * 通过学号查找学生
	 * @param stuNo 学生学号
	 * @return 学生对象（JSON字符串）
	 */
	@GET
    @Path("/student/{stuNo}")
	@Produces({"application/json"})
	public String loadStudentByStuNo(@PathParam("stuNo") String stuNo);

}
