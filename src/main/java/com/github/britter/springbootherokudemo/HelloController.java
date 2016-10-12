package com.github.britter.springbootherokudemo;

import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController implements EnvironmentAware{

	private String name;
	@Override
	public void setEnvironment(Environment environment) {
		this.name=environment.getProperty("who");
	}
	@RequestMapping("/")
	public String index(){
		return "Greetings"+ name + "from spring app";
	}

}
