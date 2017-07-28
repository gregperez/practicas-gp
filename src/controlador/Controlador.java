package controlador;
import java.util.ArrayList;
import java.util.List;

import modelo.Persona;

public class Controlador {

	public void procesarPersonas(List<Persona> arrPers) {
		List<Integer> edades = new ArrayList<Integer>();
		for (int i = 0; i < arrPers.size(); i++) {
			if (!edades.contains(arrPers.get(i).getEdad())) {
				edades.add(arrPers.get(i).getEdad());
			}
		}
		
		String[] resultado = new String[edades.size()];
		int index = 0;
		for (int j = 0; j < edades.size(); j++) {
			resultado[index] = edades.get(j).toString() + " ";
			for (int p = 0; p < arrPers.size(); p++) {
				if (edades.get(j) == arrPers.get(p).getEdad()) {
					resultado[index] += arrPers.get(p).getNombre() + " ";
				}
			}
			index++;
		}
		
		for (int t = 0; t < resultado.length; t++) {
			System.out.println(resultado[t]);
		}
	}
}
