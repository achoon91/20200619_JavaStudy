package com.sist.inter;
/*
 *    인터페이스 
 *      => 추상클래스의 일종(추상클래스 단점을 보완)
 *      => 미완성된 클래스 => 자신이 메모리 할당을 할 수 없다 (구현한 클래스를 통해서 메모리 할당)
 *      => 추상 클래스 (단일 상속) , 인터페이스 (다중 상속)
 *      => 모든 메소드가 abstract => 선언만 가능 
 *         *** JDK 1.8 => default메소드를 이용해서 메소드 구현이 가능 
 *      => 변수 (추상클래스:멤버변수 , 인터페이스 : 상수형변수)
 *           int a;  ==> int a=10;
 *      => interface A
 *         {
 *             // 변수 
 *             int a=10;  =====>  JVM (public static final int a=10)
 *                                     ===================
 *             // 메소드 
 *             void aaa(); ====> JVM (public abstract void aaa();)
 *                                    ===============
 *             int bbb();
 *         }
 *         
 *         interface A
 *         {
 *             (public abstract) void aaa();
 *         }
 *         => 구현 
 *         class B implements A
 *         {
 *             public void aaa(){
 *                
 *             }
 *         }
 *         
 *         
 *         ==> 오버라이딩 
 *         1) 상속관계
 *         2) 메소드명이 동일 
 *         3) 매개변수 동일
 *         4) 리턴형이 동일 
 *         5) 접근지정어 => 확대, 축소(X)
 *         
 *         public > protected > default > private
 *         
 *         *** 인터페이스에 선언된 모든 메소드는 public이다 
 *             인터페이스에 선언된 모든 변수는 public이다(상수) 
 *             
 *         상속 
 *         ===
 *          인터페이스 ==> 인터페이스 
 *               extends 
 *          인터페이스 ==> 클래스 
 *               implements
 *          클래스 ==> 인터페이스 
 *               error
 *               
 *          interface A
 *              K L
 *          interface B extends A
 *              P => K L
 *          class C implements B
 *              P
 *              K
 *              L 구현한다 
 *              
 *          ================================
 *          interface A
 *          interface B
 *          class C implements A,B ==> 다중상속 
 *          
 *          =================================
 *          interface A
 *          class B
 *          class C extends B implements A
 *                  =======   ==========
 *          인터페이스는 모든 메소드가 구현이 안된다 
 *          
 *          
 */
/*interface A
{
	//private int a=10;
	//protected int a=10;
	//private void aaa();
	//protected void aaa();
	void aaaa();
}*/
interface 동물{
	void eat();
	// 구현된 메소드를 제작 (JDK1.8~) => default 
	default void run() {
		System.out.println("네발로 걷는다");
	}
}
class 소 implements 동물{
	public void eat() {
		System.out.println("소같이 먹는다");
	}
}
class 개 implements 동물{

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("개같이 먹는다");
	}
	
}
class 사람 implements 동물{

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("수저로 먹는다");
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("두발로 걷는다");
	}
	
	
	
}
class 돼지 implements 동물{

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("돼지같이 먹는다");
	}
	
}
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
              동물 ani=new 소();
              ani.eat();
              ani=new 개();
              ani.eat();
              ani=new 돼지();
              ani.eat();
	}

}
