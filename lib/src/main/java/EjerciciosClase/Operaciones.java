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

  public boolean parOImpar(int numeroUno) {

    // if (numeroUno == 4) {
    // return false;
    // } else {
    // return true;
    // }

    // if (numeroUno == 4) {
    // return false;
    // }
    // return true;

    // if (numeroUno == 4 || numeroUno == 3)
    // return false;
    // return true;

    // if (numeroUno < 5)
    // return false;
    // return true;

    if (numeroUno != 5)
      return false;
    return true;

  }

  public boolean positivoONegativo(int numeroUno) {
    if (numeroUno < 1)
      return false;
    return true;
  }

  public boolean esPar(int numeroUno) {
    if (numeroUno % 2 == 0)
      return true;
    return false;
  }

  public int convierteEnPositivo(int numeroUno) {
    // if (numeroUno < 0) {
    // return numeroUno * -1;
    // } else {
    // return numeroUno;
    // }

    return Math.abs(numeroUno);
  }

  public boolean operacionLogicaAND(boolean expresionUno, boolean expresionDos) {
    if (expresionUno && expresionDos) {
      return true;
    } else {
      return false;
    }
  }

  public boolean operacionLogicaOR(boolean expresionUno, boolean expresionDos) {
    if (expresionUno || expresionDos) {
      return true;
    } else {
      return false;
    }
  }

  public String festividades(String colorUno, String colorDos) {
    if ("rojo".equalsIgnoreCase(colorUno) && "verde".equalsIgnoreCase(colorDos))
      return "navidad";
    else if ("verde".equalsIgnoreCase(colorUno) && "naranja".equalsIgnoreCase(colorDos))
      return "halloween";
    else if ("rojo".equalsIgnoreCase(colorUno) && "naranja".equalsIgnoreCase(colorDos))
      return "pascua";
    else
      return null;

  }

  // public boolean modulo(int numeroUno, int numeroDos) {
  // String numCadena = String.valueOf(numeroDos);
  // int lastElement = 0;

  // for (int i = 0; i < numCadena.length(); i++) {
  // if (i == numCadena.length() - 1)
  // lastElement = i;
  // }
  // if (lastElement == numeroUno)
  // return true;
  // else
  // return false;
  // }

  // public int modulo(int numeroUno, int numeroDos) {
  // String numCadena = String.valueOf(numeroDos);
  // int lastElement = 0;

  // for (int i = 0; i < numCadena.length(); i++) {
  // if (i == numCadena.length() - 1)
  // lastElement = i;
  // }
  // if (lastElement == numeroUno)
  // return lastElement;
  // else
  // return lastElement;
  // }

  // public boolean contieneNumeroAlFinal(int numeroUno, int numeroDos) {
  //   String numCadena1 = String.valueOf(numeroUno);
  //   String numCadena2 = String.valueOf(numeroDos);
  //   // if (numCadena2.endsWith(numCadena1))
  //   //   return true;
  //   // else
  //   //   return false;
  //   return numCadena2.endsWith(numCadena1);
  // }

  public boolean contieneNumeroAlFinal(int numeroUno, int numeroDos) {
    if (numeroUno == numeroDos % 10) {
      return true;
    } else {
      return false;
    }
  }

  public int multiplicacionConCiclo(int multiplicandoUno, int multiplicandoDos) {
    int resultado = 0;
    for (int i = 0; i < multiplicandoDos; i++) {
      resultado = resultado + multiplicandoUno;
    }
    return resultado;
  }
}
