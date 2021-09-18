package terceiroExercicio;

class AnnalynsInfiltration {

	public static boolean canFastAttack(boolean knightIsAwake) {
		if (knightIsAwake == true) {
			return false;
		} else {
			// ataque rapido
			return true;
		}
	}

	public static boolean canSpy(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake) {

		if (knightIsAwake || archerIsAwake || prisonerIsAwake != false) {
			return true;
			// espia se pelo menos 1 estiver acordado
		}
		return false;
	}

	public static boolean canSignalPrisoner(boolean archerIsAwake, boolean prisonerIsAwake) {
		if (archerIsAwake == false && prisonerIsAwake == true) {
			return true;
			// manda sinal pro prisioneiro se o arqueiro estiver dormindo
		}
		return false;
	}

	public static boolean canFreePrisoner(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake,
			boolean petDogIsPresent) {

		if ((knightIsAwake && archerIsAwake == false) && (prisonerIsAwake == true)) {
			return true;
		}
		if (archerIsAwake == false && petDogIsPresent == true) {
			return true;
		}else {
			return false;
		}
	}

	public static void main(String[] args) {
		System.out.println(AnnalynsInfiltration.canFastAttack(true));
		System.out.println(AnnalynsInfiltration.canSpy(false, true, false));
		System.out.println(AnnalynsInfiltration.canSignalPrisoner(false, true));
		System.out.println(AnnalynsInfiltration.canFreePrisoner(false, true, false, false));

	}

}
