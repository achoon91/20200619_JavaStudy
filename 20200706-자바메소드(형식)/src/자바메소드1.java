import java.awt.Graphics;

import javax.swing.JPanel;
/*
 *     메소드 
 *     =====
 *       1) 자동으로 메모리에 저장 => 정적 메소드 
 *          => 형식 
 *          static 리턴형(결과값) 메소드명(매개변수...)
 *          {
 *               return 값
 *          }
 *       2) 프로그래머가 메모리를 만든 다음에 저장 => 인스턴스 메소드
 *          ===> new연산자를 이용하면 저장이 가능 
 *          ===> 프로그램의 중심 
 *          리턴형(결과값) 메소드명(매개변수...)
 *          {
 *              return 값
 *          }
 *       3) 메소드의 선언부만 사용  => 추상 메소드 
 *          리턴형(결과값) 메소드명(매개변수...); => 추상클래스(인터페이스)
 *          
 *       1. 메소드 형태
 *          선언부 => 메모리에 저장이 안된다 
 *          구현부 => 메모리에 저장 => 필요한 위치에서 사용이 가능 
 *          
 *          리턴형 메소드명(매개변수...) => 선언부
 *          구현부 
 *          {
 *              가공 (처리) 
 *              return 결과값 
 *          }
 *          
 *          결과값이 없는 경우에는 return을 생략이 가능 
 *          => JVM => 자동으로 return을 추가  
 *          return : 메소드가 종료하는 시점 ==> 모든 메소드에는 return이 존재 
 *          
 *          => 리턴형 (결과값) ===> 결과값은 반드시 한개만 설정 
 *                              기본형 (정수,실수...)
 *                              데이터가 여러개일 경우 
 *                              ================
 *                               => 데이터를 모아서 한번에 전송 (배열,클래스)
 *                               
 *          => 사용자 입력값(매개변수,인자,인수) ==> 사용자 요청값 
 *                   한개일 수 있고 
 *                   여러개 일 경우도 있다 ==> 매개변수는 3개 이상 초과(X)
 *                                      ======== 배열 , 클래스 
 *                   => 10명의 국어점수 => 평균 
 *                      (int a1,.....int a10) => (int[] kor)
 *          => return문 : 모든 메소드에서 반드시 사용 => 메소드 종료
 *                       위치는 상관없다 
 *                       예외) 결과값이 없는 경우에는 생략이 가능 
 */
//   결과값 ?(리턴값,반환값)  사용자로부터 받는 값?(매개변수,인자,인수...)
//   사용자로부터 정수를 입력을 받아서 => 해당 구구단을 출력 
/*
 *      1) 결과값(O) , 매개변수 (O) => 구구단을 묶어서 넘겨준다 
 *         String
 *      2) 결과값(X) , 매개변수 (O) => 메소드안에서 출력 (******)
 *         void
 */
// 메소드는 클래스안에서 만든다 
// 메소드안에 메소드는 선언할 수 없다 
import java.util.*;
public class 자바메소드1 {
    static String gugudan1(int dan)
    {
    	// 출력 
    	String gu="";
    	for(int i=1;i<=9;i++)
    	{
    		gu+=dan+"*"+i+"="+dan*i+"\n";
    	}
    	return gu;
    }
    static void gugudan2(int dan)
    {
    	// 전체 처리 ==> 출력 
    	for(int i=1;i<=9;i++)
    	{
    		System.out.printf("%d*%d=%d\n",dan,i,dan*i);
    	}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner scan=new Scanner(System.in);
		//System.out.print("정수 입력:");
		//int dan=scan.nextInt();
		// 구구단을 출력할 메소드 호출 
		//gugudan2(dan); // 메소드는 호출하면 => 항상 메소드의 시작부터 종료까지 반복해서 호출 
		//gugudan2(3);
		//gugudan2(5);
		//gugudan2(7);
		//String gu=gugudan1(9);// 메소드 수행후에 결과값을 넘겨주고 
		// 다음문장으로 넘어간다 
		//System.out.println(gu);
		for(int i=2;i<=9;i++)
		{
			String gu=gugudan1(i);// 반복적인 기능의 제거
			System.out.println(gu);
		}
        return;//메소드의 종료 ==> 자동 추가 
	}

}
