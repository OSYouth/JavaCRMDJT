import java.util.*;

public class GetDate { // �½���
	public static void main(String[] args) { // ������
		Date dte = new Date(); // ����Date����date
		String hour = String.format("%tH", dte); // ��date���и�ʽ��
		String minute = String.format("%tM", dte);
		String second = String.format("%tS", dte);
		 // �������Ϣ
		System.out.println("�����ǣ�" + hour + "ʱ" + minute + "��"
				+ second + "��");
	}
}
