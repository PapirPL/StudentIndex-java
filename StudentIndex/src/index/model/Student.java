package index.model;

import java.util.ArrayList;
import java.util.List;

public class Student extends AbstractModelObject{
private String name;
private String surname;
private String pesel;
private String age;



public Student(String name,String surname,String pesel,String age,ArrayList<Course> courses)
{
 
 this.name=name;
 this.pesel=pesel;
 this.age=age;
 this.surname=surname;
}

public String getName() {
	return name;
}

public void setName(String name) {
	String oldValue=this.name;
	this.name=name;
	firePropertyChange("name",oldValue,name);
}

public String getSurname() {
	return surname;
}

public void setSurname(String surname) {
	String oldValue=this.surname;
	this.surname=surname;
	firePropertyChange("surname",oldValue,surname);
}

public String getPesel() {
	return pesel;
}

public void setPesel(String pesel) {
	String oldValue=this.pesel;
	this.pesel=pesel;
	firePropertyChange("pesel",oldValue,pesel);
}

public String getAge() {
	return age;
}

public void setAge(String age) {
	String oldValue=this.age;
	this.age=age;
	firePropertyChange("age",oldValue,age);
}

}