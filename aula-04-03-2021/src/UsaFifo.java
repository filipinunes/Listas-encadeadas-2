import javax.swing.JOptionPane;

public class UsaFifo {

	public static void main(String[] args) {
		Fifo f = new Fifo();
		
		int opt;
		do {
			String input = JOptionPane.showInputDialog("Menu "
					+ "\n1 - inserir " 
					+ "\n2 - retirar " 
					+ "\n3 - mostrar"
					+ "\n4 - procurar" 
					+ "\n5 - detonar" 
					+ "\n9 - sair");
			
			opt = Integer.parseInt(input);
			switch (opt) {
			case 1:
				String newModel = JOptionPane.showInputDialog("Digite o novo elemento da fila: ");
				f.insert(newModel);
				break;
			case 2:
				String result = f.remove();
				if (result == null) {
					System.out.println("Nao ha elementos para retirar da fila.");
				} else {
					System.out.println("O elemento " + result + " foi retirado da fila.");
				}
				break;
			case 3:
				f.showAll();
				break;
			case 4:
				String model = JOptionPane.showInputDialog("Digite o elemento que deseja procurar");
				if(f.search(model)==true) {
					System.out.println("Elemento encontrado.");
				}else {
					System.out.println("Elemento nao encontrado.");
				}
				break;

			case 5:
				f.explode();
				break;
			}

		} while (opt != 9);
	}
}
