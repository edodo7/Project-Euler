class Main {
	public static void main(String[] args) {
		System.out.println(difference(100));
	}

	private static int sumOfSquares(int n){	return ( (n * (n + 1) * (2*n + 1)) / 6); }

	private static int squareOfSum(int n){ return (int) Math.pow( (n * (n + 1)) / 2,2); }

	public static int difference(int n){ return  squareOfSum(n) - sumOfSquares(n); }
}