package com.example.xcom.api.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.example.xcom.api.model.Aluno;
import com.example.xcom.api.repository.AlunoRepository;

@Service
public class AlunoService {
	
	@Autowired
	private AlunoRepository alunoRepository;
	
	
	
	public Aluno atualizar(Long matricula, Aluno aluno) {
		
		Aluno alunoSalvo = buscarAlunoPeloCodigo(matricula);
		BeanUtils.copyProperties(aluno, alunoSalvo, "matricula");
		return  alunoRepository.save(alunoSalvo);
		
	}
	
	
	
	
	
	public Aluno buscarAlunoPeloCodigo(Long matricula) {
		
		Aluno alunoSalvo = alunoRepository.findOne(matricula);
		if(alunoSalvo==null) {
			
			throw new EmptyResultDataAccessException(1);
			
		}
		return alunoSalvo;
			
	}

}
