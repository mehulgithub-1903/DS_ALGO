package interfaces;

public class rectangle implements polygon,equalss  {

	

	@Override
	public int sidelength(int length) {
	System.out.print("all sides not equal:");	
		return length;
	}

	@Override
	public float area(int a, int b) {
		return a*b;
	}

	@Override
	public int sumofangles(int n) {
	return (n-2)*180;
	}

}
