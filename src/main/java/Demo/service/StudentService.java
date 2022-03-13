package Demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Demo.entity.Student;
import Demo.repository.StudentRepository;

@Service
public class StudentService {

	
	@Autowired
	StudentRepository studentRepository;
	
	public List<Student> getAllStudents()
	{
		return studentRepository.findAll();
	}
	
}
