package principal;

public class Animal {

	private String cor;
	private String nome;
	// TextColor corTerminal; teria de pegar do material do professor do arquivo

	/**
	 * esse metodo define/escolhe/ cor que sera atribuida ao animal
	 * @param  corUsuarioInformou
	 */
	public void setCor(String corUsuarioInformou) {
		 cor = corUsuarioInformou;
	}
	
	/**
	 * esse metodo devolve/acessar/consulta/ retorna a cor do animal
	 * @return
	 */
	public String getCor() {
		return cor;
	}
	
	public void setNome(String nomeQueOUsuarioPassou) {
		nome = nomeQueOUsuarioPassou;
	}

	public void dormir() {
		System.out.print("zzzzzzzzzzzzzzzzzzzzzzz   ");
	}

	public void imprimirCor() {
		System.out.print(cor + "   ");
	}

	public void imprimirNomeDoAnimal() {
		System.out.print(nome + "   ");
	}

}
