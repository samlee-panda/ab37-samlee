package arryas_program;

import java.util.Date;

public class Date_assignment {

	public static void main(String[] args) 
	{
		Date d1= new Date();
		System.out.println(d1.getTime());
		//1000>mili sec,60>sec,60>min,24>hours in a day,1>day
		Date d2= new Date(d1.getTime()+(1000*60*60*24*1));// this how you can print future date
		//if you want to print previous date put "-" instead of "+"
		System.out.println(d2);
		String date=d2.toString();
		String year=date.substring(24);
		System.out.println("year is: " +year);
		
		String month=date.substring(4, 8);
		System.out.println("month is: " +month );
		
		String day= date.substring(0, 4);
		System.out.println("day is: " +day);
		
		String dat= date.substring(8, 11);
		System.out.println("date is: " +dat);
		
		System.out.println(dat.concat(month).concat(year));// this how you can print ist date time and month

	}

}
