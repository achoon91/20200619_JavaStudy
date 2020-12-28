/*
 *    선택 조건문 
 *    if(조건문)
 *    {
 *       조건문이 true면 수행하는 문장 구현
 *    }
 *    else
 *    {
 *       조건문이 false일때 수행하는 문장 구현 
 *    }
 *    
 *    조건문 ==> 핵심 (조건 제작)
 *    
 *    ===> 137page 
 *    ==  단일 
 *    <
 *    >
 *    !=
 *    ====== 조건 여러개 일 경우 
 *    &&
 *    ||
 *    ======
 *    
 *    ch>='A' && ch<='Z'
 *    ch>='0' && ch<='9'
 *    ch>='가' && ch<='R'  ==> 번호가 일률적으로 ...
 *    
 *    1,2,3,4,5,6,7,8,9
 *    1,2,5,7,9
 *    ch==1 || ch==2 || ch==5 || ch==7 || ch==9
 *    
 *    문자열 ==>  !=,== 사용하지 않는다 
 *    equals()
 *    !equals()
 *    
 */
import java.util.*;
public class 제어문_선택조건문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // 문자한개를 입력을 받아서 => 알파벳인지 여부 확인 
		// 변수설정 
		char ch='A'; // 변수 => 초기화 
		/*
		 *   int => 0
		 *   double => 0.0
		 *   long => 0L
		 *   boolean => false
		 */
		// 문자 한개 입력 
		Scanner scan=new Scanner(System.in);
		System.out.print("문자 입력:");
		//"ABC" ==> 자바는 모든 시작 번호 0부터 시작한다 
		ch=scan.next().charAt(0);
		if(ch>='0' && ch<='9')
		{
			System.out.println(ch+"는(은) 숫자입니다");
		}
		else
		{
			System.out.println(ch+"는(은) 문자입니다");
		}
		// ch>='0' && ch<='9'
		/*
		 * if((ch>='A' && ch<='Z')||(ch>='a' && ch<='z')) {
		 * System.out.println(ch+"는(은) 알파벳입니다!!"); } else {
		 * System.out.println(ch+"는(은) 알파벳이 아닙니다!!"); }
		 */
	}
}

