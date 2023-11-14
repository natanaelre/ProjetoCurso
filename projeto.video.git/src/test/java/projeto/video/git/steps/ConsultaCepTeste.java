package projeto.video.git.steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import projeto.video.git.config.InicializarTeste;
import projeto.video.git.pages.Homepage;

public class ConsultaCepTeste {

	Homepage home = new Homepage();

	@Before
	public void iniciarTeste() {
		InicializarTeste.configurarAmbiente();
	}

	@After
	public void finalizarTeste() {
		InicializarTeste.encerrarTeste();

	}

	@When("enviar os dados para busca")
	public void enviarOsDadosParaBusca() {
		home.buscarCepEndereco("12929-040");
	}

	@Then("validar os dados retornado")
	public void validarOsDadosRetornado() {
home.validarDadosRetornados("Avenida Ezeo Dinamo Rossi", "Jardim Águas Claras", "Bragança Paulista/SP", "12929-040");
	}

}
