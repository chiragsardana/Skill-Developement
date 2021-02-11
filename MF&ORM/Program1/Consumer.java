package Program1;

public class Consumer {
	Producer object;
	public Consumer(Producer object) {
		this.object = object;
	}
	public void work() {
		object.first();
	}
}