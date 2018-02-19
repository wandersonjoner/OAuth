package com.example.xcom.api.event.listener;

import java.net.URI;

import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.example.xcom.api.event.RecursoCriadoEvent;

@Component
public class RecursoCriadoListener implements ApplicationListener<RecursoCriadoEvent>{

	
	private void adicionarHeaderLocation(HttpServletResponse response, Long matricula) {
		
		URI uri = ServletUriComponentsBuilder.fromCurrentRequestUri().path("/{matricula}")
				.buildAndExpand(matricula).toUri();
		response.setHeader("Location", uri.toASCIIString());
		
	}
	
	
	@Override
	public void onApplicationEvent(RecursoCriadoEvent recursoCriadoEvent) {
		// TODO Auto-generated method stub
		HttpServletResponse response = recursoCriadoEvent.getResponse();
		Long matricula = recursoCriadoEvent.getMatricula();
		
		adicionarHeaderLocation(response, matricula);
		
	}

}
