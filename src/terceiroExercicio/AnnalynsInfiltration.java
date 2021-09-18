package terceiroExercicio;

/*
 *Instruções
Neste exercício, você implementará a lógica de busca para um novo jogo de RPG que um amigo está desenvolvendo. O personagem principal do jogo é Annalyn, uma garota corajosa com um cão de estimação feroz e leal. Infelizmente, ocorre um desastre, já que sua melhor amiga foi sequestrada enquanto procurava frutas na floresta. Annalyn tentará encontrar e libertar seu melhor amigo, opcionalmente levando seu cachorro com ela nesta missão.

Depois de algum tempo seguindo a trilha de sua melhor amiga, ela encontra o acampamento em que sua melhor amiga está presa. Acontece que existem dois sequestradores: um poderoso cavaleiro e um arqueiro astuto.

Tendo encontrado os sequestradores, Annalyn considera em qual das seguintes ações ela pode se envolver:

Ataque rápido: um ataque rápido pode ser feito se o cavaleiro estiver dormindo, pois leva tempo para ele colocar sua armadura, então ele estará vulnerável.
Espião: o grupo pode ser espiado se pelo menos um deles estiver acordado. Caso contrário, espionar é uma perda de tempo.
Sinalizar prisioneiro: o prisioneiro pode ser sinalizado por sons de pássaros se o prisioneiro estiver acordado e o arqueiro estiver dormindo, pois os arqueiros são treinados em sinalização de pássaros, para que possam interceptar a mensagem.
Prisioneiro livre: se o prisioneiro estiver acordado e os outros dois personagens estiverem dormindo, uma entrada sorrateira no campo pode libertar o prisioneiro. Isso não funcionará se a prisioneira estiver dormindo, pois a prisioneira ficará assustada com a aparição repentina de sua amiga e o cavaleiro e arqueiro serão acordados. O prisioneiro também pode ser libertado se o arqueiro estiver dormindo e Annalyn estiver com seu cachorro de estimação, pois o cavaleiro ficará assustado com o cachorro e se retirará, e o arqueiro não pode equipar seu arco rápido o suficiente para evitar que o prisioneiro seja libertado.
Você tem quatro tarefas: implementar a lógica para determinar se as ações acima estão disponíveis com base no estado dos três personagens encontrados na floresta e se o cão de estimação de Annalyn está presente ou não.
 */

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
			return (prisonerIsAwake && !archerIsAwake && !knightIsAwake) || (!archerIsAwake && petDogIsPresent);}

	/* POR ALGUM MOTIVO  DOIS ERROS OCORRERAM NAS CONDIÇÕES DESTE COMENTARIO.
	 
	 
	 	FAILED
		Teste 2
		Não pode libertar o prisioneiro se apenas o arqueiro estiver dormindo e o cão de estimação 		estiver ausente

		FAILED
		Teste 20
		pode libertar o prisioneiro se apenas o prisioneiro estiver acordado e o cão de estimação 		estiver ausente
	 * 
	
		if (((knightIsAwake && archerIsAwake == false) && (prisonerIsAwake == true)) || ( archerIsAwake == false && petDogIsPresent == true)) {
			return true;
		}
		else {
			return false;
		}
		
*/
	public static void main(String[] args) {
		System.out.println(AnnalynsInfiltration.canFastAttack(true));
		System.out.println(AnnalynsInfiltration.canSpy(false, true, false));
		System.out.println(AnnalynsInfiltration.canSignalPrisoner(false, true));
		System.out.println(AnnalynsInfiltration.canFreePrisoner(false, true, false, false));

	}

}

	/*
	 *  CODIGO SIMPLIFICADO ** ESTUDAR 
	 class AnnalynsInfiltration {
	    public static boolean canFastAttack(boolean knightIsAwake) {
	    	return !knightIsAwake;
	    }
	    public static boolean canSpy(boolean knightIsAwake, boolean archerIsAwake, boolean 			prisonerIsAwake) {
	    	return (knightIsAwake || archerIsAwake || prisonerIsAwake);
	    }
	    public static boolean canSignalPrisoner(boolean archerIsAwake, boolean prisonerIsAwake) {
	    	return !archerIsAwake && prisonerIsAwake;
	    }
		public static boolean canFreePrisoner(boolean knightIsAwake, boolean archerIsAwake, boolean 			prisonerIsAwake,
				boolean petDogIsPresent) {
				return (prisonerIsAwake && !archerIsAwake && !knightIsAwake) || (!archerIsAwake && 			petDogIsPresent);
		}
	}
*/
