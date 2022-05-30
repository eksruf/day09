package day09;
/*
 접근제한자
 -public :클래스 내부, 외부에서 접근 가능
 -private :클래스 내부에서만 접근 가능 <외부에서 접근 불가능>
 -protected: 상속받은 자식 또는 내부에서 접근가능
 -default: 같은 패키지 안에서 접근 가능
 */
import java.util.Scanner;
//자바에서 제공하는 틀을 가지고 온 것
import test.Member;
//내가 가지고 있는 틀을 가지고 올게
/*
 클래스: 하나의 틀
 객체라고 표현 (참조형 변수)
 첫글자가 대문자 = 객체
 */
public class Mainclass01 {
public static void main(String[] args) {

	Member m= new Member();
	m.name = "홍길동";
	

	Testclass01 t= new Testclass01();
	t.name= "홍길동";
	t.age=20;
	System.out.println(t.name+t.age);
	
}	
}
