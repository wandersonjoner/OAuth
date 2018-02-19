package com.example.xcom.api.event;

import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationEvent;

public class RecursoCriadoEvent extends ApplicationEvent{

	private static final long serialVersionUID = 1L;
	
	
	private HttpServletResponse response;
	private Long matricula;

	public RecursoCriadoEvent(Object source, HttpServletResponse response, Long matricula) {
		super(source);
		// TODO Auto-generated constructor stub
		this.response = response;
		this.matricula = matricula;
	}

	public HttpServletResponse getResponse() {
		return response;
	}

	public Long getMatricula() {
		return matricula;
	}

}
