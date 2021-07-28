package br.com.zupacademy.jpcsik.transacao.transacao;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Map;

public class EventoDeTransacao {

    private String id;
    private BigDecimal valor;
    private Map<String, String> cartao;
    private Map<String, String> estabelecimento;
    private LocalDateTime efetivadaEm;
    
	public Transacao toTransacao() {
		return new Transacao(
				id,
				cartao.values().stream().findFirst().get(), //Pega o primeiro item do map que no caso é o numero do cartão
				estabelecimento.values().stream().findFirst().get(), //Pega o nome do estabelecimento
				valor,
				efetivadaEm);
	}

	public String getId() {
		return id;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public Map<String, String> getCartao() {
		return cartao;
	}

	public Map<String, String> getEstabelecimento() {
		return estabelecimento;
	}

	public LocalDateTime getEfetivadaEm() {
		return efetivadaEm;
	}
	
}
