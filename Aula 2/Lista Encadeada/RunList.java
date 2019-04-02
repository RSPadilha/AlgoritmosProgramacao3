public class RunList {
	public static void main(String[] args){
		List<String> listString = new List<>();
		List<Integer> listInt = new List<>();
		listString.append("This is a test1");
		listString.append("This is a test2");
		listString.append("This is a test3");
		//testa segunda e penultima pos /arrumar
		System.out.println(listString.percorreInvertido());
		System.out.println(listString);
		listInt.append(333);
		listInt.append(3683);
		listInt.append(353);
		System.out.println(listInt+"INT");

		listString.insert(2, "na 2");
		listString.insert(3, "na 3");
		listString.insert(100, "inserido com append");
		System.out.println(listString);
		System.out.println("Print");
		listString.print();
		System.out.println("Invertido \n"+listString.percorreInvertido());

		System.out.println(listString.has("na 2"));
		listString.remove(2);
		listString.print();
	}
}