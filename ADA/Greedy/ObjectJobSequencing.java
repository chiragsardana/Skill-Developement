package Greedy;

public class ObjectJobSequencing {
	private char c;
	private Integer deadline;
	private Integer profit;
	public ObjectJobSequencing(char c, Integer deadline, Integer profit) {
		super();
		this.c = c;
		this.deadline = deadline;
		this.profit = profit;
	}
	public char getC() {
		return c;
	}
	public void setC(char c) {
		this.c = c;
	}
	public Integer getDeadline() {
		return deadline;
	}
	public void setDeadline(Integer deadline) {
		this.deadline = deadline;
	}
	public Integer getProfit() {
		return profit;
	}
	public void setProfit(Integer profit) {
		this.profit = profit;
	}
	@Override
	public String toString() {
		return "ObjectJobSequencing [c=" + c + ", deadline=" + deadline + ", profit=" + profit + "]";
	}
}
