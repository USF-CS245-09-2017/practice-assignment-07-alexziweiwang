/**
 * Hashtable.java
 * @author Alex Wang
 *
 */
public class Hashtable {
	
	private HashNode[] table;
	
	/**
	 * Constructor
	 */
	public Hashtable(){
		table = new HashNode[10];
	}

	/**
	 * 
	 * Adds the key/value pair into the Hashtable instance. If there is an
	 * existing key/value pair, the Hashtable instance replaces the stored value
	 * with the argument value.
	 * 
	 * @param key key given to be added
	 * @param val value given to be added
	 */
	public void put(String key, String val) {
		int index = Math.abs(key.hashCode()) % table.length;

		HashNode toAdd = new HashNode(key, val);
		HashNode curr = table[index];
		if(curr != null){
			toAdd.setNext(curr);
		}
		table[index] = toAdd;
		
	}

	/**
	 * Returns the value associated with the key which is passed as an argument;
	 * returns null if no key/value pair is contained by the Hashtable instance.
	 * 
	 * @param key
	 * @return the value of given key
	 */
	public String get(String key) {
		String gotVal = null;
		
		if(containsKey(key)){
			int index = Math.abs(key.hashCode()) % table.length;
			HashNode curr = table[index];

			while(curr != null){
				if (curr.getKey().equals(key)){
					gotVal = curr.getValue();
					break;
				}
				curr = curr.next;
			}
		}
		return gotVal; 
	}

	/**
	 * Removes the key/value pair from the Hashtable instance and returns the
	 * value associated with the key to the caller. Throws an Exception instance
	 * if the key is not present in the Hashtable instance.
	 * 
	 * @param key
	 * @return the value of removed node
	 */
	public String remove(String key) {
		String removedVal = null; 
		if(containsKey(key)){
			int index = Math.abs(key.hashCode()) % table.length;

			HashNode curr = table[index];
			while(curr != null){
				if(curr.getKey().equals(key)){ // removing first node in the slot
					removedVal = curr.getValue();
					table[index] = curr.next;
					
					break;
				}
				else if (curr.next!= null && curr.next.getKey().equals(key)){
					removedVal = curr.next.getValue();
					if(curr.next.next!= null){
						curr.next = curr.next.next;
					}
					else{
						curr.next = null;
					}
					
					break;
				}
				curr = curr.next;
			}
		}
		return removedVal; 
	}

	/**
	 * 
	 * Returns “true” if a key/value object pair (with the key matching the
	 * argument and any value).
	 * 
	 * @param key
	 * @return whether a key/value object pair exists in the table
	 */
	public boolean containsKey(String key) {
		boolean contains = false;
		int index = Math.abs(key.hashCode()) % table.length;
		
		HashNode curr = table[index];
		while(curr != null){
			if(curr.getKey().equals(key)){
				contains = true;
				break;
			}
			curr= curr.next;
		}
		
		return contains;
	}

	
}
