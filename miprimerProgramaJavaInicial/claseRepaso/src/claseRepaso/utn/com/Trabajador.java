package claseRepaso.utn.com;

import javax.swing.JOptionPane;

public class Trabajador {

	private int horasTrabajadas;
	private float sueldoPorHora;
	private String tipoDeTrabajador;
	private float impuestoGanancias = 0.00f;
	private float salariomensual;
	private int diasLaborales = 20;

	// metodo Constructor
	public Trabajador(int horasTrabajadas, float sueldoPorHora, String tipoDeTrabajador, float impuestoGanancias,
			float salariomensual) {

		this.horasTrabajadas = horasTrabajadas;
		this.sueldoPorHora = sueldoPorHora;
		this.tipoDeTrabajador = tipoDeTrabajador;
		this.impuestoGanancias = impuestoGanancias;
		this.salariomensual = salariomensual;
	}

	// Metodo procedimiento que solicita datos al usuario
	public void SolicitarDatos() {
		int opcionIngresada;
		boolean bandera = false;
		do {
			if (bandera) {
				JOptionPane.showMessageDialog(null, "opcion invalida ingrese nuevamente");
			}
			opcionIngresada = Integer.parseInt(
					JOptionPane.showInputDialog("ingrese tipo de trabajador \n 1-administrativo \n 2-inspector"));
			bandera = true;
		} while ((opcionIngresada != 1) && (opcionIngresada != 2));
		if (opcionIngresada == 1) {
			this.tipoDeTrabajador = "Administrativo";

		} else {
			this.tipoDeTrabajador = "Inspector";

		}

		bandera = false;
		float opcionIngresada2;
		do {
			if (bandera) {
				JOptionPane.showMessageDialog(null, "sueldo invalido intente nuevamente");
			}
			opcionIngresada2 = Float.parseFloat(JOptionPane.showInputDialog("ingrese su sueldo por hora\n"));
			bandera = true;
		} while (opcionIngresada2 <= 0);

		this.sueldoPorHora = opcionIngresada2;

		int opcionIngresada3;
		bandera = false;
		do {
			if (bandera) {
				JOptionPane.showMessageDialog(null, "horas ingresadas invalidas intente nuevamente");
			}
			opcionIngresada3 = Integer.parseInt(JOptionPane.showInputDialog("ingrese sus horas trabajadas por dia\n"));
			bandera = true;
		} while (opcionIngresada3 <= 0);
		this.horasTrabajadas = opcionIngresada3;

		salariomensual = (horasTrabajadas * sueldoPorHora) * diasLaborales;
		CalcularImpuesto();

	}

	@Override
	public String toString() {
		return "Trabajador [horasTrabajadas=" + horasTrabajadas + ", sueldoPorHora=" + sueldoPorHora
				+ ", tipoDeTrabajador=" + tipoDeTrabajador + ", impuestoGanancias=" + impuestoGanancias
				+ ", salariomensual=" + salariomensual + ", diasLaborales=" + diasLaborales + "]";
	}

	// menos de 100000 no pagan
	// entre 100 y 150 pagan un 15%
	// mas de 200 20%
	private void CalcularImpuesto() {
		if (salariomensual < 100000) {
			System.out.println("ustes es un pobreton no le cobraremos impuesto!");

		} else if (salariomensual < 150000 && salariomensual > 100000) {

			impuestoGanancias = 0.15f;

		} else if (salariomensual < 200000 && salariomensual > 150000) {
			impuestoGanancias = 0.20f;

		} else {
			impuestoGanancias = 0.50f;

		}
	}

	// cpnstructor vacio
	public Trabajador() {

	}

	public int getHorasTrabajadas() {
		return horasTrabajadas;
	}

	public void setHorasTrabajadas(int horasTrabajadas) {
		this.horasTrabajadas = horasTrabajadas;
	}

	public float getSueldoPorHora() {
		return sueldoPorHora;
	}

	public void setSueldoPorHora(float sueldoPorHora) {
		this.sueldoPorHora = sueldoPorHora;
	}

	public String getTipoDeTrabajador() {
		return tipoDeTrabajador;
	}

	public void setTipoDeTrabajador(String tipoDeTrabajador) {
		this.tipoDeTrabajador = tipoDeTrabajador;
	}

	public float getImpuestoGanancias() {
		return impuestoGanancias;
	}

	public void setImpuestoGanancias(float impuestoGanancias) {
		this.impuestoGanancias = impuestoGanancias;
	}

	public float getSalariomensual() {
		return salariomensual;
	}

	public void setSalariomensual(float salariomensual) {
		this.salariomensual = salariomensual;
	}

}
