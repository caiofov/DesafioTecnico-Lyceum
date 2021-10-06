package questao2;

public class Main {
	public static void main(String[] args) {
		String s1 = null;
		String s2 = new String("a/c");
		String s3 = new String("abcd&f-hi");
		
		System.out.println("Nulo: " + processar(s1));
		System.out.println("3 caracteres: " + processar(s2));
		System.out.println("Mais de 3 caracteres: " + processar(s3));
	}
	
	static String processar(String s) {
		
		if(s == null) {
			return s;
		}
		
		int len = s.length();
		if(len <= 3) {
			s = tornarMaiuscula(s); //Ou também: s.toUpperCase();
			return s;
		}
		else {
			s = tornarMaiuscula(s); //Ou também: s.toUpperCase();
			
			//inverter
			String invertida = "";
			//loop que passa por todos os caracteres da string (de trás para frente)
			for ( int i = (len - 1); i >= 0; i--) {
				invertida += new Character(s.charAt(i)).toString();
				//adiciona o caractere encontrado à nova string "invertida"
			}
			
			return invertida;
		}
		
		
	}
	//método para transformar todos os caracteres de uma string em maiusculo
	static String tornarMaiuscula(String s) {
		String maiuscula = "";
		
		//loop que passa por todos os caracteres da string
		for ( int i = 0 ; i < s.length(); i++) {
			Character charS = s.charAt(i);
			int charInt = charS; //armazena o inteiro correspondente ao caractere encontrado
			
			if((charInt > 96) && (charInt < 122)) { //verifica se o caractere é minusculo ( e é uma letra)
				charInt -= 32; //transforma em maiusculo
			}
			charS = (char) charInt; //transforma de volta em char
			
			maiuscula += charS.toString(); //transforma o char para string e o adiciona à nova string "maiuscula"

		}
		
		return maiuscula;
	}
	
}
