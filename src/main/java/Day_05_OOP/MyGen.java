package Day_05_OOP;

public class MyGen <T> {

	T obj;
	public void add(T obj) {
		this.obj=obj;
	}

	public T get() {
		return obj;
		
	}

}
