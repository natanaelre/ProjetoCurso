package projeto.video.git.config;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import projeto.video.git.drivers.DriversConexao;

public class InicializarTeste extends DriversConexao {

	static String ambiente = "https://WWW.correios.com.br/";

	public static void configurarAmbiente() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(ambiente);
		driver.manage().window().maximize();
	}

	public static void encerrarTeste() {
		driver.quit();
	}
}