
public class Fifo {
	private NodoLista head;
	private NodoLista tail;

	public Fifo() {
		this.head = null;
		this.tail = null;
	}

	public void insert(String newModel) {
		NodoLista newNodo;
		newNodo = new NodoLista(newModel);

		if (head == null) {
			head = newNodo;
			tail = newNodo;
		} else {
			tail.next = newNodo;
			tail = newNodo;
		}
	}

	public String getHead() {
		return head.model;
	}

	public String getTail() {
		return tail.model;
	}

	public void showAll() {
		NodoLista current = head;

		if (head == null) {
			System.out.println("A lista esta vazia.");
		} else {
			System.out.println("Segue abaixo a lista completa: \n");
			while (current != null) {
				System.out.println(current.model + " ");
				current = current.next;
			}
		}
	}

	public String remove() {
		String excluded = null;
		if (head != null) {
			excluded = head.model;
			head = head.next;
		}
		if (head == null) {
			tail = null;
		}
		return excluded;
	}

	public boolean search(String model) {
		NodoLista current = head;
		if (head == null) {
			System.out.println("Nao ha elementos na lista. ");
		} else {
			while (current != null) {
				if (current.model == model) {
					return true;
				}
				current = current.next;
			}
		}
		return false;
	}
	
	public void explode() {
		head = null;
		tail = null;
	}
}
