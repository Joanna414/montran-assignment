package com.montran.main;

import com.montran.pojo.Time;

public class TimeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Time time1 = new Time();
		time1.settime(12,55);
		Time time2 = new Time();
		time2.settime(12,55);
		Time time3 = new Time();
		time3 = time1.sum(time2);
		
		System.out.print("Time1 is: ");
		time1.showtime();
		System.out.print("Time2 is: ");
		time2.showtime();
		
		System.out.print("Sum of the time1 and time2 is: ");
		time3.showtime();
	}
	}

