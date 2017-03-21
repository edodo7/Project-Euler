class Main {
	public static void main(String[] args) {
		System.out.println(sumOfEvenFiboNumb(4000000));
	}


	public static int sumOfEvenFiboNumb(int limit){
		int secondPreviousNumb = 0;
		int firstPreviousNumb = 1;
		int fiboNumb = 0;
		int sum = 0;
		while(fiboNumb < limit){
			fiboNumb = firstPreviousNumb + secondPreviousNumb;
			secondPreviousNumb = firstPreviousNumb;
			firstPreviousNumb = fiboNumb;
			if(fiboNumb % 2 == 0)
				sum += fiboNumb;
		}
		return sum;
	}
}