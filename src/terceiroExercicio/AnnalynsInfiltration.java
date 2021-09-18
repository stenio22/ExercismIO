package terceiroExercicio;

/*
 *Instru��es
Neste exerc�cio, voc� implementar� a l�gica de busca para um novo jogo de RPG que um amigo est� desenvolvendo. O personagem principal do jogo � Annalyn, uma garota corajosa com um c�o de estima��o feroz e leal. Infelizmente, ocorre um desastre, j� que sua melhor amiga foi sequestrada enquanto procurava frutas na floresta. Annalyn tentar� encontrar e libertar seu melhor amigo, opcionalmente levando seu cachorro com ela nesta miss�o.

Depois de algum tempo seguindo a trilha de sua melhor amiga, ela encontra o acampamento em que sua melhor amiga est� presa. Acontece que existem dois sequestradores: um poderoso cavaleiro e um arqueiro astuto.

Tendo encontrado os sequestradores, Annalyn considera em qual das seguintes a��es ela pode se envolver:

Ataque r�pido: um ataque r�pido pode ser feito se o cavaleiro estiver dormindo, pois leva tempo para ele colocar sua armadura, ent�o ele estar� vulner�vel.
Espi�o: o grupo pode ser espiado se pelo menos um deles estiver acordado. Caso contr�rio, espionar � uma perda de tempo.
Sinalizar prisioneiro: o prisioneiro pode ser sinalizado por sons de p�ssaros se o prisioneiro estiver acordado e o arqueiro estiver dormindo, pois os arqueiros s�o treinados em sinaliza��o de p�ssaros, para que possam interceptar a mensagem.
Prisioneiro livre: se o prisioneiro estiver acordado e os outros dois personagens estiverem dormindo, uma entrada sorrateira no campo pode libertar o prisioneiro. Isso n�o funcionar� se a prisioneira estiver dormindo, pois a prisioneira ficar� assustada com a apari��o repentina de sua amiga e o cavaleiro e arqueiro ser�o acordados. O prisioneiro tamb�m pode ser libertado se o arqueiro estiver dormindo e Annalyn estiver com seu cachorro de estima��o, pois o cavaleiro ficar� assustado com o cachorro e se retirar�, e o arqueiro n�o pode equipar seu arco r�pido o suficiente para evitar que o prisioneiro seja libertado.
Voc� tem quatro tarefas: implementar a l�gica para determinar se as a��es acima est�o dispon�veis com base no estado dos tr�s personagens encontrados na floresta e se o c�o de estima��o de Annalyn est� presente ou n�o.
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

	/* POR ALGUM MOTIVO  DOIS ERROS OCORRERAM NAS CONDI��ES DESTE COMENTARIO.
	 
	 
	 	FAILED
		Teste 2
		N�o pode libertar o prisioneiro se apenas o arqueiro estiver dormindo e o c�o de estima��o 		estiver ausente

		FAILED
		Teste 20
		pode libertar o prisioneiro se apenas o prisioneiro estiver acordado e o c�o de estima��o 		estiver ausente
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
