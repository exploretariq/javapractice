package generics;

/*class for generic type demo*/
public class MyGeneric<T> {

	T obj;

	public void add(T obj) {
		this.obj = obj;
	}

	public T get() {
		return obj;
	}

	public static void main(String[] args) {
		// this allow only to add integer
		MyGeneric<Integer> m = new MyGeneric<Integer>();
		m.add(54545);
		System.out.println(m.get());
	}

}
