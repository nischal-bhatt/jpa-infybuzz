package Demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Demo.entity.Student;
import Demo.response.StudentResponse;
import Demo.service.StudentService;

@RestController
@RequestMapping("/api/student/")
public class StudentController {

	@Autowired
	StudentService studentService;
	
	@Value("${app.name:Default happycorbin}")
	private String appName;
	
	@GetMapping("/get")
	public StudentResponse getStudent()
	{
		StudentResponse studentResponse
		= new StudentResponse(1,"john","smith","k");
		studentResponse.setLastName("ramukavis");
		
		StudentResponse studentResponse1
		= new StudentResponse();
		studentResponse1.setLastName("maru");
		
		return studentResponse;
	}
	
	@GetMapping("/getAll")
	public List<StudentResponse> getAllStudents()
	{
		//return this.studentService.getAllStudents();
	     
		List<StudentResponse> ls = 
				new ArrayList<>();
		
		List<Student> stls =
				this.studentService.getAllStudents();
		
		for (int i =0;i<stls.size(); i++)
		{
			ls.add(new StudentResponse(stls.get(i)));
		}
		
		return ls;
	
	
	}
}
