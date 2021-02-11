package Program9;

public class CountingNumbers {
	
	
	private Integer count;
	private Integer startingNumber;
	private Integer endingNumber;
	private Range range;
	public CountingNumbers() {
		super();
		System.out.println("No Parameterised Constructor of Counting Numbers Class.");
		
	}
	public CountingNumbers(Integer startingNumber, Integer endingNumber) {
		super();
		
		this.startingNumber = startingNumber;
		this.endingNumber = endingNumber;
	}
	public Integer getCount() {
		return count;
	}
	public Integer getStartingNumber() {
		return startingNumber;
	}
	public void setStartingNumber(Integer startingNumber) {
		this.startingNumber = startingNumber;
	}
	public Integer getEndingNumber() {
		return endingNumber;
	}
	public void setEndingNumber(Integer endingNumber) {
		this.endingNumber = endingNumber;
	}
	public void initMethod() {
		System.out.println("Init Method");
	}
	public void destroyMethod() {
		System.out.println("Destroy Method");
	}
	public Integer countNumbers() {
		return endingNumber - startingNumber;
	}
	public Range getRange() {
		return range;
	}
	public void setRange(Range range) {
		this.range = range;
	}
	@Override
	public String toString() {
		return "CountingNumbers [count=" + count + ", startingNumber=" + startingNumber + ", endingNumber="
				+ endingNumber + ", range=" + range + "]";
	}
}
