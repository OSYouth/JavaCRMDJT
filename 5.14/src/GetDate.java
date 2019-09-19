import java.util.*;

public class GetDate { // 新建类
	public static void main(String[] args) { // 主方法
		Date dte = new Date(); // 创建Date对象date
		String hour = String.format("%tH", dte); // 将date进行格式化
		String minute = String.format("%tM", dte);
		String second = String.format("%tS", dte);
		 // 输出的信息
		System.out.println("现在是：" + hour + "时" + minute + "分"
				+ second + "秒");
	}
}
