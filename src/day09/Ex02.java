package day09;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

/*
 Map
 -Ű�� ������ �ϳ��� ������ �̷���� �ִ�
 -������ �������� ������, Ű�� �ߺ��� ������� �ʴ´�
 */
public class Ex02 {
public static void main(String[] args) {
	
	
	HashMap map = new HashMap();
	map.put("��ǳ��","100����");
	map.put("������","50����");
	map.put("�ڵ���","10����");
	
	map.put("��ǳ��","1000����");
	System.out.println(map);
	
	System.out.println(map.get("��ǳ��")); //Ű�� �̿��Ͽ� ���� ���
	System.out.println(map.get("�ڵ���")); 
	System.out.println(map.get("���°�")); 
	
	
	
	System.out.println(map.containsKey("�ڵ���"));
	System.out.println(map.containsKey("������"));
	
	map.remove("��ǳ��");
	System.out.println(map);
	
	System.out.println(map.keySet()); //�ش��ϴ� Ű�� ������ ��
	
	//Set set = map.keySet();
	//Iterator it = set.iterator();
	
	Iterator it = map.keySet().iterator();  //�� �� ���� �̷��� ���⵵ ��, ���������� �����ϱ�
	//map.keyset�� set  �׷��Ƿ� set.iterator();
	
	//it=[bof,�ڵ���,��ǳ��,eof]
	//map=[�ڵ���:10����, ��ǳ��:100����]
	
	 while(it.hasNext()) {
		 String s = (String) it.next();
		 System.out.println(s+" : "+map.get(s));
	 }
	
	String k = "�츮��", v= "����3��";
	map.put(k, v);
	
	Scanner input = new Scanner (System.in);
	System.out.println("ã�� �� �Է�: ");
	String search = input.next();
	if(map.get(search)==null) {
		System.out.println("�������� �ʴ� �ּ�");
	}else {
		System.out.println(search + " : "+ map.get(search));
	}
	 
	
	
	
	
	
	
	
	
	
	
	
}
}
