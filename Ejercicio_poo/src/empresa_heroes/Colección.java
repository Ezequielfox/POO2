package empresa_heroes;

import java.util.ArrayList;
import java.util.Iterator;

public class Colección{
		private String nombreColeccion;
		private ArrayList <Figura>listaFiguras;
		//construct
		public Colección(String nombreColeccion) {
			super();
			this.nombreColeccion = nombreColeccion;
			this.listaFiguras = new ArrayList<Figura>();
		}
		//get set 
		public String getNombreColeccion() {
			return nombreColeccion;
		}
		public void setNombreColeccion(String nombreColeccion) {
			this.nombreColeccion = nombreColeccion;
		}
		
		//met
		public void añadirfigura(Figura fig) {
			listaFiguras.add(fig);
		}
		//met

		//toString
		@Override
		public String toString() {
			StringBuilder sb = new StringBuilder();
			sb.append("Colección: ").append(nombreColeccion).append("\n");
			sb.append("Figuras:\n");
			for (Figura fig : listaFiguras) {
	            sb.append("----------------------------\n");
	            sb.append(fig.toString()).append("\n");
			}
			return sb.toString();
		}
		public void subirPrecio(double cantidad, String id) {
			for (Figura fig : listaFiguras) {
				if (fig.getCodigo().equals(id)) {
					fig.subirPrecio(cantidad);
					break;
				}
				
			}
			
		}
		//met
		public String conCapa() {
			StringBuilder sb = new StringBuilder();
			sb.append("Figuras con capa: \n");
			for (Figura fig : listaFiguras) {
				if (fig.getSuperheroe().getCapa()) {
					sb.append(fig.toString()).append("\n");
					
				}
			}
			return sb.toString();
		}
		//observers
		public Figura masValioso() {
			if(listaFiguras.isEmpty()) return null;
			
			Figura masCara = listaFiguras.get(0);
			for(Figura fig : listaFiguras) {
				if(fig.getPrecio()>masCara.getPrecio()) {
					masCara = fig;
				}
			}
			return masCara;
		}

		public double getVoalorColeccion() {
			double total = 0.0;
			for(Figura fig: listaFiguras) {
				total += fig.getPrecio();
			}
			return total;
		}
		
	    // Volumen total
	    public double getVolumenColeccion() {
	        double volumenTotal = 0.0;
	        for (Figura fig : listaFiguras) {
	            volumenTotal = fig.getDimensiones().getVolumen();
	        }
	        return volumenTotal + 200;
	    }
	    
	}
