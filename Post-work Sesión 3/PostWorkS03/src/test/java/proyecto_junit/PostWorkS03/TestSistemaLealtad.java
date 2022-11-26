package proyecto_junit.PostWorkS03;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestSistemaLealtad {

	SistemaLealtad nuevaOrden;

	@BeforeTest
	public void beforeTest() {
		nuevaOrden = new SistemaLealtad();
	}

	// Test 1
	@Test
	public void verificarClienteSinTarjeta() {
		nuevaOrden.setEstatusTarjeta(false);
		Assert.assertEquals(nuevaOrden.getEstatusTarjeta(), false);
	}

	// Test 2
	@Test
	public void verificarClienteConTarjeta() {
		nuevaOrden.setEstatusTarjeta(true);
		Assert.assertEquals(nuevaOrden.getEstatusTarjeta(), true);
	}

	// Test 3
	@Test
	public void verificarSaldoMenorA50() {
		nuevaOrden.setSaldoPuntos(49);
		Assert.assertEquals(nuevaOrden.mostrarProductosExtras(), "");
	}

	// Test 4
	@Test
	public void verificarSaldoEntre50Y100() {
		nuevaOrden.setSaldoPuntos(50);
		Assert.assertEquals(nuevaOrden.mostrarProductosExtras(), "Espagueti");
		Assert.assertEquals(nuevaOrden.getEstatusCupon(), false);
	}

	// Test 5
	@Test
	public void verificarSaldoEntre100Y150() {
		nuevaOrden.setSaldoPuntos(101);
		Assert.assertEquals(nuevaOrden.mostrarProductosExtras(), "Espagueti,Queso Extra");
		Assert.assertEquals(nuevaOrden.getEstatusCupon(), false);
	}

	// Test 6
	@Test
	public void verificarSaldoMayorA150() {
		nuevaOrden.setSaldoPuntos(151);
		Assert.assertEquals(nuevaOrden.mostrarProductosExtras(), "Espagueti,Queso Extra,Cupon Pizza Gratis");
		Assert.assertEquals(nuevaOrden.getEstatusCupon(), false);
	}

	// Test 7
	@Test
	public void verificarGuardarCupon() {
		nuevaOrden.usarCupon("N");
		Assert.assertEquals(nuevaOrden.getEstatusCupon(), true);
	}

	// Test 8
	@Test
	public void verificarNoGuardarCupon() {
		nuevaOrden.usarCupon("Y");
		Assert.assertEquals(nuevaOrden.getEstatusCupon(), false);
	}
}
