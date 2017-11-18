/**
 * HashNode.java
 * 
 * @author Alex Wang
 *
 */
public class HashNode {
	String key;
	String value;
	HashNode next;

	/**
	 * Constructor 1
	 */
	public HashNode() {
		key = null;
		value = null;
		next = null;

	}

	/**
	 * Constructor 2
	 * 
	 * @param givenKey
	 *            the key given to be added
	 * @param givenValue
	 *            the value given to be added
	 */
	public HashNode(String givenKey, String givenValue) {
		key = givenKey;
		value = givenValue;
		next = null;
	}

	/**
	 * Getter for key
	 * 
	 * @return key
	 */
	public String getKey() {
		return key;
	}

	/**
	 * Setter for key
	 * 
	 * @param givenKey
	 *            given key to set
	 */
	public void setKey(String givenKey) {
		key = givenKey;
	}

	/**
	 * Getter of value
	 * 
	 * @return value
	 */
	public String getValue() {
		return value;
	}

	/**
	 * Setter of value
	 * 
	 * @param givenValue
	 *            given value to set
	 */
	public void setValue(String givenValue) {
		value = givenValue;
	}

	/**
	 * Getter for next node
	 * 
	 * @return next node
	 */
	public HashNode getNext() {
		return next;
	}

	/**
	 * Seeter for next node
	 * 
	 * @param givenNext
	 *            given node to set
	 */
	public void setNext(HashNode givenNext) {
		next = givenNext;
	}

}
