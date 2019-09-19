import java.sql.*;

public class Train { // ������Train
	static Connection con; // ����Connection����
	static Statement sql; // ����Statement����
	static ResultSet res; // ����ResultSet����
	
	public Connection getConnection() { // �����ݿ����ӷ���
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/test?user=root&password=qwerty");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return con; // ����Connection����
	}
	
	public static void main(String[] args) { // ������
		Train c = new Train(); // �����������
		con = c.getConnection(); // ��ȡ�����ݿ������
		try { // try��䲶׽�쳣
			sql = con.createStatement(); // ʵ����Statement����
			res = sql
					.executeQuery("select * from customers where cust_name like '%i%'");// ִ��SQL���
			while (res.next()) { // �����ǰ��¼���ǽ�����е����һ��������ѭ����
				String id = res.getString(1); // ��ȡid�ֶ�ֵ
				String name = res.getString("cust_name"); // ��ȡname�ֶ�ֵ
				String sex = res.getString("cust_address"); // ��ȡsex�ֶ�ֵ
				String birthday = res.getString("cust_city"); // ��ȡbirthday�ֶ�ֵ
				System.out.print("��ţ�" + id); // �����Ϣ
				System.out.print(" ������" + name);
				System.out.print(" �Ա�:" + sex);
				System.out.println(" ���գ�" + birthday);
			}
		} catch (Exception e) { // �����쳣
			e.printStackTrace(); // ����쳣��Ϣ
		}
	}
}
