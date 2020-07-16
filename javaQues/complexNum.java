package javaQues;

public class complexNum {

	@Override
	public String toString() {
		return real+"+i"+complex;
	}

	int real,complex;

	public complexNum(int real, int complex) {
		super();
		this.real = real;
		this.complex = complex;
	}
	
}
