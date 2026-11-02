package comparatorInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Student {
	String name;
	int age;
	int marks;
	double cgpa;
	public Student(String name,int age,int marks,double cgpa) {
		this.name=name;
		this.age=age;
		this.marks=marks;
		this.cgpa=cgpa;
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", marks=" + marks + ", cgpa=" + cgpa + "]";
	}

	public static void main(String[] args) {
		Student s1=new Student("Ram", 20, 80, 8.5);
		Student s2=new Student("Abhi", 36, 86, 8.9);
		Student s3=new Student("Cat", 17, 78, 7.5);
		
		Comparator<Student> com=(Student a,Student b)->(a.age > b.age)?1:-1;
//		Comparator<Student> com=(Student a,Student b)->(a.name.compareTo(b.name));
		
		List<Student> list=new ArrayList<Student>(Arrays.asList(s1,s2,s3));
		Collections.sort(list,com.reversed());
		list.forEach((no)->System.out.println(no));
	}

}
