package Condicionales;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		int dia,mes,anyo;
		
		dia = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el dia "));
		mes = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el mes"));
		anyo = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el anyo"));
		
		
		if ((dia <= 31 && mes > 0) && (mes <12 && mes > 0)  ) {
			JOptionPane.showMessageDialog(null, "La fecha es correcta");
		}
		else
		{
			JOptionPane.showMessageDialog(null, "La fecha es incorecta");
		}
		
		
		
	}
}
