package pack1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Program6 {

	public static void main(String[] args) {
		HashSet<String> data = new HashSet<>();
		data.add("Selenium");
		data.add("Java");
		data.add("2");
		data.add("Java");
		data.add("QTP");
		/*for(int i=0;i<data.size();i++) {
			System.out.println(data.get(i));
		}*/
		/*for(String value:data) {
			System.out.println(value);
		}*/
		Iterator<String> iter=data.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
	}

	

}
