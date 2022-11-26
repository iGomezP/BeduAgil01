package proyecto_junit.PostWorkS03;

public class SistemaLealtad {

	private boolean estatusTarjeta;
	private int saldoPuntos;
	@SuppressWarnings("unused")
	private boolean estatusCupon;

	public boolean getEstatusTarjeta() {
		return this.estatusTarjeta;
	}

	public void setEstatusTarjeta(boolean estatusTarjeta) {
		this.estatusTarjeta = estatusTarjeta;
	}

	public int getSaldoPuntos() {
		return saldoPuntos;
	}

	public void setSaldoPuntos(int saldoPuntos) {
		this.saldoPuntos = saldoPuntos;
	}

	public boolean getEstatusCupon() {
		return estatusCupon;
	}

	public void setEstatusCupon(boolean estatusCupon) {
		this.estatusCupon = estatusCupon;
	}

	public String mostrarProductosExtras() {
		int puntos = getSaldoPuntos();
		if (puntos >= 50 && puntos < 100) {
			setSaldoPuntos(puntos += 5);
			setEstatusCupon(false);
			return "Espagueti";
		} else if (puntos > 100 && puntos < 150) {
			setSaldoPuntos(puntos += 5);
			setEstatusCupon(false);
			return "Espagueti,Queso Extra";
		} else if (puntos > 150) {
			setSaldoPuntos(puntos += 5);
			setEstatusCupon(false);
			return "Espagueti,Queso Extra,Cupon Pizza Gratis";
		} else {
			return "";
		}
	}

	public void usarCupon(String respuesta) {
		if (respuesta.equals("Y")) {
			setEstatusCupon(false);
		} else if (respuesta.equals("N")) {
			setEstatusCupon(true);
		} else {

		}
	}

}
