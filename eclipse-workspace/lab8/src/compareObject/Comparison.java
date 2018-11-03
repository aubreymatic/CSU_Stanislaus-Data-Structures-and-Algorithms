package compareObject;

public class Comparison<T extends Comparable<T>> {
	
	public boolean lessThan(T data1, T data2) {
		if (data1.compareTo(data2) < 0) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean largerThan(T data1, T data2) {
		if (data1.compareTo(data2) > 0) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean equalTo(T data1, T data2) {
		if (data1.compareTo(data2) == 0) {
			return true;
		} else {
			return false;
		}
	}
}
