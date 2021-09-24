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
 * Introdução A Stringem Java é um objeto que representa um texto imutável como
 * uma sequência de caracteres Unicode (letras, dígitos, pontuação, etc.). Aspas
 * duplas são usadas para definir uma Stringinstância:
 * 
 * String fruit = "Apple"; As strings são manipuladas chamando os métodos da
 * string. Uma vez que uma string foi construída, seu valor nunca pode mudar.
 * Quaisquer métodos que pareçam modificar uma string irão, na verdade, retornar
 * uma nova string. A Stringclasse fornece alguns métodos estáticos para
 * transformar as strings.
 * 
 * Instruções Neste exercício, você processará linhas de registro.
 * 
 * Cada linha do registro é uma string formatada da seguinte forma:
 * "[<LEVEL>]: <MESSAGE>".
 * 
 * Existem três níveis de registro diferentes:
 * 
 * INFO WARNING ERROR Você tem três tarefas, cada uma das quais pegará uma linha
 * de registro e pedirá que você faça algo com ela.
 * 
 * Tarefa 1 Obter mensagem de uma linha de registro
 * 
 * Implemente o método ( estático ) LogLevels.message()para retornar a mensagem
 * de uma linha de registro:
 * 
 * LogLevels.message("[ERROR]: Invalid operation") // => "Invalid operation"
 * Qualquer espaço em branco à esquerda ou à direita deve ser removido:
 * 
 * LogLevels.message("[WARNING]:  Disk almost full\r\n") // =>
 * "Disk almost full"
 * 
 * Grudou? Revelar dicas Abre em modal Tarefa 2 Obtenha o nível de registro de
 * uma linha de registro
 * 
 * Implemente o método ( estático ) LogLevels.logLevel()para retornar o nível de
 * registro de uma linha de registro, que deve ser retornado em letras
 * minúsculas:
 * 
 * LogLevels.logLevel("[ERROR]: Invalid operation") // => "error"
 * 
 * Grudou? Revelar dicas Abre em modal Tarefa 3 Reformatar uma linha de registro
 * 
 * Implemente o método ( estático ) LogLevels.reformat()que reformata a linha de
 * registro, colocando a mensagem primeiro e o nível de registro depois dela
 * entre parênteses:
 * 
 * LogLevels.reformat("[INFO]: Operation completed") // =>
 * "Operation completed (info)"
 */