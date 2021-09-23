package carsAssemble;

public class CarsAssemble {
	int producaoH = 221;

	public double productionRatePerHour(int speed) {
		double resultadoProducao = 0;
		if(speed > 0 && speed <= 4 ) {
			resultadoProducao = speed * producaoH;
			return resultadoProducao;
		}if(speed >= 5 && speed <=8) {
			resultadoProducao = (speed * producaoH) * 0.9;
			return resultadoProducao;
		}if(speed == 9) {
			resultadoProducao = (speed * producaoH) * 0.8;
			return resultadoProducao;
		}if(speed == 10) {
			resultadoProducao = (speed * producaoH) * 0.77;
			return resultadoProducao;
		}
		return resultadoProducao;
	}

	public int workingItemsPerMinute(int speed) {
		double resultadoProducao = 0;
		int producaoPorMin = 0;
		if(speed > 0 && speed <= 4 ) {
			resultadoProducao = speed * producaoH;
			producaoPorMin = (int) (resultadoProducao / 60);
			return producaoPorMin;
			
		}if(speed >= 5 && speed <=8) {
			resultadoProducao = (speed * producaoH) * 0.9;
			producaoPorMin = (int) (resultadoProducao / 60);
			return producaoPorMin;
		}if(speed == 9) {
			resultadoProducao = (speed * producaoH) * 0.8;
			producaoPorMin = (int) (resultadoProducao / 60);
			return producaoPorMin;
		}if(speed == 10) {
			resultadoProducao = (speed * producaoH) * 0.77;
			producaoPorMin = (int) (resultadoProducao / 60);
			return producaoPorMin;
		}
		return producaoPorMin;
	}
	
}

/*
 * Instruções Neste exercício, você escreverá um código para analisar a produção
 * de uma linha de montagem em uma fábrica de automóveis. A velocidade da linha
 * de montagem pode variar de 0(desligada) a 10(máxima).
 * 
 * Em sua velocidade mais baixa ( 1), os 221carros são produzidos a cada hora. A
 * produção aumenta linearmente com a velocidade. Portanto, com a velocidade
 * definida para 4, ele deve produzir 4 * 221 = 884carros por hora. No entanto,
 * velocidades mais altas aumentam a probabilidade de produção de carros
 * defeituosos, que devem ser descartados. A tabela a seguir mostra como a
 * velocidade influencia a taxa de sucesso:
 * 
 * 1para 4: taxa de sucesso de 100%. 
 * 5para 8: taxa de sucesso de 90%. 
 * 9: Taxa de sucesso de 80%. 
 * 10: Taxa de sucesso de 77%. 
 * 
 * 
 * Você tem duas tarefas.
 * 
 * Tarefa 1 Calcule a taxa de produção por hora
 * 
 * Implemente o CarsAssemble.productionRatePerHour()método para calcular a taxa
 * de produção da linha de montagem por hora, levando em consideração a
 * velocidade da linha de montagem atual:
 * 
 * CarsAssemble.productionRatePerHour(6) // => 1193.4 Observe que o valor
 * retornado é a double.
 * 
 * 
 * Tarefa 2 Calcule o número de itens de trabalho produzidos por minuto
 * 
 * Implemente o CarsAssemble.workingItemsPerMinute()método para calcular quantos
 * carros funcionais são produzidos por minuto:
 * 
 * CarsAssemble.workingItemsPerMinute(6) // => 19 Observe que o valor retornado
 * é um int.
 * 
 * 
 */
