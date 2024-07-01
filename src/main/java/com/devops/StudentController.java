package com.devops;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	
	
	 @Autowired
	    private StudentService studentService;

	    @GetMapping("/student")
	    public List<Student> getAllStudents() {
	        return studentService.getAllStudents();
	    }

	    @PostMapping("/student")
	    public Student createStudent(@RequestBody Student student) {
	        return studentService.saveStudent(student);
	    }


}
