import java.util.Scanner;
public class RunList {
	static List<String> list = new List<>();
	public static void main(String[] args){
		list.append("This is a test1");
		list.append("This is a test2");
		list.append("This is a test3");
		menu();
	}

	private static void menu() {
		String output = "Usage:\n"+
			"	add <value>\n"+
			"	insert <index> <value>\n"+
			"	getValue <index>\n"+
			"	getIndex <value>\n"+
			"	show\n"+
			"	inverted\n"+
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
				list.append(parts[1]);
				System.out.println("Added "+parts[1]+" to the list");
					break;
				case "insert":

				// Prepare to divide index from the message
					// list.insert();
					break;
				case "getValue":
				// Create method
					break;
				case "getIndex":
					break;
					case "show":
					System.out.println(list);
					break;
				case "inverted":
					System.out.println(list.percorreInvertido());
					break;
				case "equal":
					break;
				case "exist":
					System.out.println(list.has(parts[1]));
					break;
				case "getSize":
					System.out.println(list.getSize());
					break;
				case "remove":
					list.remove(Integer.parseInt(parts[1]));
					break;
				case "removeLast":
				//Tratar quando lista está vazia
					list.remove(list.getSize());
					break;
				case "removeFirst":
					list.remove(1);
					break;
				case "clear":
					for (int i = list.getSize(); i > 0; i--) {
						list.remove(i);
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