package principal;

public class Zoologico {

	private Animal tigre;
	private Animal pantera;
	private Animal macaco;
	private Animal cobra;
	
	public void setTigre(Animal animalQueoUsuarioPassou) {
		tigre = animalQueoUsuarioPassou;
	}

	public Animal getTigre() {
		return tigre;
	}

	public void setPantera(Animal animalQueAnimalUsuarioPassou) {
		pantera = animalQueAnimalUsuarioPassou;
	}

	public Animal getPantera() {
		return pantera;
	}

	/**
	 * Esse método coloca um animal na vaga que se chama 'Macaco'
	 * 
	 * @param animalDigitadoPeloUsuario
	 */
	public void setMacaco(Animal animalDigitadoPeloUsuario) {
		macaco = animalDigitadoPeloUsuario;
	}

	/**
	 * Esse método retorna o animal que está guardado na jaula/espaço chamado
	 * 'Macaco'
	 * 
	 * @return
	 */
	public Animal getMacaco() {
		return macaco;
	}

	public Animal getCobra() {
		return cobra;
	}

	public void setCobra(Animal cobra) {
		this.cobra = cobra;
	}
}
