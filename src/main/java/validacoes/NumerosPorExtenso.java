package validacoes;

import java.math.BigDecimal;

import br.com.caelum.stella.inwords.FormatoDeReal;
import br.com.caelum.stella.inwords.InteiroSemFormato;
import br.com.caelum.stella.inwords.NumericToWordsConverter;

public class NumerosPorExtenso {
	
	public static void main(String[] args) {
		NumericToWordsConverter conversor = new NumericToWordsConverter(new FormatoDeReal());
	    BigDecimal valor = new BigDecimal("1.25");
		String vaorPorExtenso = conversor.toWords(valor.doubleValue());
		System.out.println(vaorPorExtenso);
	
	}

}
