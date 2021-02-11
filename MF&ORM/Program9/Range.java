package Program9;

public class Range {
	Integer range;
	public Range() {
		super();
		System.out.println("No Parameterised Constructor of Range Class.");
	}

	public Range(Integer range) {
		super();
		this.range = range;
	}

	
	
	public Integer getRange() {
		return range;
	}

	public void setRange(Integer range) {
		this.range = range;
	}

	@Override
	public String toString() {
		return "Range [range=" + range + "]";
	}
	
}
