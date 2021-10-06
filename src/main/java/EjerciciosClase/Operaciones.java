package EjerciciosClase;

public class Operaciones {

  public int suma(int numeroUno, int numeroDos) {
    return numeroUno + numeroDos;
  }

  public int agregarUno(int numeroUno) {
    // return numeroUno + 1;
    return ++numeroUno;
  }

  public int restaValorAbsoluto(int numeroUno, int numeroDos) {
    return Math.abs(numeroUno - numeroDos);
  }

  public int multiplicacion(int numeroUno, int numeroDos) {
    return numeroUno * numeroDos;
  }

  public int division(int numeroUno, int numeroDos) {
    return numeroUno / numeroDos;
  }

  public String palabra(String palabraUno) {
    return palabraUno;
  }

  public int longitudPalabra(String palabraUno) {
    return palabraUno.length();
  }

}
