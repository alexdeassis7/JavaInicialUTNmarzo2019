package com.utn.clase3.dowhile;

import javax.swing.JOptionPane;

public class AppMain {

	public static void main(String[] args) {
		int password = 36863837;
		int passIngresada = 0;
		int flag = 0;
		do {

			if (flag == 1) {
				JOptionPane.showMessageDialog(null, "INGRESO MAL SU PASSWORD", "mi applicacion",
						JOptionPane.WARNING_MESSAGE);

			}
			passIngresada = Integer
					.parseInt(JOptionPane.showInputDialog("ingrese su password para acceder al programa"));

			flag = 1;

		} while (passIngresada != password);

		JOptionPane.showMessageDialog(null, "Welcome to App", "mi applicacion", JOptionPane.INFORMATION_MESSAGE);

	}

}
