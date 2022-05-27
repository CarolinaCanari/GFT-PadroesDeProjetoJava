package Strategy;

public class Main {

	public static void main(String[] args) {
		CalculadoraDeImposto calculadora = new CalculadoraDeImposto();
		
		ICMS icms = new ICMS(100.0);
		IPI ipi = new IPI(200.0);
		
		System.out.println(calculadora.calcular(icms));
		System.out.println(calculadora.calcular(ipi));
		

	}

}
