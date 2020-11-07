package supermario.estados;

import supermario.estados.enums.EstadoMarioEnum;
import supermario.estados.interfaces.EstadoMarioInterface;

public class Grande extends EstadoMario {

	public Grande(int pontuacao) {
		super(pontuacao, EstadoMarioEnum.GRANDE);
	}

	@Override
	public EstadoMarioInterface pegarCogumelo() {
		return new Grande(this.getPontuacao() + 1000);
	}

	@Override
	public EstadoMarioInterface levarDano() {
		return new Pequeno(this.getPontuacao());
	}

	@Override
	public EstadoMarioInterface pegarFlor() {
		return new Fogo(this.getPontuacao());
	}

}
