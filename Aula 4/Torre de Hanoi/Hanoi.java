public class Hanoi {
  public static void run(int n, int Origem, int Destino, int Auxiliar) {
    if (n > 0) {
      // Chama o proprio metodo até o numero de pinos chegar a 1, entao sai do loop e move
      run(n - 1, Origem, Auxiliar, Destino);
      // Move quando acabar a recursividade acima
      System.out.println(Origem + " -> " + Destino);
      run(n - 1, Auxiliar, Destino, Origem);
    }
  }
}