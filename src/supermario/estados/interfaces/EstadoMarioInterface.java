package supermario.estados.interfaces;

import supermario.estados.enums.EstadoMarioEnum;

public interface EstadoMarioInterface {
	
	public EstadoMarioInterface pegarCogumelo();
	
	public EstadoMarioInterface levarDano();
	
	public EstadoMarioInterface pegarFlor();
	
	public int getPontuacao();
	
	public EstadoMarioEnum getEstado();
	
}
