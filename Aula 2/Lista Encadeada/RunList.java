import java.util.Scanner;
public class RunList {
	static List<String> listString = new List<>();
	public static void main(String[] args){
		List<Integer> listInt = new List<>();
		// listString.append("This is a test1");
		// listString.append("This is a test2");
		// listString.append("This is a test3");
		// //testa segunda e penultima pos /arrumar
		// System.out.println(listString.percorreInvertido());
		// System.out.println(listString);
		// listInt.append(333);
		// listInt.append(3683);
		// listInt.append(353);
		// System.out.println(listInt+"INT");
		//
		// listString.insert(2, "na 2");
		// listString.insert(3, "na 3");
		// listString.insert(100, "inserido com append");
		// System.out.println(listString);
		// System.out.println("Print");
		// listString.print();
		// System.out.println("Invertido \n"+listString.percorreInvertido());
		//
		// System.out.println(listString.has("na 2"));
		// listString.remove(2);
		// listString.print();
		menu();
	}

	private static void menu() {
		String output = "Usage:\n"+
			"	add <value>\n"+
			"	insert <index> <value>\n"+
			"	getValue <index>\n"+
			"	getIndex <value>\n"+
			"	show\n"+
			"	equal <index> <index>\n"+
			"	exist <value>\n"+
			"	getSize\n"+
			"	remove <index>\n"+
			"	removeLast\n"+
			"	removeFirst\n"+
			"	clear\n"+
			"	exit";
		System.out.println(output);
		String op = null;
		Scanner input = new Scanner(System.in);

		while(true) {
			op = input.nextLine();
			String[] parts = op.split(" ", 2);
			switch(parts[0]) {
				case "add":
				listString.append(parts[1]);
				System.out.println("Added "+parts[1]+" to the list");
					break;
				case "insert":

				// Prepare to divide index from the message
					// listString.insert();
					break;
				case "getValue":
				// Create method
					break;
				case "getIndex":
					break;
					case "show":
					System.out.println(listString);
					break;
				case "equal":
					break;
				case "exist":
					break;
				case "getSize":
					System.out.println(listString.getSize());
					break;
				case "remove":
					listString.remove(Integer.parseInt(parts[1]));
					break;
				case "removeLast":
				//Tratar quando lista está vazia
					listString.remove(listString.getSize());
					break;
				case "removeFirst":
					listString.remove(1);
					break;
				case "clear":
					for (int i = listString.getSize(); i > 0; i--) {

					}
					break;
				case "exit":
				return;
				default:
					System.out.println("No such option available");
					break;
			}
		}
	}
}