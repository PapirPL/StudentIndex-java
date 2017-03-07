package index.model;


import java.util.ArrayList;
import java.util.List;
public class Course extends AbstractModelObject {
private String nameOfCourse;
private List<Semester> semesterList = new ArrayList<Semester>();// to get 1st semester get first object from list
private List<Student> studentList = new ArrayList<Student>();
	
public Course(String nameOfCourse){
		this.nameOfCourse=nameOfCourse;
	}

public String getNameOfCourse() {
	return nameOfCourse;
}
public void setNameOfCourse(String nameOfCourse) {
	String oldValue=this.nameOfCourse;
	this.nameOfCourse=nameOfCourse;
	firePropertyChange("name of Course", oldValue,this.nameOfCourse);
} 
public List<Semester> getSemesterList() {
	return semesterList;
}
public void setSemesterList(ArrayList<Semester> semesterList) {
	this.semesterList = semesterList;
}

public void addSemester(Semester semester) {
		List<Semester> oldValue = this.semesterList;
		this.semesterList = new ArrayList<Semester>();
		semesterList.add(semester);
		firePropertyChange("semester", oldValue, this.semesterList);
	}

public void removeSemester(Semester semester) {
	List<Semester> oldValue = this.semesterList;
	this.semesterList = new ArrayList<Semester>();
	semesterList.remove(semester);
	firePropertyChange("semester", oldValue, this.semesterList);
}
public List<Student> getStudentList() {
	return studentList;
}
public void setStudentList(ArrayList<Semester> semesterList) {
	this.studentList = studentList;
}

public void addStudent(Student student) {
		List<Student> oldValue = this.studentList;
		this.studentList = new ArrayList<Student>();
		studentList.add(student);
		firePropertyChange("student", oldValue, this.studentList);
	}

public void removeStudent(Student student) {
	List<Student> oldValue = this.studentList;
	this.studentList = new ArrayList<Student>();
	studentList.remove(student);
	firePropertyChange("student", oldValue, this.studentList);
}

}
