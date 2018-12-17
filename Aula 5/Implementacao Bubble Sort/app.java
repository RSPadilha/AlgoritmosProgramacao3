// DOCUMENTACAO https://docs.oracle.com/javase/7/docs/api/java/util/Comparator.html
// EXEMPLO http://blog.caelum.com.br/ordenando-colecoes-com-comparable-e-comparator/
// JAVA8 http://blog.caelum.com.br/o-minimo-que-voce-deve-saber-de-java-8/
import java.util.Collections;
import java.util.Vector;

public class app {
	public static void main(String[] args) {
		Vector<Integer> vector = new Vector<Integer>();
		vector.add(3);
		vector.add(7);
    vector.add(9);
    vector.add(5);
    vector.add(6);
    vector.add(8);
    vector.add(2);
    vector.add(1);
    vector.add(4);

		// int[] numeros = {3, 7, 9, 5, 6, 8, 2, 1, 4};
		System.out.println(vector);
		Collections.sort(vector);
		System.out.println(vector);
	}

}