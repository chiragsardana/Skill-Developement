package Greedy;

import java.util.Comparator;

public class ObjectKnapsack{
	private Integer value;
	private Integer weight;
	private Double ratio;
	public ObjectKnapsack(Integer value, Integer weight, Double ratio) {
		super();
		this.value = value;
		this.weight = weight;
		this.ratio = ratio;
	}
	public Integer getValue() {
		return value;
	}
	public void setValue(Integer value) {
		this.value = value;
	}
	public Integer getWeight() {
		return weight;
	}
	public void setWeight(Integer weight) {
		this.weight = weight;
	}
	public Double getRatio() {
		return ratio;
	}
	public void setRatio(Double ratio) {
		this.ratio = ratio;
	}
	@Override
	public String toString() {
		return "ObjectKnapsack [value=" + value + ", weight=" + weight + ", ratio=" + ratio + "]";
	}
}
