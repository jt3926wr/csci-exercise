package exercise1;

public class MyInteger {
	
	private int value;

	// No-arg constructor
	public MyInteger() {
		this.value = 1082;
	}
	
	// Overloaded constructor
	public MyInteger(int num) {
		this.value = num;
	}
	
	// Get
	public int getValue() {
		return value;
	}
	
	// Set
	public void setValue(int value) {
		this.value = value;
	}
	
	// Odd
	public boolean isOdd() {
		if((value % 2) == 1) {
			return true;
		}
		return false;
	}
	
	// Even
	public boolean isEven() {
		if((value % 2) == 0) {
			return true;
		}
		return false;
	}
	
	// Add
	public static int add(MyInteger num1, MyInteger num2) {
		return (num1.value + num2.value);
	}
	
	public static void main(String[] args) {
		
		// Output default value
		MyInteger int1 = new MyInteger();
		System.out.println("Default value: " + int1.value); // 1082
		
		// Output value from overloaded constructor
		MyInteger int2 = new MyInteger(8329);
		System.out.println("Value from overloaded constructor: " + int2.value); // 8329
		
		// Get the value
		MyInteger int3 = new MyInteger();
		int num3 = int3.getValue();
		System.out.println("Value from getter: " + num3); // 1082
		
		// Set the value
		int3.setValue(345);
		System.out.println("Value after using setter: " + int3); // 345
		
		// Test if even
		System.out.println("Is " + int1.getValue() + " Even?: " + String.valueOf(int1.isEven())); // Even (true)
		System.out.println("Is " + int2.getValue() + " Even?: " + String.valueOf(int2.isEven())); // Odd (false)
		
		// Test if odd
		System.out.println("Is " + int1.getValue() + " Odd?: " + String.valueOf(int1.isOdd())); // Even (false)
		System.out.println("Is " + int2.getValue() + " Odd?: " + String.valueOf(int2.isOdd())); // Odd (true)
		
		// Add values together
		System.out.println("int1 + int2 = " + add(int1, int2));
		
		// Output string
		System.out.println(int1.toString()); // Int 1
		System.out.println(int2.toString()); // Int 2
		System.out.println(int3.toString()); // Int 3
		
	}

	@Override
	public String toString() {
		return "MyInteger [value=" + value + "]";
	}
}
