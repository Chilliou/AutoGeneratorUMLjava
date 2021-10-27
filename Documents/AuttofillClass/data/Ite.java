import java.util.Iterator;
import java.util.LinkedList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class Ite 
{
	public  static void main(String[] args)
	{
		ListIterator<Integer> iter;
		List<Integer> lk = new LinkedList<Integer>();

		lk.add ( 8 );
		lk.add ( 150 );
		lk.add ( 1283 ); 
		lk.add( 12);

		iter =  lk.listIterator();
		System.out.println(iter.next());
		System.out.println(iter.next());
		System.out.println(iter.previous());
		iter.remove();
		System.out.println(iter.next());



	
	}
}