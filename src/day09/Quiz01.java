package day09;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Quiz01 {
public static void main(String[] args) {

/*
	HashMap hs = new HashMap();
	Scanner input = new Scanner (System.in);
	String menu=null;
	int a =80, v=0;
	ArrayList arr = new ArrayList();
	
	
	for (int i=0;i<a;i++) {
		
	System.out.println("1.�޴���� \n2.�޴��� ���� ���� \n3.����");
	int num = input.nextInt();
	
	switch (num) {
	case 1 : 
		while(true) {
		System.out.println("����� �޴� �Է�: ");
		menu= input.next();
		
		if(hs.containsKey(menu)==false) {
			System.out.println("�����Է�: ");
			v=input.nextInt();
			System.out.println("��ϵǾ����ϴ�.");
			hs.put(menu,v);
			
		}else  {
			System.out.println("�����ϴ� �޴��Դϴ�.");
			}	
		
		}break;
		
	case 2 :
		Iterator map = hs.keySet().iterator();
		while(map.hasNext()) {
            menu = (String)map.next();
	System.out.println(menu+" : "+hs.get(menu));
		//System.out.println(hs);
		System.out.println("1.���� \n2.���� \n3.������");
		int p =input.nextInt();
		switch(num) {
		 case 1:
			System.out.println("������ �޴��� �����ּ���: ");
			menu= input.next();
			if(hs.containsKey(menu)) {
				System.out.println("���� ���� �Է�: ");
				String newV = input.next();
				System.out.println(hs.get(menu)+"->"+newV);
				System.out.println("����");
				hs.replace(menu, newV);
			}
		 case 2:
			 System.out.println("������ �޴��� �����ּ���");
			 String rm = input.next();
			 hs.remove(rm);
		}
		break;
	case 3: 
		System.out.println("�����մϴ�.");
		System.exit(1);
	}
	
	}
	
	
	
	}*/
	
	/*
	  Scanner input = new Scanner(System.in);
    HashMap map = new HashMap();
    String name = null;
    String price = null;
    int num=0;
    while(true) {
        System.out.println("1.�޴� ���");
    	System.out.println("2.�޴��� ���� ����");		System.out.println("3.�� ��");
        System.out.print(">>> ");
	num = input.nextInt();
	if(num == 1) {
            System.out.print("�޴� �Է� : ");
            name = input.next();
	    if(map.containsKey(name)==false) {
                System.out.print("���� �Է� : ");
		price = input.next();
		map.put(name, price);
		System.out.println("��� �Ǿ����ϴ�.");
	    }else {
		System.out.println("�����ϴ� �޴� �Դϴ�");
	    }
	}
	else if(num == 2) {
	    Iterator it = map.keySet().iterator();
	    while(it.hasNext()) {
                name = (String)it.next();
		System.out.println(name+" : "+map.get(name));
	    }
	    System.out.println("1.���� 2.���� 3.������");
	    System.out.print(">>> ");
	    int choise = input.nextInt();
	    if(choise == 1) {
		System.out.print("���� �޴��̸� �Է� : ");
		name = input.next();
		if(map.containsKey(name)) {
		    System.out.print("���� ���� �Է� : ");
		    String newPrice = input.next();
		    System.out.println(map.get(name)+"->"+newPrice);
		    System.out.println("���� �ƽ��ϴ�.!!!");
		    map.replace(name, newPrice);
		}else {
		    System.out.println("�޴��� �����ϴ�!!!");
		}
	    }
	    else if(choise == 2) {
		System.out.print("������ �̸� �Է�");
		name = input.next();
		if(map.containsKey(name)) {
		    map.remove(name);
		    System.out.println(name+" ���� �ƽ��ϴ�");
		}else {System.out.println(name+"���� �̸��Դϴ�");}
	    }
	}
	else break;
}
}

	 */
	
	
	/*
	 Scanner input = new Scanner(System.in);
   int num;
   HashMap map = new HashMap();
   String name=null, price=null;
   while(true) {
      System.out.println("1.�޴� ���");
      System.out.println("2.�޴��� ���� ����");
      System.out.println("3.����");
      System.out.print(">>> : ");
      num = input.nextInt();
      switch(num) {
      case 1: 
         while(true) {
            System.out.println("�޴� �Է�");
            name = input.next();
            if( map.containsKey(name) == false ) {
               break;
            }
            System.out.println("�����ϴ� �޴�. �ٽ� �Է�");
         }
         System.out.println("���� �Է�");
         price = input.next();
         map.put(name, price);
         break;
      case 2: 
         //System.out.println(map);
         Iterator it = map.keySet().iterator();
         while(it.hasNext()) {
            String key = (String)it.next();
            System.out.println(key+" : "+map.get(key));
         }
         System.out.println("1.���� 2.���� 3.������");
         num = input.nextInt();
         if(num == 1) {
            while(true) {
               System.out.println("���� �޴� �Է�");
               name = input.next();
               if( map.containsKey(name) == true ) {
                  break;
               }
               System.out.println("�������� ���� �޴�. �ٽ� �Է�");
            }
            System.out.println("���� ���� �Է�");
            price = input.next();
            map.put(name, price);
            System.out.println("���� �Ǿ����ϴ�!!!");
         }else if(num == 2) {
            while(true) {
               System.out.println("���� �޴� �Է�");
               name = input.next();
               if( map.containsKey(name) == true ) {
                  map.remove(name);
                  System.out.println(name+"�� �����Ǿ����ϴ�");
                  break;
               }
               System.out.println("�������� ���� �޴�. �ٽ� �Է�");
            }
         }
         break;
      case 3: System.exit(1);
      }

	 */
	
	
	
	
	
	
	
}
}
