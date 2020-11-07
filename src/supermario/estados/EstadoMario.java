package supermario.estados;

import supermario.estados.enums.EstadoMarioEnum;
import supermario.estados.interfaces.EstadoMarioInterface;

public abstract class EstadoMario implements EstadoMarioInterface {
	
	private int pontuacao;
	
	private EstadoMarioEnum estado;
	
	public EstadoMario(int pontuacao, EstadoMarioEnum estado) {
		this.pontuacao = pontuacao;
		this.estado = estado;
	}
	
	public int getPontuacao() {
		return this.pontuacao;
	}
	
	public EstadoMarioEnum getEstado() {
		return this.estado;
	}
	
}
