package br.com.alura.quebradoflix;


import br.com.alura.quebradoflix.model.DadosSerie;
import br.com.alura.quebradoflix.service.ConsumoApi;
import br.com.alura.quebradoflix.service.ConverteDados;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class QuebradoflixApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(QuebradoflixApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		var consumoApi = new ConsumoApi();
		var json = consumoApi.obterDados("https://www.omdbapi.com/?t=gilmore+girls&apikey=aa3d317a");
		System.out.println(json);
		/*json = consumoApi.obterDados("https://coffee.alexflipnote.dev/random.json");
		System.out.println(json);*/
		ConverteDados conversor = new ConverteDados();
		DadosSerie dados = conversor.obterDados(json, DadosSerie.class);
		System.out.println(dados);
	}
}