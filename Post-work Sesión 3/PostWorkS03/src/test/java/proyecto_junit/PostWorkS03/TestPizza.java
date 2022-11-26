package proyecto_junit.PostWorkS03;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestPizza {

//	CommonMethods Common;
	PizzaOrden nuevaOrden;
	String stdOutputPath;

//	@BeforeClass
//	public void initialConditions() {
//		stdOutputPath = "output_files/output.txt";
//		Common = new CommonMethods(stdOutputPath);
//	}

	@BeforeTest
	public void preConditions() {
		nuevaOrden = new PizzaOrden();
	}

//	@Test
//	// Test de ejemplo 1
//	public void verificarMensajeDeInicioSeDespliega() throws FileNotFoundException {
//		Common.redirectStdOutput();
//		nuevaOrden.desplegarMensajeInicio();
//
//		String actualResult = Common.readFileContents();
//		String expectedResult = "Bienvenido a la aplicación para ordenar pizza.\n\n"
//				+ "Sigue las instrucciones por favor.\n\n";
//
//		Assert.assertEquals(actualResult, expectedResult);
//	}

//	@Test
//	// Test de ejemplo
//	public void verificarOpcionVeganaVerdadera() {
//		nuevaOrden.setOpcionVeg("Y");
//		boolean actualResult = nuevaOrden.getOpcionVeg();
//		boolean expectedResult = true;
//		Assert.assertEquals(actualResult, expectedResult);
//	}

	/*
	 * Ejercicio 1: Formula al menos 8 pruebas unitarias
	 */

	// Test 1
	@Test
	public void verificarOpcionVeganaFalso() {
		nuevaOrden.setOpcionVeg("N");
		boolean actualResult = nuevaOrden.getOpcionVeg();
		boolean expectedResult = false;
		Assert.assertEquals(actualResult, expectedResult);
	}

	// Test 2
	@Test
	public void verificaIngredientesVeganos() {
		nuevaOrden.setOpcionVeg("Y");
		boolean actualResult = nuevaOrden.getOpcionVeg();
		boolean expectedResult = true;
		Assert.assertEquals(actualResult, expectedResult);
	}

	// Test 3
	@Test
	public void verificaIngredientePimiento() {
		nuevaOrden.setIngrediente1("a");
		String actualIngredient = nuevaOrden.getIngrediente1();
		String expectedIngredient = "Pimiento";
		Assert.assertEquals(actualIngredient, expectedIngredient);
	}

	// Test 4
	@Test
	public void verificaIngredienteHongos() {
		nuevaOrden.setIngrediente1("b");
		String actualIngredient = nuevaOrden.getIngrediente1();
		String expectedIngredient = "Hongos";
		Assert.assertEquals(actualIngredient, expectedIngredient);
	}

	// Test 5
	@Test
	public void verificaIngredienteEspinaca() {
		nuevaOrden.setIngrediente1("c");
		String actualIngredient = nuevaOrden.getIngrediente1();
		String expectedIngredient = "Espinaca";
		Assert.assertEquals(actualIngredient, expectedIngredient);
	}

	// Test 6
	@Test
	public void verificaIngredientePepperoni() {
		nuevaOrden.setOpcionVeg("N");
		boolean actualResult = nuevaOrden.getOpcionVeg();
		boolean expectedResult = false;
		Assert.assertTrue(actualResult == expectedResult);
		nuevaOrden.setIngrediente1("d");
		String actualIngredient = nuevaOrden.getIngrediente1();
		String expectedIngredient = "Pepperoni";
		Assert.assertEquals(actualIngredient, expectedIngredient);
	}

	// Test 7
	@Test
	public void verificaIngredienteJamon() {
		nuevaOrden.setOpcionVeg("N");
		boolean actualResult = nuevaOrden.getOpcionVeg();
		boolean expectedResult = false;
		Assert.assertTrue(actualResult == expectedResult);
		nuevaOrden.setIngrediente1("e");
		String actualIngredient = nuevaOrden.getIngrediente1();
		String expectedIngredient = "Jamon";
		Assert.assertEquals(actualIngredient, expectedIngredient);

	}

	// Test 8
	@Test
	public void verificaIngredienteSalchicha() {
		nuevaOrden.setOpcionVeg("N");
		boolean actualResult = nuevaOrden.getOpcionVeg();
		boolean expectedResult = false;
		Assert.assertTrue(actualResult == expectedResult);
		nuevaOrden.setIngrediente1("f");
		String actualIngredient = nuevaOrden.getIngrediente1();
		String expectedIngredient = "Salchicha";
		Assert.assertEquals(actualIngredient, expectedIngredient);
	}
}
