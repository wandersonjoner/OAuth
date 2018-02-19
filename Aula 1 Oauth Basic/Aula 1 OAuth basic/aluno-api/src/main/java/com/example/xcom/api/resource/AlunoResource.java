package com.example.xcom.api.resource;

import java.util.List;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.xcom.api.event.RecursoCriadoEvent;
import com.example.xcom.api.model.Aluno;
import com.example.xcom.api.repository.AlunoRepository;
import com.example.xcom.api.service.AlunoService;

@RestController
@RequestMapping("/alunos")
public class AlunoResource {

	
	@Autowired
	private AlunoRepository alunoRepository;
	
	
	@Autowired
	private ApplicationEventPublisher publisher;
	
	
	@Autowired
	private AlunoService alunoService;
	
	@GetMapping
	public List<Aluno> listar(){
		
		return alunoRepository.findAll();
		
	}
	 @GetMapping("/{matricula")
	public ResponseEntity<Aluno> buscarPelaMatricula(@PathVariable Long matricula){
		
		Aluno aluno = alunoService.buscarAlunoPeloCodigo(matricula);
		return aluno !=null? ResponseEntity.ok(aluno) : ResponseEntity.notFound().build();
		
	}
	 
	 
	 @PostMapping
	 public ResponseEntity<Aluno> criar(@Valid @RequestBody Aluno aluno, HttpServletResponse response){
		 
		 Aluno alunoSalvo = alunoRepository.save(aluno);
		 publisher.publishEvent(new RecursoCriadoEvent(this, response, alunoSalvo.getMatricula()));
		 return ResponseEntity.status(HttpStatus.CREATED).body(alunoSalvo);
	 }
	 
	 @DeleteMapping("/{matricula}")
	 @ResponseStatus(HttpStatus.NO_CONTENT)
	 public void remover(@PathVariable Long matricula) {
		 
		 alunoRepository.delete(matricula);
		 
		 
	 }
	 
	 
	 @PutMapping("/{matricula}")
	 public ResponseEntity<Aluno> atualizar(@PathVariable Long matricula, @Valid @RequestBody Aluno aluno){
		 
		 Aluno alunoSalvo = alunoService.atualizar(matricula, aluno);
		 return ResponseEntity.ok(alunoSalvo);
		 
		 
	 }
	
}
