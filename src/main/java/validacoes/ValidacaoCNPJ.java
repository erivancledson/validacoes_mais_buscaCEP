package validacoes;

import br.com.caelum.stella.validation.CNPJValidator;
import br.com.caelum.stella.validation.InvalidStateException;

public class ValidacaoCNPJ {

	public static void main(String[] args) {
		    String cnpj = "24981915000193";
		    CNPJValidator validadorCNPJ = new CNPJValidator();
		    
		    try{
		    	validadorCNPJ.assertValid(cnpj);
		    	System.out.println("CNPJ VALIDO");
		    }catch(InvalidStateException e){
		    	System.out.println("CPF invalido " + e);
		    }
		    
		    
		    
	}
}
