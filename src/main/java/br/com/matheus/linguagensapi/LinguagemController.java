package br.com.matheus.linguagensapi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



@RestController //controla as requisicoes indicando quem deve receber e para quem deve responde-las
public class LinguagemController {
	
	@Autowired //fornece controle sobre onde e como a ligacao entre os beans deve ser realizada
	private LinguagemRepository repositorio;
	
	@GetMapping(value="/linguagens")
	public List<Linguagem> obterLinguagens() {
		List<Linguagem> linguagens = repositorio.findAll();
		return linguagens;
	}
	@PostMapping("/linguagens") 
	public Linguagem salvaLinguagem(@RequestBody Linguagem linguagem) {
		Linguagem linguagemSalva = repositorio.save(linguagem);
		return linguagemSalva;
	}
}
