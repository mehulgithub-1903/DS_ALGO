package strings;

public class box {

	int length,width,height;

	public box(int length, int width, int height) {
		super();
		this.length = length;
		this.width = width;
		this.height = height;
	}
	@Override
	public String toString() {
		return "Dimensions are "+length+" by "+width+" by "+height+" .";
	}
	
}
