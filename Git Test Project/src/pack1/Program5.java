package pack1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Program5 {

	public static void main(String[] args) {
		
		ArrayList<String> data = new ArrayList<>();
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
