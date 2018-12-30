package validacoes;

import javax.money.CurrencyUnit;
import javax.money.Monetary;
import javax.money.MonetaryAmount;
import javax.money.MonetaryOperator;
import javax.money.NumberValue;

import org.javamoney.moneta.Money;
import org.javamoney.moneta.function.MonetaryOperators;

import br.com.caelum.stella.inwords.FormatoDeReal;
import br.com.caelum.stella.inwords.NumericToWordsConverter;

public class DinheiroMoneta {
	
	public static void main(String[] args) {
		CurrencyUnit moeda = Monetary.getCurrency("BRL");
	    MonetaryAmount valorDaParcela = Money.of(75, moeda);
	    System.out.println(valorDaParcela);
	    //75 * 12 = 900
	    MonetaryAmount valorTotal = valorDaParcela.multiply(12);
	    System.out.println(valorTotal);
	    
	    
	    //desconto de 10%
	    MonetaryAmount desconto = valorTotal.with(MonetaryOperators.percent(10));
	   
	    NumberValue descontoSemMoeda = desconto.getNumber();
	    
	    NumericToWordsConverter conversor = new NumericToWordsConverter(new FormatoDeReal());
	    String valorPorExtenso = conversor.toWords(descontoSemMoeda.doubleValue());
	    System.out.println(valorPorExtenso);
	}

}
