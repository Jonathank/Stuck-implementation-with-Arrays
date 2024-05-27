package stackClasses;

@SuppressWarnings("hiding")
public class ArrayStack<T> implements Stack<T>{

	public static final int CAPACITY = 1000;
	
	private T []data;
	
	private int t = -1;
	private int size = 0;
	
	//constructs array with default capacity
	public ArrayStack() {
		this(CAPACITY);
	}
	//constructs array object with user capacity need
	@SuppressWarnings("unchecked")
	public ArrayStack(int capacity) {
		data = (T []) new Object[capacity];
	}
	
	@Override
	public int size() {
		return (t + 1);
	}

	@Override
	public boolean isEmpty() {
		return (t == -1);
	}

	@Override
	public void push(T value) throws IllegalStateException{
		if(size == data.length) throw new IllegalStateException("stack is full");
		data[++t] = value;
	}

	@Override
	public T top() {
		if(isEmpty())
			return null;
		return data[t];
	}

	@Override
	public T pop() {
		if(isEmpty())
			return null;
		T val = data[t];
		data[t] = null;
		t--;
		return val;
	}
	
	
}
