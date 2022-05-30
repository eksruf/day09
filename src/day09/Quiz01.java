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
		
	System.out.println("1.메뉴등록 \n2.메뉴별 가격 보기 \n3.종료");
	int num = input.nextInt();
	
	switch (num) {
	case 1 : 
		while(true) {
		System.out.println("등록할 메뉴 입력: ");
		menu= input.next();
		
		if(hs.containsKey(menu)==false) {
			System.out.println("가격입력: ");
			v=input.nextInt();
			System.out.println("등록되었습니다.");
			hs.put(menu,v);
			
		}else  {
			System.out.println("존재하는 메뉴입니다.");
			}	
		
		}break;
		
	case 2 :
		Iterator map = hs.keySet().iterator();
		while(map.hasNext()) {
            menu = (String)map.next();
	System.out.println(menu+" : "+hs.get(menu));
		//System.out.println(hs);
		System.out.println("1.수정 \n2.삭제 \n3.나가기");
		int p =input.nextInt();
		switch(num) {
		 case 1:
			System.out.println("수정할 메뉴를 적어주세요: ");
			menu= input.next();
			if(hs.containsKey(menu)) {
				System.out.println("수정 가격 입력: ");
				String newV = input.next();
				System.out.println(hs.get(menu)+"->"+newV);
				System.out.println("변경");
				hs.replace(menu, newV);
			}
		 case 2:
			 System.out.println("삭제할 메뉴를 적어주세요");
			 String rm = input.next();
			 hs.remove(rm);
		}
		break;
	case 3: 
		System.out.println("종료합니다.");
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
        System.out.println("1.메뉴 등록");
    	System.out.println("2.메뉴별 가격 보기");		System.out.println("3.종 료");
        System.out.print(">>> ");
	num = input.nextInt();
	if(num == 1) {
            System.out.print("메뉴 입력 : ");
            name = input.next();
	    if(map.containsKey(name)==false) {
                System.out.print("가격 입력 : ");
		price = input.next();
		map.put(name, price);
		System.out.println("등록 되었습니다.");
	    }else {
		System.out.println("존재하는 메뉴 입니다");
	    }
	}
	else if(num == 2) {
	    Iterator it = map.keySet().iterator();
	    while(it.hasNext()) {
                name = (String)it.next();
		System.out.println(name+" : "+map.get(name));
	    }
	    System.out.println("1.수정 2.삭제 3.나가기");
	    System.out.print(">>> ");
	    int choise = input.nextInt();
	    if(choise == 1) {
		System.out.print("변경 메뉴이름 입력 : ");
		name = input.next();
		if(map.containsKey(name)) {
		    System.out.print("수정 가격 입력 : ");
		    String newPrice = input.next();
		    System.out.println(map.get(name)+"->"+newPrice);
		    System.out.println("변경 됐습니다.!!!");
		    map.replace(name, newPrice);
		}else {
		    System.out.println("메뉴가 없습니다!!!");
		}
	    }
	    else if(choise == 2) {
		System.out.print("삭제할 이름 입력");
		name = input.next();
		if(map.containsKey(name)) {
		    map.remove(name);
		    System.out.println(name+" 삭제 됐습니다");
		}else {System.out.println(name+"없는 이름입니다");}
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
      System.out.println("1.메뉴 등록");
      System.out.println("2.메뉴별 가격 보기");
      System.out.println("3.종료");
      System.out.print(">>> : ");
      num = input.nextInt();
      switch(num) {
      case 1: 
         while(true) {
            System.out.println("메뉴 입력");
            name = input.next();
            if( map.containsKey(name) == false ) {
               break;
            }
            System.out.println("존재하는 메뉴. 다시 입력");
         }
         System.out.println("가격 입력");
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
         System.out.println("1.수정 2.삭제 3.나가기");
         num = input.nextInt();
         if(num == 1) {
            while(true) {
               System.out.println("수정 메뉴 입력");
               name = input.next();
               if( map.containsKey(name) == true ) {
                  break;
               }
               System.out.println("존재하지 않은 메뉴. 다시 입력");
            }
            System.out.println("수정 가격 입력");
            price = input.next();
            map.put(name, price);
            System.out.println("수정 되었습니다!!!");
         }else if(num == 2) {
            while(true) {
               System.out.println("삭제 메뉴 입력");
               name = input.next();
               if( map.containsKey(name) == true ) {
                  map.remove(name);
                  System.out.println(name+"은 삭제되었습니다");
                  break;
               }
               System.out.println("존재하지 않은 메뉴. 다시 입력");
            }
         }
         break;
      case 3: System.exit(1);
      }

	 */
	
	
	
	
	
	
	
}
}
