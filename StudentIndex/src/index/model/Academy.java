package index.model;

import java.util.ArrayList;
import java.util.List;

public class Academy extends AbstractModelObject {
	private String nameOfAcademy;
	private List<Course> courseList = new ArrayList<Course>();
	public List<Course> getCourses(){
		return courseList;
	}
	
	public Academy(String nameOfAcademy){
	this.nameOfAcademy=nameOfAcademy;
	}

	public void addCourse(Course course)
	{
	List<Course> oldValue = courseList;
	courseList = new ArrayList<Course>();
	courseList.add(course);
	firePropertyChange("Courses", oldValue, courseList);
	}

	public void removeCourse(Course course)
	{
	List<Course> oldValue = courseList;
	courseList = new ArrayList<Course>();
	courseList.remove(course);
	firePropertyChange("Courses", oldValue, courseList);
	}

	public String getNameOfAcademy() {
		return nameOfAcademy;
	}

	public void setNameOfAcademy(String nameOfAcademy) {
		this.nameOfAcademy = nameOfAcademy;
	}
}
