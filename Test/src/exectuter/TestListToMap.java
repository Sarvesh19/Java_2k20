package exectuter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class TestListToMap {

	public static void main(String[] args) {

		List<Hosting> list = new ArrayList<>();
		list.add(new Hosting(1, "liquidweb.com", 80000));
		list.add(new Hosting(2, "linode.com", 90000));
		list.add(new Hosting(3, "digitalocean.com", 120000));
		list.add(new Hosting(4, "aws.amazon.com", 200000));
		list.add(new Hosting(5, "google.com", 1));
		list.add(new Hosting(5, "google.com", 1));
		list.add(new Hosting(4, "aws.amazon.com", 200000));

		list.stream().filter(p -> p.getWebsites() > 30000)// filtering data
				.map(p -> p) // fetching price
				.forEach(k -> {
					
					System.out.println(k.getName());
		
					
				});
				//.collect(Collectors.toList()); // collecting as list

		// key = id, value - websites
		Map<Integer, String> result1 = list.stream().collect(Collectors.toMap(Hosting::getId, Hosting::getName));

		System.out.println("Result 1 : " + result1);

		Map<Integer, Hosting> hmap = new HashMap<Integer, Hosting>();
		hmap.put(11, new Hosting(1, "liquidweb.com", 80000));
		hmap.put(22, new Hosting(2, "linode.com", 90000));
		hmap.put(33, new Hosting(3, "digitalocean.com", 120000));
		hmap.put(44, new Hosting(5, "google.com", 1));

		Map<Integer, Hosting> result = hmap.entrySet().stream().filter(map -> map.getKey().intValue() <= 22)
				.collect(Collectors.toMap(map -> map.getKey(), map -> map.getValue()));

		System.out.println("Result: " + result);

	}

}
