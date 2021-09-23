package quartoExercicio;

class BirdWatcher {
	private static int[] birdsPerDay = { 2, 5, 0, 7, 4, 1 };

	public BirdWatcher(int[] birdsPerDay) {
		this.birdsPerDay = birdsPerDay.clone();
	}

	public static int[] getLastWeek() {
		return birdsPerDay;
	}

	public static int getToday() {

        int totalVetor = birdsPerDay.length;
        if (totalVetor == 0)
            return 0;
        return birdsPerDay[totalVetor - 1];
    }
	
	public void incrementTodaysCount() {
		birdsPerDay[birdsPerDay.length - 1] = getToday() + 1;
	}

	public static boolean hasDayWithoutBirds() {
		int verificador = 0;
		for(int i = 0; i < birdsPerDay.length; i++) {
			if(verificador == birdsPerDay[i]) {
				verificador = 100;
			}
		}
		return (verificador == 100);
	}

	public static int getCountForFirstDays(int numberOfDays) {
		int soma = 0;
		for(int i = 0; i < Math.min(numberOfDays, birdsPerDay.length);i++) {
			soma += birdsPerDay[i];
		}
		return soma;
	}

	public static int getBusyDays() {
		int soma = 0;
		for(int i = 0; i < birdsPerDay.length;i++) {
			if(birdsPerDay[i] >= 5) {
				soma++;
			}
		}
		return soma;
	}
	
	public static void main(String[] args){
		
		System.out.println(getLastWeek());
		System.out.println(getToday());
		System.out.println(hasDayWithoutBirds());
		System.out.println(getCountForFirstDays(4));
		System.out.println(getBusyDays());
		
	}
	
	
}
