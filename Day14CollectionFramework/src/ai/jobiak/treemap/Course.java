package ai.jobiak.treemap;

import java.util.Objects;



public class Course implements Comparable{
private String courseId;
private String title;
private int durationHours;
private double fees;
public Course() {

}
public Course(String courseId, String title, int durationHours, double fees) {
	super();
	this.courseId = courseId;
	this.title = title;
	this.durationHours = durationHours;
	this.fees = fees;
}
public String getCourseId() {
	return courseId;
}
public void setCourseId(String courseId) {
	this.courseId = courseId;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public int getDurationHours() {
	return durationHours;
}
public void setDurationHours(int durationHours) {
	this.durationHours = durationHours;
}
public double getFees() {
	return fees;
}
public void setFees(double fees) {
	this.fees = fees;
}

@Override
public int hashCode() {
	return Objects.hash(courseId, durationHours, fees, title);
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Course other = (Course) obj;
	return Objects.equals(courseId, other.courseId) && durationHours == other.durationHours
			&& Double.doubleToLongBits(fees) == Double.doubleToLongBits(other.fees)
			&& Objects.equals(title, other.title);
}
@Override
public String toString() {
	return "Course [courseId=" + courseId + ", title=" + title + ", durationHours=" + durationHours + ", fees=" + fees
			+ "]";
}
@Override
public int compareTo(Object o) {
	Course ref=(Course)o;
	if(this.courseId.compareTo(ref.getCourseId())<0) {
		return -1;
	}if(this.courseId.compareTo(ref.getCourseId())==0) {
		return 0;
	}
	if(this.courseId.compareTo(ref.getCourseId())>0) {
		return 1;
	}
	return 0;
}

}
