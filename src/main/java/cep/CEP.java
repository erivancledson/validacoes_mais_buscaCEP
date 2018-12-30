package cep;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import com.github.gilbertotorrezan.viacep.se.ViaCEPClient;
import com.github.gilbertotorrezan.viacep.shared.ViaCEPEndereco;

public class CEP {

	public static void main(String[] args) {
		ViaCEPClient cliente = new ViaCEPClient();
		try {
			ViaCEPEndereco endereco = cliente.getEndereco("55155410");
			System.out.println("Rua: " + endereco.getLogradouro());
			System.out.println("Bairro: " + endereco.getBairro());
			System.out.println("Cidade: " + endereco.getLocalidade());
			System.out.println("UF: " + endereco.getUf());
		
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
			
	
	}

}
