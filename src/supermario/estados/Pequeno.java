package supermario.estados;

import supermario.estados.enums.EstadoMarioEnum;
import supermario.estados.interfaces.EstadoMarioInterface;

public class Pequeno extends EstadoMario {

	public Pequeno(int pontuacao) {
		super(pontuacao, EstadoMarioEnum.PEQUENO);
	}

	@Override
	public EstadoMarioInterface pegarCogumelo() {
		return new Grande(this.getPontuacao());
	}

	@Override
	public EstadoMarioInterface levarDano() {
		throw new RuntimeException("Mario morreu");
	}

	@Override
	public EstadoMarioInterface pegarFlor() {
		return new Fogo(this.getPontuacao());
	}

}
