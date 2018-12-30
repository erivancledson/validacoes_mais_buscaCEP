package validacoes;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Data {
	
	public static void main(String[] args) {
	 LocalDate hoje = LocalDate.now();
	 System.out.println(hoje);	
	 DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
      //data formatada
	 System.out.println(hoje.format(formatador));	
	 LocalDateTime agora = LocalDateTime.now();
	 System.out.println(agora);
	// DateTimeFormatter formatadorHora = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm");
	 //System.out.println(agora.format(formatadorHora));
	 DateTimeFormatter formatadorCurto = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT); //formata a data escolhendo as opções o SHORT é uma delas
	 System.out.println(agora.format(formatadorCurto));
	System.out.println(agora.minusHours(5));  //a hora atual menos 5 horas
	System.out.println(agora.plusHours(10));  //a hora atual mais 10 horas
	}

}
