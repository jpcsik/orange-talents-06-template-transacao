package br.com.zupacademy.jpcsik.transacao.transacao;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.data.domain.Page;

public class TransacaoResponse {

	private String eventoTransacaoId;
	private String numeroCartao;
	private String estabelecimento;
	private BigDecimal valor;
	private LocalDateTime efetivadaEm;

	public TransacaoResponse(Transacao transacao) {
		eventoTransacaoId = transacao.getEventoTransacaoId();
		numeroCartao = transacao.getNumeroCartao();
		estabelecimento = transacao.getEstabelecimento();
		valor = transacao.getValor();
		efetivadaEm = transacao.getEfetivadaEm();
	}
	
	/*Retorna uma pagina de transacaoResponse 
	 * que serão instanciadas a partir do construtor 
	 * para cada transação que foi encontrada
	*/
	public static Page<TransacaoResponse> converter(Page<Transacao> transacoes) {
		return transacoes.map(TransacaoResponse::new);
	}

	public String getEventoTransacaoId() {
		return eventoTransacaoId;
	}

	public String getNumeroCartao() {
		return numeroCartao;
	}

	public String getEstabelecimento() {
		return estabelecimento;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public LocalDateTime getEfetivadaEm() {
		return efetivadaEm;
	}
	
}
