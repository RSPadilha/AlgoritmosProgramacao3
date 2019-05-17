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
			"	modify <index> <value>\n"+
			"	getValue <index>\n"+
			"	getIndex <value>\n"+
			"	show\n"+
			"	inverted\n"+
			"	equal <index> <index>\n"+
			"	has <value>\n"+
			"	getSize\n"+
			"	remove <index>\n"+
			"	removeLast\n"+
			"	removeFirst\n"+
			"	clear\n"+
			"	menu\n"+
			"	exit";
		System.out.println(output);
		String op = null;
		Scanner input = new Scanner(System.in);
		while(true) {
			op = input.nextLine();
			String[] parts = op.split(" ", 2);
			switch(parts[0].toLowerCase()) {
				// Treat case there's no second part in the array(missing arguments)
				case "add":
				list.append(parts[1]);
				System.out.println("Added \""+parts[1]+"\" to the list");
					break;
				case "insert":
					String[] insert = parts[1].split(" ", 2);
					try {
						list.insert(Integer.parseInt(insert[0]), insert[1]);
						// Handle if the number is greater than the size
						System.out.println("Inserted \""+ insert[1] +"\" at position " +insert[0]);
					} catch (Exception e) {
						System.out.println("Invalid");
					}
					break;
				case "modify":
					String[] modify = parts[1].split(" ", 2);
					try {
						list.modify(Integer.parseInt(modify[0]), modify[1]);
					} catch (Exception e) {
						System.out.println("Invalid");
					}
					break;
				case "getvalue":
					try {
						int in = Integer.parseInt(parts[1]);
						// Want to declare a generic type here. If this not work, can change to Strin, in this case
						Object val = list.getValue(in);
						if (val == null) {
							// List resposability to tell the error, but cannot return String
							System.out.println("Invalid index");
						} else {
							System.out.println(val);
						}
					} catch (Exception e) {
						System.out.println("Invalid");
					}
					break;
				case "getindex":
					list.getIndex(parts[1]);
					break;
				case "show":
					System.out.println(list);
					break;
				case "inverted":
					System.out.println(list.percorreInvertido());
					break;
				case "equal":
				try {
					String[] equal = parts[1].split(" ", 2);
					boolean result = list.equal(Integer.parseInt(equal[0]), Integer.parseInt(equal[1]));
					System.out.println(result);
					} catch (Exception e) {
						System.out.println("Invalid");
					}
					break;
				case "has":
					System.out.println(list.has(parts[1]));
					break;
				case "getsize":
					System.out.println(list.getSize());
					break;
				case "remove":
					try {
						list.remove(Integer.parseInt(parts[1]));
					} catch(Exception e) {
						System.out.println("Invalid");
					}
					break;
				case "removelast":
				//Tratar quando lista está vazia
					list.remove(list.getSize());
					break;
				case "removefirst":
					list.remove(1);
					break;
				case "clear":
					for (int i = list.getSize(); i > 0; i--) {
						list.remove(i);
					}
					break;
				case "menu":
					System.out.println(output);
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