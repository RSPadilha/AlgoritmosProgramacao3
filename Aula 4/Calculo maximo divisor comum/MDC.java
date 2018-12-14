public class MDC {
  public static void main(String[] args) {
    double resposta = calcular(5, 10);
    System.out.println("Resposta: " + (int)resposta);
  }

  public static double calcular(double dividendo, double divisor) {
    if(dividendo % divisor == 0) {
      return divisor;
    } else {
      return calcular(divisor,(dividendo % divisor));
    }
  }
}