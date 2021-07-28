package br.com.zupacademy.jpcsik.transacao.transacao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TransacaoController {

	@Autowired
	private TransacaoRepository repository;
	
	@GetMapping("/transacoes/{numeroCartao}")
	public ResponseEntity<Page<TransacaoResponse>> consultar(@PathVariable String numeroCartao, 
			@PageableDefault(size = 10, sort = "efetivadaEm", direction = Sort.Direction.DESC) Pageable pageable){
		
		Page<Transacao> transacoes = repository.findAllByNumeroCartao(numeroCartao, pageable);
		
		//Verifica se existe transações para o cartão 
		if(transacoes.isEmpty()) {
			return ResponseEntity.notFound().build();
		}
		
		//Retorna uma pagina com as transações encontradas para o cartão
		return ResponseEntity.ok().body(TransacaoResponse.converter(transacoes));
		
	}
	
}
