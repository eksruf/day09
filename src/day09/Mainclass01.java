package day09;
/*
 ����������
 -public :Ŭ���� ����, �ܺο��� ���� ����
 -private :Ŭ���� ���ο����� ���� ���� <�ܺο��� ���� �Ұ���>
 -protected: ��ӹ��� �ڽ� �Ǵ� ���ο��� ���ٰ���
 -default: ���� ��Ű�� �ȿ��� ���� ����
 */
import java.util.Scanner;
//�ڹٿ��� �����ϴ� Ʋ�� ������ �� ��
import test.Member;
//���� ������ �ִ� Ʋ�� ������ �ð�
/*
 Ŭ����: �ϳ��� Ʋ
 ��ü��� ǥ�� (������ ����)
 ù���ڰ� �빮�� = ��ü
 */
public class Mainclass01 {
public static void main(String[] args) {

	Member m= new Member();
	m.name = "ȫ�浿";
	

	Testclass01 t= new Testclass01();
	t.name= "ȫ�浿";
	t.age=20;
	System.out.println(t.name+t.age);
	
}	
}
