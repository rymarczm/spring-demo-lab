package pl.altkom.spring.service;

import javax.inject.Inject;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import pl.altkom.spring.beans.Info;
import pl.altkom.spring.util.ExtInfo;

@Service
public class InfoService {
	
	@Value("${message}")
	private String msg;

//	@Autowired
	@Inject
	@ExtInfo
	private Info info;

	public void printInfo() {
		info.printMessage(msg);
	}

}
