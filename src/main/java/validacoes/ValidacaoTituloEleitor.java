package validacoes;

import br.com.caelum.stella.validation.CPFValidator;
import br.com.caelum.stella.validation.InvalidStateException;
import br.com.caelum.stella.validation.TituloEleitoralValidator;

public class ValidacaoTituloEleitor {
	
	public static void main(String[] args) {
		
		
String titulo = "718302350140";
		
		TituloEleitoralValidator validador = new TituloEleitoralValidator();
		
		try{
			validador.assertValid(titulo);
			System.out.println("TITULO ELEITOR VALIDO");
		}catch(InvalidStateException e){
			System.out.println("TITULO ELEITOR INVALIDO " + e);
		}
	}

}
