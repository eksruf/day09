package day09;
/*
 set
 -������ �������� �ʴ´�
 -�ߺ��� ���� ������� ����
 */

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Ex01 {
public static void main(String[] args) {
	ArrayList arr = new ArrayList();
	arr.add("ȫ�浿"); arr.add("ȫ�浿");
			System.out.println("arr: "+arr);
			
			HashSet hs  = new HashSet();  //�ߺ��� ������� �ʴ´�
			hs.add("ȫ�浿"); hs.add("�谳��");
			hs.add("ȫ�浿");  //�˾Ƽ� �ߺ��� ����� �ȵȴ�
			System.out.println(hs.remove("ȫ�浿"));  //������ �� �Ǹ� Ʈ�����
			System.out.println("hs: "+hs);
			
			hs.add("ȫ�浿");
			//System.out.println(arr.get(0));
			//System.out.println(hs.ge);//������ ��� ������ ������ ���°� �ȵ�

//it=[bof,'ȫ�浿','ȫ�浿',eof]//bof�� �������Դϴ�. eof ���̻� �����Ͱ� �����ϴ�.
	 //it		������ġ(bof)
	//     it		next�� �̿��ؼ� bof�ڸ����� �̵��� 
	Iterator it = arr.iterator();	
	
	while(it.hasNext()==true) {
		System.out.println(it.next());
	}
	/*
	System.out.println(it.hasNext()); //���� ���� �ִ��� ���翩�θ� Ȯ��
	System.out.println(it.next()); //next�� ������ ���� ��ġ�� �̵� && �ش� ��ġ�� �������
			
			
	System.out.println(it.hasNext()); 		
	System.out.println(it.next());	
	
	System.out.println(it.hasNext()); 
	//System.out.println(it.next());	���� �����Ͱ� ��� �����߻�

	*/
	
	
	it = hs.iterator(); //�ݺ���
	while(it.hasNext()) {
		Object s = it.next();
		String st = (String) s; //����ȯ�� �Ͽ� �� �� �ִ�
		System.out.println(s);
	}
	
	Scanner sc = new Scanner(System.in);
	String s1= sc.next();
	System.out.println(s1);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
}
