package br.com.zupacademy.jpcsik.transacao.transacao;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
public class Transacao {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@NotBlank
	private String eventoTransacaoId;
	@NotBlank
	private String numeroCartao;
	@NotBlank
	private String estabelecimento;
	@NotNull
	private BigDecimal valor;
	@NotNull
	private LocalDateTime efetivadaEm;
	
	@Deprecated
	public Transacao() {
	}

	public Transacao(@NotBlank String eventoTransacaoId, @NotBlank String numeroCartao, @NotBlank String estabelecimento,
			@NotNull BigDecimal valor, @NotNull LocalDateTime efetivadaEm) {
		this.eventoTransacaoId = eventoTransacaoId;
		this.numeroCartao = numeroCartao;
		this.estabelecimento = estabelecimento;
		this.valor = valor;
		this.efetivadaEm = efetivadaEm;
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
