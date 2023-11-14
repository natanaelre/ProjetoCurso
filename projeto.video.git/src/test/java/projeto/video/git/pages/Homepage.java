package projeto.video.git.pages;

import projeto.video.git.elemento.Elementos;
import projeto.video.git.metodos.Metodos;

public class Homepage {

	Metodos metodo = new Metodos();

	public void buscarCepEndereco(String dados) {
		metodo.escrever(Elementos.buscarCepEndereco, dados);
	}

	public void validarDadosRetornados(String logradouro, String bairro, String localidade, String cep) {
		metodo.mudarAba();
		metodo.validarTexto(Elementos.logradouro_Nome, logradouro);
		metodo.validarTexto(Elementos.bairro_Distrito, bairro);
		metodo.validarTexto(Elementos.localidade_UF, localidade);
		metodo.validarTexto(Elementos.cep, cep);

	}
}