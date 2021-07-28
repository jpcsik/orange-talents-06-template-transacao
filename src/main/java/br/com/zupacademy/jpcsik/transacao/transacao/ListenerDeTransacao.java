package br.com.zupacademy.jpcsik.transacao.transacao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class ListenerDeTransacao {

	@Autowired
	private TransacaoRepository repository;
	
	//Escuta mensagens do topico transacoes
	@KafkaListener(topics = "${spring.kafka.topic.transactions}")
    public void ouvir(EventoDeTransacao eventoDeTransacao) {
        
		//Salva no banco de dados as transações 
        repository.save(eventoDeTransacao.toTransacao());

	}
	
}
