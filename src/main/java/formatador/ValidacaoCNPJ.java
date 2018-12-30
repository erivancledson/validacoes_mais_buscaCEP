package formatador;

import br.com.caelum.stella.format.CNPJFormatter;
import br.com.caelum.stella.format.CPFFormatter;
import br.com.caelum.stella.validation.CNPJValidator;
import br.com.caelum.stella.validation.InvalidStateException;

public class ValidacaoCNPJ {

	public static void main(String[] args) {
		    String cnpj = "05.290.723/0001-96";
		    
		    CNPJFormatter formatador = new CNPJFormatter();
		    String cnpjSemFormatacao = formatador.unformat(cnpj);
		    System.out.println(cnpjSemFormatacao);
		    
		    CNPJValidator validadorCNPJ = new CNPJValidator();
		    
		    try{
		    	validadorCNPJ.assertValid(cnpjSemFormatacao);
		    	System.out.println("CNPJ VALIDO");
		    }catch(InvalidStateException e){
		    	System.out.println("CPF invalido " + e);
		    }
		    
		    
		    
	}
}
