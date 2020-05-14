package exectuter;

import java.lang.reflect.Field;
import java.util.stream.Stream;

interface Car__ {
	@Override
	String toString();
}

class huh implements Car__ {

}

class gtv {
	
	 void m7(final String ft){
		//ft = "";
		// Stream<T>
	}
	 
	 

}

final class tff extends gtv {
	private int num = 12;
  void m7(final String ft){
		
	}

}

public class Car_1 {
	public static void main(final String[] args)
			throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		tff t = new tff();
		Class cls = t.getClass();
		Field f = cls.getDeclaredField("num");
		f.setAccessible(true);

		f.set(t, 6);
		int num = f.getInt(t);

		System.out.println(f);

	}
}
