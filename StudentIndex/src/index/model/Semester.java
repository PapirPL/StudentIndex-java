package index.model;

import java.util.ArrayList;
import java.util.List;


public class Semester extends AbstractModelObject {
	private List<Subject> subjectList = new ArrayList<Subject>();

	public List<Subject> getSubjects(){
	return subjectList;
	}

	public void addSubject(Subject subject)
	{
		List<Subject> oldValue = subjectList;
		subjectList = new ArrayList<Subject>();
		subjectList.add(subject);
		firePropertyChange("Subjects", oldValue, subjectList);
	}
 
	public void removeSubject(Subject subject)
	{
		List<Subject> oldValue = subjectList;
		subjectList = new ArrayList<Subject>();
		subjectList.remove(subject);
		firePropertyChange("Subjects", oldValue, subjectList);
	}
}