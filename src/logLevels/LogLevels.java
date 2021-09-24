package logLevels;

public class LogLevels {

	public static String message(String logLine) {
		String[] tb = logLine.split(":");
		String frase = tb[1].trim();
		String titulo = tb[0];
		String warning = "[WARNING]";
		String error = "[ERROR]";
		String info = "[INFO]";

		if (titulo.compareTo(warning) == 0) {
			return frase;
		}
		if (titulo.compareTo(error) == 0) {
			return frase;
		}
		if (titulo.compareTo(info) == 0) {
			return frase;
		} else {
			return frase;
		}

	}

	public static String logLevel(String logLine) {

		String[] tb = logLine.split(":");
		String titulo = tb[0];
		return titulo.toLowerCase().replace("[", "").replace("]", "");

	}

	public static String reformat(String logLine) {
		String[] tb = logLine.split(":");
		String frase = tb[1].trim();
		String titulo = tb[0];
		return frase + " " + titulo.toLowerCase().replace("[", "(").replace("]", ")");

	}

	public static void main(String args[]) {
		LogLevels.message("[ERROR]:Invalid operation");
		LogLevels.message("[WARNING]:Disk almost full");
		LogLevels.logLevel("[WARNING]:Disk almost full");
		LogLevels.reformat("[WARNING]:Disk almost full");

	}

}

/* CODIGO DE OUTRA PESSOA
 * 
 * public class LogLevels {
    
    public static String message(String logLine) {
        return logLine.substring(logLine.indexOf(":")+1).trim();
    }
    public static String logLevel(String logLine) {
        return logLine.substring(logLine.indexOf("[")+1,logLine.indexOf(":")-1).toLowerCase();
    }
    public static String reformat(String logLine) {
        return message(logLine) + " (" + logLevel(logLine) + ")";
    }
}

 * 
 * 
 */




/*
 * Introdu��o A Stringem Java � um objeto que representa um texto imut�vel como
 * uma sequ�ncia de caracteres Unicode (letras, d�gitos, pontua��o, etc.). Aspas
 * duplas s�o usadas para definir uma Stringinst�ncia:
 * 
 * String fruit = "Apple"; As strings s�o manipuladas chamando os m�todos da
 * string. Uma vez que uma string foi constru�da, seu valor nunca pode mudar.
 * Quaisquer m�todos que pare�am modificar uma string ir�o, na verdade, retornar
 * uma nova string. A Stringclasse fornece alguns m�todos est�ticos para
 * transformar as strings.
 * 
 * Instru��es Neste exerc�cio, voc� processar� linhas de registro.
 * 
 * Cada linha do registro � uma string formatada da seguinte forma:
 * "[<LEVEL>]: <MESSAGE>".
 * 
 * Existem tr�s n�veis de registro diferentes:
 * 
 * INFO WARNING ERROR Voc� tem tr�s tarefas, cada uma das quais pegar� uma linha
 * de registro e pedir� que voc� fa�a algo com ela.
 * 
 * Tarefa 1 Obter mensagem de uma linha de registro
 * 
 * Implemente o m�todo ( est�tico ) LogLevels.message()para retornar a mensagem
 * de uma linha de registro:
 * 
 * LogLevels.message("[ERROR]: Invalid operation") // => "Invalid operation"
 * Qualquer espa�o em branco � esquerda ou � direita deve ser removido:
 * 
 * LogLevels.message("[WARNING]:  Disk almost full\r\n") // =>
 * "Disk almost full"
 * 
 * Grudou? Revelar dicas Abre em modal Tarefa 2 Obtenha o n�vel de registro de
 * uma linha de registro
 * 
 * Implemente o m�todo ( est�tico ) LogLevels.logLevel()para retornar o n�vel de
 * registro de uma linha de registro, que deve ser retornado em letras
 * min�sculas:
 * 
 * LogLevels.logLevel("[ERROR]: Invalid operation") // => "error"
 * 
 * Grudou? Revelar dicas Abre em modal Tarefa 3 Reformatar uma linha de registro
 * 
 * Implemente o m�todo ( est�tico ) LogLevels.reformat()que reformata a linha de
 * registro, colocando a mensagem primeiro e o n�vel de registro depois dela
 * entre par�nteses:
 * 
 * LogLevels.reformat("[INFO]: Operation completed") // =>
 * "Operation completed (info)"
 */