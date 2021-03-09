package Greedy;

public class ObjectActivitySelection {
	private Character c;
	private Integer start;
	private Integer end;
	public ObjectActivitySelection(Character c, Integer start, Integer end) {
		super();
		this.c = c;
		this.start = start;
		this.end = end;
	}
	public Character getC() {
		return c;
	}
	public void setC(Character c) {
		this.c = c;
	}
	public Integer getStart() {
		return start;
	}
	public void setStart(Integer start) {
		this.start = start;
	}
	public Integer getEnd() {
		return end;
	}
	public void setEnd(Integer end) {
		this.end = end;
	}
	@Override
	public String toString() {
		return "ObjectActivitySelection [c=" + c + ", start=" + start + ", end=" + end + "]";
	}
	
}
