package exectuter;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestStream {
	public static void main(String[] args) {

		Stream<String> s = Stream.of("Sarvesh", "Sarvesh", "Sarvesh", "Rimesh", "Kitan", "Washy");
		
		
		List<String> streamToList = s.collect(Collectors.toList());

		//s.forEach(st -> System.out.println(st));

		List<String> list = Arrays.asList("Sarvesh", "Sarvesh", "Rimesh", "Kitan", "Washy");
		
		//System.out.println(list.indexOf("Sarvesh"));

		list.stream().forEach(x -> {

			if (x.contains("Sarvesh")) {
				//System.out.println("s");
				//list.remove(list.indexOf("Sarvesh"));
			}
			System.out.println(list);

		});
		
		Hosting [] arrHosting = {new Hosting(1, "liquidweb.com", 80000),new Hosting(1, "liquidweb.com", 80000)};
		
		Arrays.stream(arrHosting);
		
		Stream<Integer> s1 = Stream.of(23,24,65,76,94,12);
		//s1.count();
		
		//Optional<T>
// Stream doesnt store value it is creating view
		// Itermeditae operationsis lazy  it is perfomr only conditions(predicats)
		
		//List<Integer> streamToList1 = s1.collect(Collectors.toList());
		
		// How lambda funcions
		
		
		s1.filter(x ->{ 
			
			
			return x<40;
			
		}).sorted((i1,i2) -> -i1.compareTo(i2)).collect(Collectors.toList()).forEach(x -> {
			System.out.println(x);
			//return;
			//return null;
			
		});;
	//	System.out.println(s1.collect(Collectors.toList()));

		

	}
}
