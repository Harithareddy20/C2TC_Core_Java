package collectionFrameworks;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList_Demo {

	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.add(new Integer(10));
		ll.add("Hiii");
		ll.addFirst("Helloo");
		ll.add(0, 10);
		ll.add(2, 30);
		Iterator i1 = ll.iterator();
		while (i1.hasNext()) {
			Object o = i1.next();
			System.out.println(o);

	}

}
}
