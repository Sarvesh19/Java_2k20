package exectuter;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import javax.management.ImmutableDescriptor;




public final class ImmutableClass {

	private final int num ;
	private final List<Integer> list = Arrays.asList(5,6,4,7);
	
//	public List<String> get() {
//	    return Collections.unmodifiableList(this.list);
//	}
	private final String name ;
	
	public ImmutableClass(String name , int num) {
		this.name = name;
		this.num = num;
	}
	List<Integer> getList(){
		return list;
	}
	
	
	
	public static void main(String[] args) {
		ImmutableClass immutableClass = new ImmutableClass("sarvesh",34);
		immutableClass.getList().add(3);
		immutableClass.list.add(5);
		immutableClass.list.add(73);
		immutableClass.list.add(36);
		System.out.println(immutableClass);

	}
	
}



