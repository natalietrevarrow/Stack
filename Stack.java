package driver;

public abstract class Stack {
	public abstract void Push(Node node);
	
	public abstract Node Pop();
	
	public abstract Node Peek();
	
	public abstract int GetLength();
	
	public abstract boolean IsEmpty();

	public boolean IsExpValid(String expr) {
		int leftpar = 0;
		int rightpar = 0;
		
		for(int i = 0; i < expr.length(); i++) {
			if(expr.charAt(i) == '(') {
				leftpar = leftpar + 1;
			}
			if(expr.charAt(i) == ')') {
				rightpar = rightpar + 1;
			}
		}
		if(leftpar == rightpar) {
			System.out.println(true);
			return true;
		}
		else {
			System.out.println(false);
			return false;
		}
	}
}