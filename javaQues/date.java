package javaQues;

public  class date {

int month;
int day;
int year;
public date() {
	
}
	 public date(int month,int day,int year){
		this.month=month;
		this.day=day;
		this.year=year;
	}
	
@Override
	public String toString() {
		return day+"/"+month+"/"+year;
				}
public static date AddedDate(date o1,date o2) {
	date sum =new date();
	sum.year=o1.year+o2.year;
	sum.day=o1.day+o2.day;
	sum.month=o1.month+o2.month;
	
	if(sum.month>12) {
		sum.month-=12;
		sum.year+=1;
	}
	if(sum.day>31) {
		sum.month+=1;
		sum.day-=31;
	}
		
	return sum;
	
}
}
