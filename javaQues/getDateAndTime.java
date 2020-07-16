package javaQues;

import java.time.LocalDate;
import java.time.LocalDateTime;



public class getDateAndTime {

	public static void main(String[] args) {
		  LocalDateTime current = LocalDateTime.now();
		LocalDate today =LocalDate.now();
		  System.out.println(current);
		  System.out.println(today);
	}

}
