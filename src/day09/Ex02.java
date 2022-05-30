package day09;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

/*
 Map
 -키와 값으로 하나의 쌍으로 이루어져 있다
 -순서는 유지되지 않으며, 키의 중복은 허용하지 않는다
 */
public class Ex02 {
public static void main(String[] args) {
	
	
	HashMap map = new HashMap();
	map.put("선풍기","100만원");
	map.put("에어컨","50만원");
	map.put("자동차","10만원");
	
	map.put("선풍기","1000만원");
	System.out.println(map);
	
	System.out.println(map.get("선풍기")); //키를 이용하여 값을 출력
	System.out.println(map.get("자동차")); 
	System.out.println(map.get("없는값")); 
	
	
	
	System.out.println(map.containsKey("자동차"));
	System.out.println(map.containsKey("ㅁㅁㅁ"));
	
	map.remove("선풍기");
	System.out.println(map);
	
	System.out.println(map.keySet()); //해당하는 키만 가지고 옴
	
	//Set set = map.keySet();
	//Iterator it = set.iterator();
	
	Iterator it = map.keySet().iterator();  //위 두 줄을 이렇게 쓰기도 함, 순차적으로 생각하기
	//map.keyset은 set  그러므로 set.iterator();
	
	//it=[bof,자동차,선풍기,eof]
	//map=[자동차:10만원, 선풍기:100만원]
	
	 while(it.hasNext()) {
		 String s = (String) it.next();
		 System.out.println(s+" : "+map.get(s));
	 }
	
	String k = "우리집", v= "종로3가";
	map.put(k, v);
	
	Scanner input = new Scanner (System.in);
	System.out.println("찾을 값 입력: ");
	String search = input.next();
	if(map.get(search)==null) {
		System.out.println("존재하지 않는 주소");
	}else {
		System.out.println(search + " : "+ map.get(search));
	}
	 
	
	
	
	
	
	
	
	
	
	
	
}
}
