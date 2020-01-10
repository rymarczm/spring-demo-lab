package pl.altkom.spring.app;

import java.util.Arrays;

import javax.inject.Inject;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import pl.altkom.spring.client.InfoClient;

@SpringBootApplication
@ComponentScan(basePackages = "pl.altkom.spring.cfg")
public class SpringDemoLabApplication implements CommandLineRunner {

	private ConfigurableApplicationContext ctx;

	@Inject
	private InfoClient ic;

	private int beansCount = 0;

	public static void main(String[] args) {
//		SpringApplication.run(SpringDemoLabApplication.class, args);
		SpringDemoLabApplication sda = new SpringDemoLabApplication();
		sda.runSpringBootApp(args);

	}

	private void runSpringBootApp(String... args) {
		SpringApplication sa = new SpringApplication(SpringDemoLabApplication.class);
		ctx = sa.run(args);
		beansCountInfo(ctx);
	}

	private void beansCountInfo(ConfigurableApplicationContext ctx) {
		String[] beansNames = ctx.getBeanDefinitionNames();
		Arrays.stream(beansNames).forEach(b -> {
			System.out.println(++beansCount + ": " + b);
		});
	}

	@Override
	public void run(String... args) throws Exception {
		ic.invokeInfoService();

	}

}
