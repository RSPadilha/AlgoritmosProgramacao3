// DOCUMENTACAO https://docs.oracle.com/javase/7/docs/api/java/util/Comparator.html
// EXEMPLO http://blog.caelum.com.br/ordenando-colecoes-com-comparable-e-comparator/
// JAVA8 http://blog.caelum.com.br/o-minimo-que-voce-deve-saber-de-java-8/
public class app implements Comparable {

	public int compareTo(int v1, int v2) {
			if (v1 < v2) {
				return -1;
			} else if (v1 > v2) {
				return 1;
			}
			return 0;
		}

	public static void main(String[] args) {
		int[] numeros = new int[10];

				Collections.sort(numeros);
	}
}