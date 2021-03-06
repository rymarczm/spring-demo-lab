package pl.altkom.spring.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

import pl.altkom.spring.util.StdInfo;

@Component
@StdInfo
public class StandardInfo implements Info {

	@PostConstruct
	public void init() {
		System.out.println("++ @PostConstruct: " + this);
	}

	@Override
	public void printMessage(String msg) {
		System.out.println("*** Your standard info:" + msg);

	}

	@PreDestroy
	public void destroy() {
		System.out.println("-- @PreDestroy: " + this);
	}
}
