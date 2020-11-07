package supermario;

public class Cliente {
	
	/*
	 * 118210938 - Guilherme de Melo Carneiro
	 * 
	 * Comentários:
	 * 
	 * O código fornecido possuía bastante acoplamento e complexidade concentrados em somente uma classe(Mario),
	 * tornando assim um código de difícil manutenção e expansão. Novas funcionalidades iriam provocar mudanças
	 * acentuadas no código já existente, e não aconteceriam predominantemente por adição de código, que seria o
	 * desejável. Caso houvesse a necessidade de acrescentar mais um estado e seu comportamento, o risco do surgi-
	 * mento de bugs seria muito maior, além de desacelerar o desenvolvimento de uma funcionalidade relativamente
	 * simples.
	 * 
	 * O presente refatoramento se baseou no Design Pattern State como solução para o gerenciamento de estado do
	 * Super Mario, e também para a personalização das transições de estado(MARIO PEQUENO, MARIO GRANDE, MARIO FOGO).
	 * Esse padrão solucionou perfeitamente o problema dada sua capacidade de variar comportamento em tempo de execução,
	 * expondo ainda uma interface facilitada para expansões futuras(com os métodos base: levarDano, pegarFlor,
	 * pegarCogumelo).
	 * 
	 * Foi utilizada herança para compartilhar os atributos em comum entre todos os estados do Mario(pontuação e estado)
	 * e permitir reuso de código, mantendo o foco das subclasses somente na implementação dos métodos da interface
	 * requerida pelo padrão State(levarDano, pegarFlor, pegarCogumelo). Além disso, foi utilizado Enum para permitir
	 * ao cliente conferir qual é o estado atual do Mariode maneira controlada, evitando Strings.
	 * 
	 * Uma classe gerenciadora de estado do Mario foi utilizada para expor somente a interface desejada, escondendo 
	 * complexidade e somente repassando a responsabilidade para as classes de implementação(subclasses de EstadoMario).
	 * 
	 */
	
	public static void main(String[] args) {
	    Mario mario = new Mario();
	    try {
		    mario.pegarCogumelo();
		    mario.levarDano();
		    mario.pegarFlor();
		    mario.pegarFlor();
		    mario.levarDano();
		    mario.levarDano();
		    mario.levarDano();
		    mario.levarDano();
		    mario.levarDano();
	    } catch(Exception e) {
	    		System.out.println("Acabou o jogo");
	    }
	}
}
