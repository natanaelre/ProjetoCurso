package projeto.video.git.metodos;

import static org.junit.Assert.assertEquals;
import java.util.Set;
import org.openqa.selenium.By;
import projeto.video.git.drivers.DriversConexao;

public class Metodos extends DriversConexao {

	public void escrever(By Locator, String texto) {
		try {
			driver.findElement(Locator).sendKeys(texto);
		} catch (Exception e) {
			System.out.println("******causa do erro******" + e.getCause());
			System.out.println("****** Mensagem do erro******" + e.getMessage());
		}
	}

	public void clicar(By locator) {
		try {
			driver.findElement(locator).click();
		} catch (Exception e) {
			System.out.println("******causa do erro******" + e.getCause());
			System.out.println("****** Mensagem do erro******" + e.getMessage());
		}
	}

	public void submit(By locator) {
		try {
			driver.findElement(locator).submit();
		} catch (Exception e) {
			System.out.println("******causa do erro******" + e.getCause());
			System.out.println("****** Mensagem do erro******" + e.getMessage());
		}
	}

	public void validarTexto(By locator, String textoEsperado) {
		try {
			String textoCapturado = driver.findElement(locator).getText();
			assertEquals(textoEsperado, textoCapturado);

		} catch (Exception e) {
			System.out.println("******causa do erro******" + e.getCause());
			System.out.println("****** Mensagem do erro******" + e.getMessage());
		}
	}

	public void mudarAba() {
		try {
			String janelaPrincipal = driver.getWindowHandle();
			Set <String> todasJanelas = driver.getWindowHandles();
			for (String janela : todasJanelas) {
			if(!janela.equals(janelaPrincipal))	{
			driver.switchTo().window(janela);
			
	}
		}
			} catch (Exception e) {
			System.out.println("******causa do erro******" + e.getCause());
			System.out.println("****** Mensagem do erro******" + e.getMessage());
		}
	}
}
