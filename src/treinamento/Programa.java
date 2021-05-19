package treinamento;

public class Programa {

	public static int divide(int a, int b) {
		return fazNada(a, b);
	}

	public static int fazNada(int a, int b) {

		if (b == 0) {
			throw new ArithmeticException("nao divida por zero");
		}
		
		return a / b;
	}

	public static void main(String[] args) throws Exception {

//		if (o canto oposto  for INvalido)
//			gerar  um erro

		// continuar igual o que ja estava excrito

		int x = 8;
		int y = 0;

		int resultado = divide(x, y);

		System.out.println(resultado);

//		int resultado = 0;
//		
//		try {
//			
//			resultado = x / y;
//			System.out.println(resultado);
//			
//		} 
//		
//		catch (Exception e)
//		
//		{
//
//			throw new Exception("nao dividiu por zero");  // trow sig lançar excessão é igual ao return;
//		}
//
//		System.out.println("depois do try catch");

	}
}
