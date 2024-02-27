package controller;

public class OperacoesController {
	public OperacoesController() {
		// TODO Auto-generated constructor stub
	}
	
	public int multiplicar(int num1, int num2) {
		
		if(num2 == 0)
			return 0;
		
		if(num2 < 0)
			return -(num1) + multiplicar(num1, ++num2);
		
		return num1 + multiplicar(num1, --num2);
		
	}
}
