package EjerciciosClase;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class OperacionesTest {
  Operaciones operaciones;

  @Before
  public void setUp() {
    operaciones = new Operaciones();
  }

  @Test
  public void reciboCincoYTresYObtengoOcho() {
    // Arrange
    // Preparar los datos que se van a enviar para hacer la prueba
    int numeroUno = 5;
    int numeroDos = 3;

    // Act - Action
    // A dónde voy a ir?
    int resultado;
    resultado = operaciones.suma(numeroUno, numeroDos);

    // Assert
    // Validar que está bien o mal.
    assertEquals(8, resultado);

    // Toda función debe tener más de una validación, tanto éxito como fallo
    // y validar multiples veces o diferentes casos de uso.
  }

  @Test
  public void reciboCuatroYTresYObtengoSiete() {
    // Arrange
    int numeroUno = 4;
    int numeroDos = 3;

    // Act
    int resultado;
    resultado = operaciones.suma(numeroUno, numeroDos);

    // Assert
    assertEquals(7, resultado);
  }

  // Sección: "Refactor: Agregar 1."
  @Test
  public void reciboCincoYObtengoSeis() {
    // Arrange
    int numeroUno = 5;

    // Act
    int resultado = operaciones.agregarUno(numeroUno);

    // Assert
    assertEquals(6, resultado);
  }

  @Test
  public void reciboCuatroYObtengoCinco() {
    // Arrange
    int numeroUno = 4;

    // Act
    int resultado = operaciones.agregarUno(numeroUno);

    // Assert
    assertEquals(5, resultado);
  }

  // Sección: "Resta con valor absoluto."
  @Test
  public void reciboCincoYTresObtengoDos() {
    // Arrange
    int numeroUno = 5;
    int numeroDos = 3;

    // Act
    int resultado = operaciones.restaValorAbsoluto(numeroUno, numeroDos);

    // Assert
    assertEquals(2, resultado);
  }

  @Test
  public void reciboCuatroYOchoYObtengoCuatro() {
    // Arrange
    int numeroUno = 4;
    int numeroDos = 8;

    // Act
    int resultado = operaciones.restaValorAbsoluto(numeroUno, numeroDos);

    // Assert
    assertEquals(4, resultado);
  }

  // Sección: "Los panes."
  @Test
  public void reciboDosYCincoObtengoDiez() {
    // Arrange
    int numeroUno = 2;
    int numeroDos = 5;

    // Act
    int resultado = operaciones.multiplicacion(numeroUno, numeroDos);

    // Assert
    assertEquals(10, resultado);
  }

  @Test
  public void reciboSieteYTresObtengoVeintiuno() {
    // Arrange
    int numeroUno = 7;
    int numeroDos = 3;

    // Act
    int resultado = operaciones.multiplicacion(numeroUno, numeroDos);

    // Assert
    assertEquals(21, resultado);
  }

  @Test
  public void reciboDosYDosObtengoCuatro() {
    // Arrange
    int numeroUno = 2;
    int numeroDos = 2;

    // Act
    int resultado = operaciones.multiplicacion(numeroUno, numeroDos);

    // Assert
    assertEquals(4, resultado);
  }

  // Sección: "Cuando quiero compartir."
  @Test
  public void reciboSeisYDosObtengoTres() {
    // Arrange
    int numeroUno = 6;
    int numeroDos = 2;

    // Act
    int resultado = operaciones.division(numeroUno, numeroDos);

    // Assert
    assertEquals(3, resultado);
  }

  @Test
  public void reciboDiezYCincoObtengoDos() {
    // Arrange
    int numeroUno = 10;
    int numeroDos = 5;

    // Act
    int resultado = operaciones.division(numeroUno, numeroDos);

    // Assert
    assertEquals(2, resultado);
  }

  @Test
  public void reciboDosYDosObtengoUno() {
    // Arrange
    int numeroUno = 2;
    int numeroDos = 2;

    // Act
    int resultado = operaciones.division(numeroUno, numeroDos);

    // Assert
    assertEquals(1, resultado);
  }

  // Sección: "Teléfono no roto."
  @Test
  public void reciboholaYObtengohola() {
    // Arrange
    String palabraUno = "uno";

    // Act
    String resultado = operaciones.palabra(palabraUno);

    // Assert
    assertEquals("uno", resultado);
  }

  @Test
  public void reciboBancolombiaYObtengoBancolombia() {
    // Arrange
    String palabraUno = "Bancolombia";

    // Act
    String resultado = operaciones.palabra(palabraUno);

    // Assert
    assertEquals("Bancolombia", resultado);
  }

  // Sección: "Teléfono no roto."
  @Test
  public void reciboholaYObtengoCuatro() {
    // Arrange
    String palabraUno = "hola";

    // Act
    int resultado = operaciones.longitudPalabra(palabraUno);

    // Assert
    assertEquals(4, resultado);
  }

  @Test
  public void reciboBancolombiaYObtengoOnce() {
    // Arrange
    String palabraUno = "Bancolombia";

    // Act
    int resultado = operaciones.longitudPalabra(palabraUno);

    // Assert
    assertEquals(11, resultado);
  }

  // Sección: "Será o no será?"
  @Test
  public void ReciboCincoYObtendoTrue() {
    // Arrange
    int numeroUno = 5;

    // Act
    // Boolean resultado = operaciones.parOImpar(numeroUno);
    boolean resultado = operaciones.parOImpar(numeroUno);

    // Assert
    // assertEquals(true, resultado);
    assertTrue(resultado);
  }

  @Test
  public void ReciboCuatroYObtendoFalse() {
    // Arrange
    int numeroUno = 4;

    // Act
    boolean resultado = operaciones.parOImpar(numeroUno);

    // Assert
    assertFalse(resultado);
  }

  @Test
  public void ReciboTresYObtendoFalse() {
    // Arrange
    int numeroUno = 3;

    // Act
    boolean resultado = operaciones.parOImpar(numeroUno);

    // Assert
    assertFalse(resultado);
  }

  @Test
  public void ReciboDosYObtendoFalse() {
    // Arrange
    int numeroUno = 2;

    // Act
    boolean resultado = operaciones.parOImpar(numeroUno);

    // Assert
    assertFalse(resultado);
  }

  // Sección: "Ganando o perdiendo?"
  @Test
  public void ReciboCincoYObtendoTrue_Parte2() {
    int numeroUno = 5;
    boolean resultado = operaciones.positivoONegativo(numeroUno);
    assertTrue(resultado);
  }

  @Test
  public void ReciboTresNegativoYObtendoFalse() {
    int numeroUno = -3;
    boolean resultado = operaciones.positivoONegativo(numeroUno);
    assertFalse(resultado);
  }

  @Test
  public void ReciboCeroYObtendoFalse() {
    int numeroUno = 0;
    boolean resultado = operaciones.positivoONegativo(numeroUno);
    assertFalse(resultado);
  }

  @Test
  public void ReciboCincoNegativoYObtendoFalse() {
    int numeroUno = -5;
    boolean resultado = operaciones.positivoONegativo(numeroUno);
    assertFalse(resultado);
  }

  // Sección: "De dos en dos."
  @Test
  public void ReciboDosYObtengoTrue_DeDosEnDos() {
    int numeroUno = 2;
    boolean resultado = operaciones.esPar(numeroUno);
    assertTrue(resultado);
  }

  @Test
  public void ReciboTresYObtengoFalse_DeDosEnDos() {
    int numeroUno = 3;
    boolean resultado = operaciones.esPar(numeroUno);
    assertFalse(resultado);
  }

  @Test
  public void ReciboCuatroYObtengoTrue_DeDosEnDos() {
    int numeroUno = 2;
    boolean resultado = operaciones.esPar(numeroUno);
    assertTrue(resultado);
  }

  @Test
  public void ReciboCincoYObtengoFalse_DeDosEnDos() {
    int numeroUno = 5;
    boolean resultado = operaciones.esPar(numeroUno);
    assertFalse(resultado);
  }

  // Sección: "Piensa positivo."
  @Test
  public void ReciboDosYObtengoDos_PiensaPositivo() {
    int numeroUno = 2;
    int resultado = operaciones.convierteEnPositivo(numeroUno);
    assertEquals(2, resultado);
  }

  @Test
  public void ReciboCuatroNegativoYObtengoCuatro_PiensaPositivo() {
    int numeroUno = -4;
    int resultado = operaciones.convierteEnPositivo(numeroUno);
    assertEquals(4, resultado);
  }

  @Test
  public void ReciboSeisNegativoYObtengoSeis_PiensaPositivo() {
    int numeroUno = -6;
    int resultado = operaciones.convierteEnPositivo(numeroUno);
    assertEquals(6, resultado);
  }

  @Test
  public void ReciboSieteYObtengoSiete_PiensaPositivo() {
    int numeroUno = 7;
    int resultado = operaciones.convierteEnPositivo(numeroUno); // trasnformarAPositivo
    assertEquals(7, resultado);
  }

  // Sección: "Calculadora lógica P1."
  @Test
  public void reciboTrueYTrueYObtengoTrue_CalculadoraLogicaP1() {
    boolean operadorLogicoUno = true;
    boolean operadorLogicoDos = true;
    boolean resultado = operaciones.operacionLogicaAND(operadorLogicoUno, operadorLogicoDos);
    assertTrue(resultado);
  }

  @Test
  public void reciboTrueYFalseYObtengoFalse_CalculadoraLogicaP1() {
    boolean operadorLogicoUno = true;
    boolean operadorLogicoDos = false;
    boolean resultado = operaciones.operacionLogicaAND(operadorLogicoUno, operadorLogicoDos);
    assertFalse(resultado);
  }

  @Test
  public void reciboFalseYTrueYObtengoFalse_CalculadoraLogicaP1() {
    boolean operadorLogicoUno = false;
    boolean operadorLogicoDos = true;
    boolean resultado = operaciones.operacionLogicaAND(operadorLogicoUno, operadorLogicoDos);
    assertFalse(resultado);
  }

  @Test
  public void reciboFalseYFalseYObtengoFalse_CalculadoraLogicaP1() {
    boolean operadorLogicoUno = false;
    boolean operadorLogicoDos = false;
    boolean resultado = operaciones.operacionLogicaAND(operadorLogicoUno, operadorLogicoDos);
    assertFalse(resultado);
  }

  // Sección: "Calculadora lógica P2."
  @Test
  public void reciboTrueYTrueYObtengoTrue_CalculadoraLogicaP2() {
    boolean operadorLogicoUno = true;
    boolean operadorLogicoDos = true;
    boolean resultado = operaciones.operacionLogicaOR(operadorLogicoUno, operadorLogicoDos);
    assertTrue(resultado);
  }

  @Test
  public void reciboTrueYFalseYObtengoTrue_CalculadoraLogicaP2() {
    boolean operadorLogicoUno = true;
    boolean operadorLogicoDos = false;
    boolean resultado = operaciones.operacionLogicaOR(operadorLogicoUno, operadorLogicoDos);
    assertTrue(resultado);
  }

  @Test
  public void reciboFalseYTrueYObtengoTrue_CalculadoraLogicaP2() {
    boolean operadorLogicoUno = false;
    boolean operadorLogicoDos = true;
    boolean resultado = operaciones.operacionLogicaOR(operadorLogicoUno, operadorLogicoDos);
    assertTrue(resultado);
  }

  @Test
  public void reciboFalseYFalseYObtengoFalse_CalculadoraLogicaP2() {
    boolean operadorLogicoUno = false;
    boolean operadorLogicoDos = false;
    boolean resultado = operaciones.operacionLogicaOR(operadorLogicoUno, operadorLogicoDos);
    assertFalse(resultado);
  }

  // Sección: "Celebridad por color."
  @Test
  public void reciboRojoYVerdeYObtengoNavidad_CelebridadPorColor() {
    String colorUno = "Rojo";
    String colorDos = "Verde";
    String resultado = operaciones.festividades(colorUno, colorDos);
    assertEquals("navidad", resultado);
  }

  @Test
  public void reciboVerdeYNaranjaYObtengoHalloween_CelebridadPorColor() {
    String colorUno = "Verde";
    String colorDos = "Naranja";
    String resultado = operaciones.festividades(colorUno, colorDos);
    assertEquals("halloween", resultado);
  }

  @Test
  public void reciboRojoYNaranjaYObtengoPascua_CelebridadPorColor() {
    String colorUno = "Rojo";
    String colorDos = "Naranja";
    String resultado = operaciones.festividades(colorUno, colorDos);
    assertEquals("pascua", resultado);
  }

  // Sección: "El último." - | Tarea
  // @Test
  // public void reciboOchoYDiesichoYObtengoCero_ElUltimo() {
  // int numeroUno = 8;
  // int numeroDos = 18;
  // boolean resultado = operaciones.modulo(numeroUno, numeroDos);
  // assertEquals(true, resultado);
  // }

  // @Test
  // public void reciboOchoYDiesichoYObtengoCero_ElUltimo() {
  // int numeroUno = 8;
  // int numeroDos = 18;
  // int resultado = operaciones.modulo(numeroUno, numeroDos);
  // assertEquals(8, resultado);
  // }

  @Test
  public void reciboOchoYDiesichoYObtengoTrue_ElUltimo() {
    int numeroUno = 8;
    int numeroDos = 18;
    boolean resultado = operaciones.contieneNumeroAlFinal(numeroUno, numeroDos);
    assertTrue(resultado);
  }

  @Test
  public void reciboTresYCientotreceYObtengoTrue_ElUltimo() {
    int numeroUno = 3;
    int numeroDos = 113;
    boolean resultado = operaciones.contieneNumeroAlFinal(numeroUno, numeroDos);
    assertTrue(resultado);
  }

  @Test
  public void reciboSeisYCientodiesisieteYObtengoFalse_ElUltimo() {
    int numeroUno = 6;
    int numeroDos = 117;
    boolean resultado = operaciones.contieneNumeroAlFinal(numeroUno, numeroDos);
    assertFalse(resultado);
  }

  // Multiplicar sin multiplicar
  @Test
  public void reciboDosYDosYObtengoCuatro() {
    int multiplicandoUno = 2;
    int multiplicandoDos = 2;
    int resultado = operaciones.multiplicacionConCiclo(multiplicandoUno, multiplicandoDos);
    assertEquals(4, resultado);
  }

  // Multiplicar sin multiplicar
  @Test
  public void reciboTresYCuatroYObtengoDoce() {
    int multiplicandoUno = 3;
    int multiplicandoDos = 4;
    int resultado = operaciones.multiplicacionConCiclo(multiplicandoUno, multiplicandoDos);
    assertEquals(12, resultado);
  }

  @Test
  public void reciboCincoYCincoYCincoYObtengoVeintiCinco() {
    int multiplicandoUno = 5;
    int multiplicandoDos = 5;
    int resultado = operaciones.multiplicacionConCiclo(multiplicandoUno, multiplicandoDos);
    assertEquals(25, resultado);
  }

  // Potencia de dos
  @Test
  public void reciboDosYDosYObtengoCuatro_PotenciaDeDos() {
    int base = 2;
    int exponente = 2;
    int resultado = operaciones.potencia(base, exponente);
    assertEquals(4, resultado);
  }

}
