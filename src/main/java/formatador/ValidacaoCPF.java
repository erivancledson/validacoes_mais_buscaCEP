package formatador;

import br.com.caelum.stella.format.CPFFormatter;
import br.com.caelum.stella.validation.CPFValidator;
import br.com.caelum.stella.validation.InvalidStateException;

public class ValidacaoCPF {

	public static void main(String[] args) {
		//cpf
		String cpf = "168.147.500-66";
		
	    CPFFormatter formatador = new CPFFormatter();
	    String cpfSemformacao = formatador.unformat(cpf);
	    System.out.println(cpfSemformacao);
		
		CPFValidator validador = new CPFValidator();
		
		try{
			validador.assertValid(cpfSemformacao);
			System.out.println("CPF VALIDO");
		}catch(InvalidStateException e){
			System.out.println("CPF invalido " + e);
		}
		
           
		
	}

}
