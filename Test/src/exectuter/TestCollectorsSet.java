package exectuter;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

class Student_ {
	int id;
	String name;
	int age;

	public Student_(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}
}

public class TestCollectorsSet {
	public static void main(String[] args) {
		List<Student_> studentlist = new ArrayList<Student_>();
		// Adding Students
		studentlist.add(new Student_(11, "Jon", 22));
		studentlist.add(new Student_(22, "Steve", 18));
		studentlist.add(new Student_(22, "Steve", 18));

		
		studentlist.add(new Student_(22, "Steve", 18));

		studentlist.add(new Student_(33, "Lucy", 22));
		studentlist.add(new Student_(44, "Sansa", 23));
		studentlist.add(new Student_(55, "Maggie", 18));
		// Fetching student names as List
		Set<String> names = studentlist.stream().map(n -> n.name).collect(Collectors.toSet());
		System.out.println(names);
	}
}