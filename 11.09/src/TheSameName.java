import com.test.OutInterface2;


public class TheSameName {
	private int x;
	
	private class Inner {
		private int x = 9;
		public int doit(int x) {
			x++; // 调用的是形参x
			return this.x++; // 调用内部类的变量x
//			return TheSameName.this.x++; // 调用外部类的变量x
			
		}
	}
	
	public static void main(String args[]) {
		TheSameName test = new TheSameName();
		TheSameName.Inner in = test.new Inner();
		
		System.out.println(in.x);
		System.out.println(in.doit(in.x));
		System.out.println(in.doit(0));
		}
}
