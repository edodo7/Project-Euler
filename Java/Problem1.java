class Main {
	public static void main(String[] args) {
		System.out.println(sumOfMultiples(1000));
	}

	public static int sumOfMultiples(int limit) {
		int sum = 0;
		for (int i = 1; i < limit ; i++ ) {
			if( i % 3 == 0 || i % 5 == 0 )
				sum += i;
		}
		return sum;
	}
}