import java.awt.*;

import javax.swing.*;

public class Example1 extends JFrame {
	private static final long serialVersionUID = 1L;

// ����һ����̳�JFrame��
	public void CreateJFrame(String title) { // ����һ��CreateJFrame()����
		JFrame jf = new JFrame(title); // ʵ����һ��JFrame����
		Container container = jf.getContentPane(); // ��ȡһ������
//		Container test = new JFrame(title);
		JLabel jl = new JLabel("����һ��JFrame����"); // ����һ��JLabel��ǩ
//		JLabel j2 = new JLable("haha");
		// ʹ��ǩ�ϵ����־���
		jl.setHorizontalAlignment(SwingConstants.LEFT);
		container.add(new JButton("anniu"));
		container.add(jl); // ����ǩ��ӵ�������

		container.setBackground(Color.red);//���������ı�����ɫ
		jf.setVisible(true); // ʹ�������
		jf.setSize(400, 150); // ���ô����С
		// ���ô���رշ�ʽ
		jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}
	
	public static void main(String args[]){//���������е���createJFrame()����
		new Example1().CreateJFrame("hello world");
	}
}
