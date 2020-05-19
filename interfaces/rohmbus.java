package interfaces;

public class rohmbus implements equalss,polygon {
	
	
	
	
	
	@Override
	public float area(int a,int b) {
			System.out.println("the area of rohmbus is:");
	return a*b/2;
	}

	@Override
	public int sumofangles(int n ) {
		return (n-2)*180;
	}

	@Override
	public int sidelength(int length) {
		System.out.println("all sides are equal");
	return length;
}

	}


