package exectuter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestFinal {
	final String name;
	final int num;
	final List<Integer> list;
	final Hosting hosting;
	final List<Integer> listWithStream;

	TestFinal(String name, int num, List<Integer> list2, Hosting host, List<Integer> listWithStream) {
		this.name = name;
		this.num = num;
		this.list = list2;
		this.hosting = host;
		this.listWithStream = listWithStream;
	}

	public static void main(String[] args) {
		TestFinal t = new TestFinal("sarvesh", 4, new ArrayList<>(Arrays.asList(3, 4, 5, 6, 5)),
				new Hosting(3, "dee", 6l), (List<Integer>) Stream.of(3, 4, 23, 5, 64, 666).collect(Collectors.toList()));

		t.hosting.setName("koi");
		t.hosting.setId(5);
		t.hosting.setWebsites(7l);
		t.list.addAll(Arrays.asList(3, 4, 5, 6, 5));
		t.list.add(45);
		t.list.add(64);
		t.listWithStream.add(555555);
		System.out.println(t);

	}

}
