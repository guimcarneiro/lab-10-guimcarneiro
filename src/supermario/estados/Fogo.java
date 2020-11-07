package supermario.estados;

import supermario.estados.enums.EstadoMarioEnum;
import supermario.estados.interfaces.EstadoMarioInterface;

public class Fogo extends EstadoMario {

	public Fogo(int pontuacao) {
		super(pontuacao, EstadoMarioEnum.FOGO);
	}

	@Override
	public EstadoMarioInterface pegarCogumelo() {
		return new Fogo(this.getPontuacao() + 1000);
	}

	@Override
	public EstadoMarioInterface levarDano() {
		return new Grande(this.getPontuacao());
	}

	@Override
	public EstadoMarioInterface pegarFlor() {
		return new Fogo(this.getPontuacao() + 1000);
	}

}
