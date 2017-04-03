class Main {
	public static void main(String[] args) {
		System.out.println(get10001stPrimeNumb());	
	}

	private static boolean isPrime(int n) {
		if(n == 2)
			return true;
		if(n == 1 || n % 2 == 0)
			return false;
		int sqrtNumb = (int) Math.sqrt(n) + 1;
		for(int i = 3 ; i < sqrtNumb; i += 2)
			if (n % i == 0)
				return false;
		return true;
	}

	public static int get10001stPrimeNumb(){
		int prime = 2; 
		int i = 1;
		int numb = 3;
		while (i < 10001){
			if (isPrime(numb)) {
				prime = numb;
				i++;
			}
			numb += 2;
		}
		return prime;
	}
}