import java.util.*;
public class Text {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		for(int i = 1 ;i<=100;i++){
			list.add(new Integer(i));
			}
		System.out.println(list.get(10));
		list.remove(list.get(10));
		System.out.println(list.get(10));
		System.out.println("ok");
	}
}
