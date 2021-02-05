package com.sist.util;
import java.util.*;
public class MainClass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r=new Random();
		int[] resDay=new int[r.nextInt(10)+5];//5~14
		
		String day="";
		for(int i=0;i<resDay.length;i++)
		{
			resDay[i]=r.nextInt(31)+1;
			day+=resDay[i]+"|";
		}
		day=day.substring(0,day.lastIndexOf("|"));
		
		System.out.println(day);
		
		String[] resdays=day.split("\\|");

		for(String s:resdays)
		{
			System.out.println(s);
		}
		System.out.println("=====StringTokenizer=====");
		StringTokenizer st=new StringTokenizer(day, "|");
		while(st.hasMoreTokens())
		{
			System.out.println(st.nextToken());
		}
		
	}

}