package genericsdemos;
interface Pair<K,V>{
	public K getKey();
	public V getValue();
}
class OrderedPair<K,V>implements Pair<K,V>{
	private K key;
	private V value;
	
	public OrderedPair(K key,V value)
	{
		this.key=key;
		this.value=value;
	}
	public K getKey() {
		return key;
	}
	public V getValue() {
		return value;
	}
}
public class Generic_Interface_TwoParameter {
	public static void main(String[] args) {
		OrderedPair<Integer,String>obj=new OrderedPair<Integer,String>(100, "ABC");
		System.out.println(obj.getKey()+" "+obj.getValue());
	}
}
