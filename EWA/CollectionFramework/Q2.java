package CollectionFramework;
/*
Suppose the list letters contains elements "A", "B", "C", and "D". Draw the contents of the
list and the iterator position for the following operations:
ListIterator<String> iter = letters.iterator();
iter.next();
iter.next();
iter.remove();
iter.next();
iter.add("E");
iter.next();
iter.add("F");
*/
import java.util.*;
public class Q2
{
  public static void main(String[] args) {
    LinkedList<String> letters=new LinkedList<>();
    letters.add("A");
    letters.add("B");
    letters.add("C");
    letters.add("D");

    ListIterator<String> iter = letters.listIterator();		//CHirag19CSU071
    iter.next();
    iter.next();

    iter.remove();

    iter.next();

    iter.add("E");

    iter.next();

    iter.add("F");

    System.out.println(letters);
  }
}