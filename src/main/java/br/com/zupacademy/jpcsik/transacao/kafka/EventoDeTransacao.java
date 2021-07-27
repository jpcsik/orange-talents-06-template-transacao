package br.com.zupacademy.jpcsik.transacao.kafka;

import java.math.BigDecimal;

public class EventoDeTransacao {

    private String id;

    private BigDecimal valor;
    
    
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	@Override
	public String toString() {
		return "EventoDeTransacao [id=" + id + ", valor=" + valor + "]";
	}
    
}
