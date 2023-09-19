package mar.marcelo.segundasemana;
/**
 * @author MarceloD
 *
 */
public class MinhaClasse{
	
	int teste = 1;
	
	int teste1 = 2;
	
	int numeroTes= 3;
	
	int numero$ = 4;
	

	
	
	
	
	
	public static void main(String[] args) {
		
		String primeiroNome = "Marcelo";
		String segundoNome = "Priscila";
		String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
		
		System.out.println(nomeCompleto);
		
	}
	
	public static String nomeCompleto(String pri, String seg ) {
		return "Resultado " + pri.concat(" ").concat(seg);
	}
}