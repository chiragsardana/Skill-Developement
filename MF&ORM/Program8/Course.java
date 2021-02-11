package Program8;

public class Course {
	private Integer courseNo;
	private String description;
	private Integer noOfCredits;
	private Integer departmentNo;
	
	public Course(Integer courseNo, String description, Integer noOfCredits, Integer departmentNo) {
		super();
		this.courseNo = courseNo;
		this.description = description;
		this.noOfCredits = noOfCredits;
		this.departmentNo = departmentNo;
	}
	
	public Course() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Course [ courseNo=" + courseNo + ", description=" + description + ", noOfCredits=" + noOfCredits
				+ ", departmentNo=" + departmentNo + "]";
	}

	public Integer getCourseNo() {
		return courseNo;
	}

	public void setCourseNo(Integer courseNo) {
		this.courseNo = courseNo;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getNoOfCredits() {
		return noOfCredits;
	}

	public void setNoOfCredits(Integer noOfCredits) {
		this.noOfCredits = noOfCredits;
	}

	public Integer getDepartmentNo() {
		return departmentNo;
	}

	public void setDepartmentNo(Integer departmentNo) {
		this.departmentNo = departmentNo;
	}
	
	

}
