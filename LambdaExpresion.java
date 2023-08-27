package expresionesLambda;
/**
 * @author Antonio Ruiz Benito -> SpeedDemoN
 */
public class LambdaExpresion {

	static final IntegerArithmetic PRODUCT = (a, b) -> a * b;
	
	interface IntegerArithmetic {
		int operation(int a, int b);
	}
	
	public static int binaryOperation(int x, int y, IntegerArithmetic ae) {
		return ae.operation(x, y);
	}
	
	static class Sum implements IntegerArithmetic {

		@Override
		public int operation(int a, int b) {
			return a + b;
		}
		
	}
	
	public static void main(String[] args) {

		System.out.println("3 + 29 = " + binaryOperation(3, 29, new Sum())); // Sumamos pasando un objeto de la clase Sum
		
		System.out.println("1000 - 100 = " + binaryOperation(1000, 100, (a , b) -> a - b)); // Restamos utilizando una expresion lambda
		
		System.out.println("2 * 23 = " + binaryOperation(2, 23, PRODUCT)); // Multiplixamos utilizando la constante con la expresion lambda
		
		System.out.println("50 / 5 = " + binaryOperation(50, 5, (a , b) -> a / b)); // Dividimos utilizando una expresion lambda
		
		System.out.println("6 ^ 2 = " + binaryOperation(6, 2, (a , b) -> (int) Math.pow(a, b))); // Calculamos la potencia de un numero
		
	}
	
}
