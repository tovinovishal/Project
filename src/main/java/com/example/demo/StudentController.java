package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	@GetMapping("/bin   ")
	public String homepage() {
		return  "Welcome to student list";
	}
	@GetMapping("/list")
	public List<Student> getList(){
		List<Student> detailsList=new ArrayList<>();
		detailsList.add(new Student(1,"Vishal",17));
		detailsList.add(new Student(2,"Virat",18));
		detailsList.add(new Student(3,"Siraj",73));
		return detailsList;
	}

} 
