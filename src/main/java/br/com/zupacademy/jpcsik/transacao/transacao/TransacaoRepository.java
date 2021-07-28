package br.com.zupacademy.jpcsik.transacao.transacao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransacaoRepository extends JpaRepository<Transacao, Long>{

	//Buscar todas as transações associadas ao numero do cartão
	Page<Transacao> findAllByNumeroCartao(String numeroCartao, Pageable pageable);

}
