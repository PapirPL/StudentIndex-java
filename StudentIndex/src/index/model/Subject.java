package index.model;


import java.util.ArrayList;
import java.util.List;

public class Subject extends AbstractModelObject {
	private String subjectName;
	private String lecturer;
	
	List<Mark> markList = new ArrayList<Mark>();
		public List<Mark> getMarks(){
			return markList;
		}

		public void addMark(Mark mark) {
			List<Mark> oldValue = markList;
			markList = new ArrayList<Mark>();
			markList.add(mark);
			firePropertyChange("marks", oldValue, markList);
		}
		public void removeMark(Mark mark){
		  List<Mark> oldValue = markList;
			markList = new ArrayList<Mark>();
			markList.remove(mark);
			firePropertyChange("marks", oldValue, markList);
		}
		public String getSubjectName() {
				return subjectName;
		}  
	  
		public void setSubjectName(String subjectName) {
			String oldValue = this.subjectName;
			this.subjectName = subjectName;
			firePropertyChange("Subject name", oldValue, this.subjectName);
		}
				public String getLecturer() {
					return lecturer;
			}
		public void setLecturer(String lecturer) {
			String oldValue = this.lecturer;
			this.lecturer = lecturer;
			firePropertyChange("Subject name", oldValue, this.lecturer);
		}

  
	private float average(ArrayList<Mark> markList){
		int sum=1;
		int i=0;
			for(Mark m : markList)
			{
				sum+=m.getScale()*m.getWeight();
				i=m.getWeight() + i;
			}
			return sum/i;
	}
}
  