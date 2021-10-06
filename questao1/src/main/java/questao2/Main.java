package questao2;

public class Main {
	public static void main(String[] args) {
		String s1 = null;
		String s2 = new String("abc");
		String s3 = new String("abcdefghi");
		
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
			s = s.toUpperCase();
			return s;
		}
		else {
			s = s.toUpperCase();
			
			String invertida = "";
			for ( int i = (len - 1); i >= 0; i--) {
				invertida += new Character(s.charAt(i)).toString();
			}
			return invertida;
		}
		
		
	}
	
}
