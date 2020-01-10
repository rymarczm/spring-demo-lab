package pl.altkom.spring.client;

import javax.inject.Inject;

import org.springframework.stereotype.Component;

import pl.altkom.spring.service.InfoService;

@Component
public class InfoClient {

	@Inject
	private InfoService is;

	public void invokeInfoService() {
		is.printInfo();
	}

}
