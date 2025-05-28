package empresa_heroes;

public class Dimension {
	//Prop
	private double alto;
	private double ancho;
	private double profundidad;

	//construct 1
	public Dimension() {
		this.alto = 0.0;
		this.ancho = 0.0;
		this.profundidad = 0.0;
	}
	//Construct 2
	public Dimension(double alto, double ancho, double profundidad) {
		this.alto = alto;
		this.ancho = ancho;
		this.profundidad = profundidad;
	}
	//get set
	public double getAlto() {
		return alto;
	}
	public void setAlto(double alto) {
		this.alto = alto;
	}
	public double getAncho() {
		return ancho;
	}
	public void setAncho(double ancho) {
		this.ancho = ancho;
	}
	public double getProfundidad() {
		return profundidad;
	}
	public void setProfundidad(double profundidad) {
		this.profundidad = profundidad;
	}
	//math
	public double getVolumen() {
		double vol;
		vol = this.alto*this.ancho*this.profundidad;
		System.out.print("el volumen es: " + vol);;
		return vol;
	}
	//toString
	@Override
	public String toString() {
		return "dimension [alto=" + alto + ", ancho=" + ancho + ", profundidad=" + profundidad + "]";
	}
}