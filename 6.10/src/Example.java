import java.util.*;

public class Example { // ������
	public static void main(String[] args) { // ������
		int ia[] = new int[] { 1, 8, 9, 4, 5 }; // ����int������ia
		Arrays.sort(ia); // �������������
		int index = Arrays.binarySearch(ia, 9); // ��������ia��Ԫ��4������λ��
		System.out.println("4������λ���ǣ�" + index); // ���������
		for(int i=0;i<ia.length;i++)
		System.out.println(ia[i]);
	}
}
