package stackClasses;

@SuppressWarnings("hiding")
public interface Stack<T> {
	int size();
	boolean isEmpty();
	void push(T value);
	T top();
	T pop();
}
