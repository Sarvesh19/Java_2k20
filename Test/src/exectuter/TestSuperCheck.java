package exectuter;

class _0 {
	_0(String s){
		System.out.println("parent default constru " +s);
	}
}

class _01 extends _0 {
	_01(){
		super("child super...");
		System.out.println("child default constru");
	}
}

public class TestSuperCheck {
	
	public static void main(String[] args) {
		_0 j1 = new _0("erfwef");
		_0 j2 = new _01();
		
	}

}
