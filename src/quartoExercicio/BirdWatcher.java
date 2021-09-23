package quartoExercicio;

class BirdWatcher {
	private static int[] birdsPerDay = { 2, 5, 0, 7, 4, 1 };

	public BirdWatcher(int[] birdsPerDay) {
		this.birdsPerDay = birdsPerDay.clone();
	}

	public static int[] getLastWeek() {
		int[] listaDaSemana = { 0, 2, 5, 3, 7, 8, 4 };
		return listaDaSemana;
	}

	public static int getToday() {
		BirdWatcher birdCount = new BirdWatcher(birdsPerDay);
		int ultimoValorDoVetor = birdCount.birdsPerDay[5];
		return ultimoValorDoVetor;
	}
	
	public void incrementTodaysCount() {
		BirdWatcher birdCount = new BirdWatcher(birdsPerDay);
		int incrementa = birdCount.getToday() + 1;
	}

	public static boolean hasDayWithoutBirds() {
		BirdWatcher birdCount = new BirdWatcher(birdsPerDay);
		int verificador = 0;
		for(int i = 0; i < birdCount.birdsPerDay.length; i++) {
			if(verificador == birdCount.birdsPerDay[i]) {
				verificador = 100;
			}
		}
		return (verificador == 100);
	}

	public static int getCountForFirstDays(int numberOfDays) {
		BirdWatcher birdCount = new BirdWatcher(birdsPerDay);
		int soma = 0;
		for(int i = 0; i < numberOfDays;i++) {
			soma = birdCount.birdsPerDay[i] + soma;
		}
		return soma;
	}

	public static int getBusyDays() {
		BirdWatcher birdCount = new BirdWatcher(birdsPerDay);
		int soma = 0;
		for(int i = 0; i < birdCount.birdsPerDay[i];i++) {
			if(birdCount.birdsPerDay[i] >= 5) {
				soma = soma + birdCount.birdsPerDay[i];
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
