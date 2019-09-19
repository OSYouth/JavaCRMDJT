package com.lzw;

interface drawTest{
	public void draw();
}

public abstract class UseCase3 {
	abstract void doit();
	public static void main(String args[]){
		Test test = new Test();
		test.doit();
		test.draw();
	}
}

class Test extends UseCase3 implements drawTest{
	public void doit(){
		System.out.println("22222");
	}
	public void draw(){
		System.out.println("3333");
	}
}