public class MinhaCalsse{
	
	public void main(String[] args){
	String primeiroNome = "Ozeias";
	String segundoNome = "Santana";

	String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

	System.out.println(nomeCompleto);
	}

	public static nomeCompleto(String primeiroNome, String segundoNome){
		return "Resultado do método " + primeiroNome.concat(" ").concat(segundoNome);
	}
}
