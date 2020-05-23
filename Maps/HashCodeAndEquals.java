package Maps;

public class HashCodeAndEquals {

	public static void main(String[] args) {
		pen pen1=new pen(10,"blue",7);
//		pen pen2=new pen(10,"blue");
		pen pen2=new pen(10,"blue",7);
		
		System.out.println(pen1.equals(pen2));
		
	}

}
class pen{
	int price;
	int nib;
	String colour;
	
	pen(int price,String colour,int nib){
		this.price=price;
		this.colour=colour;
		this.nib=nib;;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((colour == null) ? 0 : colour.hashCode());
		result = prime * result + nib;
		result = prime * result + price;
		return result;
	}

	@Override
	public boolean equals(Object obj){
	//if they both have same reference
		if (this == obj)
			return true;
		//if pen2 is not present or null
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		pen other = (pen) obj;
		if (colour == null) {
			if (other.colour != null)
				return false;
		} else if (!colour.equals(other.colour))//if one is blue and ohter is green
			return false;
		if (nib != other.nib)
			return false;
		if (price != other.price)
			return false;
		return true;
	}
}