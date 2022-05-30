package day09;
/*
 set
 -순서를 유지하지 않는다
 -중복된 값은 허용하지 않음
 */

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Ex01 {
public static void main(String[] args) {
	ArrayList arr = new ArrayList();
	arr.add("홍길동"); arr.add("홍길동");
			System.out.println("arr: "+arr);
			
			HashSet hs  = new HashSet();  //중복을 허용하지 않는다
			hs.add("홍길동"); hs.add("김개똥");
			hs.add("홍길동");  //알아서 중복이 허용이 안된다
			System.out.println(hs.remove("홍길동"));  //삭제가 잘 되면 트루출력
			System.out.println("hs: "+hs);
			
			hs.add("홍길동");
			//System.out.println(arr.get(0));
			//System.out.println(hs.ge);//순서가 없어서 겟으로 가지고 오는게 안됨

//it=[bof,'홍길동','홍길동',eof]//bof는 시작점입니다. eof 더이상 데이터가 없습니다.
	 //it		최초위치(bof)
	//     it		next를 이용해서 bof자리에서 이동함 
	Iterator it = arr.iterator();	
	
	while(it.hasNext()==true) {
		System.out.println(it.next());
	}
	/*
	System.out.println(it.hasNext()); //다음 값이 있는지 존재여부만 확인
	System.out.println(it.next()); //next를 만나면 다음 위치로 이동 && 해당 위치의 내용출력
			
			
	System.out.println(it.hasNext()); 		
	System.out.println(it.next());	
	
	System.out.println(it.hasNext()); 
	//System.out.println(it.next());	다음 데이터가 없어서 에러발생

	*/
	
	
	it = hs.iterator(); //반복자
	while(it.hasNext()) {
		Object s = it.next();
		String st = (String) s; //형변환을 하여 쓸 수 있다
		System.out.println(s);
	}
	
	Scanner sc = new Scanner(System.in);
	String s1= sc.next();
	System.out.println(s1);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
}
