public class UpperOrLower { // ������UpperOrLower
	public static void main(String args[]) { // ������
		Character mychar1 = new Character('A'); // ����Character����
		Character mychar2 = new Character('a'); // ����Character����
		System.out.println(mychar1 + "�Ǵ�д��ĸ��? "
				+ Character.isUpperCase(mychar1));
		System.out.println(mychar2 + "��Сд��ĸ��? "
				+ Character.isLowerCase(mychar2));
		System.out.println(" "+mychar1.CONNECTOR_PUNCTUATION 
				+ " " + mychar1.UNASSIGNED 
				+ " " + mychar1.TITLECASE_LETTER);
	}
}
