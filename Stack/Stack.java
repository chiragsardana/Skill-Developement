/*Stack has Many Features  like
1.pop()
2.push()
3.peek()
4.size()
5.isEmpty()
6.contains()
*/
package Stack;
interface Stack<E>//Here i m making an interface only
{
	public boolean push(E value);

	public E pop();

	public E peek();

	public int size();

	public boolean isEmpty();

	public boolean contains(E value);
}