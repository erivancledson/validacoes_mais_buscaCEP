package validacoes;

import br.com.caelum.stella.validation.CPFValidator;
import br.com.caelum.stella.validation.InvalidStateException;

public class ValidacaoCPF {

	public static void main(String[] args) {
		//cpf
		String cpf = "02579303022";
		
		CPFValidator validador = new CPFValidator();
		
		try{
			validador.assertValid(cpf);
			System.out.println("CPF VALIDO");
		}catch(InvalidStateException e){
			System.out.println("CPF invalido " + e);
		}
		
           
		
	}

}
