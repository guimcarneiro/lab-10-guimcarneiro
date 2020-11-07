package supermario;

import supermario.estados.GerenciadorEstado;
import supermario.estados.enums.EstadoMarioEnum;

public class Mario {
	
	private GerenciadorEstado estado;
	
	public Mario() {
		this.estado = new GerenciadorEstado();
	}
	
	public void pegarCogumelo() {
		this.estado.pegarCogumelo();
	}
	
	public void levarDano() {
		this.estado.levarDano();
	}
	
	public void pegarFlor() {
		this.estado.pegarFlor();
	}
	
	public int getPontuacao() {
		return this.estado.getPontuacao();
	}
	
	public EstadoMarioEnum getEstadoAtual() {
		return this.estado.getEstado();
	}
	
}
