package supermario.estados;

import supermario.estados.enums.EstadoMarioEnum;
import supermario.estados.interfaces.EstadoMarioInterface;

public class GerenciadorEstado {
	
	private EstadoMarioInterface estado;

	public GerenciadorEstado() {
		this.estado = new Pequeno(0);
	}
	
	public void pegarCogumelo() {
		this.estado = this.estado.pegarCogumelo();
	}

	public void levarDano() {
		this.estado = this.estado.levarDano();
	}

	public void pegarFlor() {
		this.estado = this.estado.pegarFlor();
	}

	public int getPontuacao() {
		return this.estado.getPontuacao();
	}
	
	public EstadoMarioEnum getEstado() {
		return this.estado.getEstado();
	}
	
}
