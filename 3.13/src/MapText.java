
public class MapText { // ������
	static int age = 20; // �������������
	
	public static void map() {
		static age = 30;
		String name = "lili";
	}
	
	public static void main(String[] args) { // ������
		System.out.println(name+ "�������ǣ�"+map.age); //�������ֲ���������������������
	}
}
