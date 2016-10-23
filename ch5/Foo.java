package ch5;

public class Foo {
	private int biz;
	
	public Foo (){
		biz = 0;
	}
	
	public int incrementBiz(){
		return biz++;
	}
	
	public int getBiz(){
		return biz;
	}
	
	public String toString(){
		return "Available biz: "+biz;
	}
}
