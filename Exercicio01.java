package ArrayList;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Exercicio01 {

	public static void main(String[] args) {
		/*
		 * Adicionar Elementos: Crie um ArrayList e adicione alguns elementos a ele.
		 * Depois, imprima o ArrayList para verificar se os elementos foram adicionados
		 * corretamente.
		 */

		String preencheArray = null;

		ArrayList<String> elementos = new ArrayList<>();

		int limite = 5;

		try {

			for (int i = 0; i < limite; i++) {

				preencheArray = JOptionPane.showInputDialog(null, "Preencha o array");

				elementos.add(preencheArray);

				System.out.println(elementos.get(i));

			}

		} catch (NullPointerException | NumberFormatException e) {

			JOptionPane.showMessageDialog(null,
					"O programa foi encerrado de maneira incoreta , ou ocorreu outro erro inesperado");

		}

	}
}
