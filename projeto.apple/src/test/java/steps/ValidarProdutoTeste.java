package steps;

import elementos.Elementos;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import metodos.Metodos;
import runner.Executa;

public class ValidarProdutoTeste {
	Metodos metodo = new Metodos();
	Elementos elemento = new Elementos();

	@Before
	public void iniciarTeste() {
		Executa.abrirNavegador();
	}

	@Given("que escolhe o produto na home")
	public void queEscolheOProdutoNaHome() {
		metodo.clicar(elemento.produtoMac);
		metodo.clicar(elemento.macPro);

	}

	@Given("informo o tamanho")
	public void informoOTamanho() {
		metodo.clicar(elemento.BuyProdutoPro13);
		metodo.clicar(elemento.inch13);
		metodo.clicar(elemento.inch14);
		metodo.clicar(elemento.inch16);
	}

	@Given("confirmo o tamanho")
	public void confirmoOTamanho() {

	}

	@When("selecionar o produto")
	public void selecionarOProduto() {
		metodo.scroll(0, 1500);
		metodo.clicar(elemento.btnSelect);
	}

	@Then("valida a descricao do produto")
	public void validaADescricaoDoProduto() {
		metodo.scroll(0, 2200);
		metodo.clicar(elemento.msgDetalhe);

	}

	@Then("inclusao na mala de compras")
	public void inclusaoNaMalaDeCompras() {

	}
}