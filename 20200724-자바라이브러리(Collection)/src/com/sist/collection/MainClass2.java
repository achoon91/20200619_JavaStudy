package com.sist.collection;
/*
 *    제네릭스 타입 : 전체의 데이터형을 변경 
 *     <String>  ==> Object => String으로 변경
 *     T=> 타입 임시 데이터형 
 *    class Box<T>
 *    {
 *        T t;
 *        public void setT(T t)
 *        {
 *           this.t=t;
 *        }
 *        public T getT()
 *        {
 *           return t;
 *        }
 *    }
 *    
 *    Box<String> box=new Box<String>()
 */
import java.util.*;
class Movie
{
	private int mno;
	private String title;
	private String director;
	private String actor;
	public int getMno() {
		return mno;
	}
	public void setMno(int mno) {
		this.mno = mno;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public String getActor() {
		return actor;
	}
	public void setActor(String actor) {
		this.actor = actor;
	}
	
}
public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ArrayList<Movie> list=new ArrayList<Movie>();
        //list.
	}

}