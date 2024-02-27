package view;

import controller.OperacoesController;

public class Principal {

	public static void main(String[] args) {
		
		OperacoesController opController = new OperacoesController();
		
		System.out.println(opController.multiplicar(-5, -9));

	}

}
