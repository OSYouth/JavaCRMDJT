public class Take { // ������
	public static void main(String[] args) {
		try { // try����а������ܳ����쳣�ĳ������
			String str = "lili"; // �����ַ�������
			System.out.println(str + "�����ǣ�"); // �������Ϣ
			int age = Integer.parseInt("20L"); // ��������ת��
			System.out.println(age);
		} catch (Exception e) { // catch����������ȡ�쳣��Ϣ
//			e.printStackTrace(); // ����쳣����
			System.out.println(e.getMessage());
			System.out.println();
			e.printStackTrace();
		}
		System.out.println("program over"); // �����Ϣ
	}
}
