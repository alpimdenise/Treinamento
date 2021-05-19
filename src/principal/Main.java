package principal;

//import com.googlecode.lanterna.TextColor;

public class Main {

	public static void main(String[] args) {  // ORIGEM (5,1) CO (4,2)
//Eixo X ->123456789
//		1    XX
//		2    XX  
//		3  
//		4
//		5
//		6
//		7
		  // CANTO OPOSTO VALIDO: 
		  // O VALOR DO CANTO OPOSTO, DEVE SER MAIOR OU IGUAL AO X DA ORIGEM O K VIER APOS N IMPORTA
		 
		  //CANTO OPOSTO INVALIDO:
		  // O VALOR DO CANTO OPOSTO, DEVE ser MENOR QUE O X DA ORIGEM, O K VIER APOS N IMPORTA
		
		  //OBS: PARA Y FUNCIONA DE FORMA ANALOGA 
		
		
		
		Pantera pantera = new Pantera();
		pantera.setNome("Pantico");

//		pantera.imprimirNomeDoAnimal();
//		pantera.rugido();
//		pantera.dormir();
//
//		pantera.cor = "Brown";
//		System.out.println(pantera.cor);

		Tigre tigre = new Tigre();
		tigre.setNome("Taylor");

//		tigre.imprimirNomeDoAnimal();
//		tigre.dormir();
//
//		tigre.cor = "Gray";		// variavel que defini a cor
//		tigre.imprimirCor();

		Zoologico zoo = new Zoologico();

		zoo.setMacaco(tigre);

		zoo.getMacaco().imprimirNomeDoAnimal();
		// zoo.macaco.imprimirNomeDoAnimal();

		zoo.getMacaco().setCor("orange");
		//zoo.macaco.cor = "orange"; // defini a cor / atribui
		
		zoo.getMacaco().imprimirCor();
		//zoo.macaco.imprimirCor();

		zoo.getMacaco().dormir();
		//zoo.macaco.dormir();
		
		zoo.setPantera(pantera);		
		//zoo.pantera = pantera;
		
		zoo.getPantera().imprimirNomeDoAnimal();
		//zoo.pantera.imprimirNomeDoAnimal();
		
		zoo.getPantera().setNome("B");
		//zoo.pantera.nome = "Z"; // nao imprimiu o z pq nao dei o comando de imprimir system

		
		zoo.getPantera().imprimirNomeDoAnimal();
		
		
		// pantera.corTerminal = TextColor.ANSI.WHITE;

//		int quantidade = 5;
//
//		for (int i = 0; i < quantidade; i++) {
//
//			System.out.println(i);
//			// conteudo
//			System.out.println("Denise");
//
//		}

	}

}
