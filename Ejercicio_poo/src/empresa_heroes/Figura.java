	package empresa_heroes;


public class Figura{
		private String codigo; 
		private double precio; 
		private Superhéroe superheroe;
		private Dimension dimensiones; 

		public Figura(String nombre, String codigo, double precio, Superhéroe superheroe,
				double alto, double ancho, double profundidad) {
			this.codigo = codigo;
			this.precio = precio;
			this.superheroe = superheroe;
			this.dimensiones = new Dimension();
		}
		//set get
		public String getCodigo() {
			return codigo;
		}
		public void setCodigo(String codigo) {
			this.codigo = codigo;
		}
		public double getPrecio() {
			return precio;
		}
		public void setPrecio(double precio) {
			this.precio = precio;
		}
		public Superhéroe getSuperheroe() {
			return superheroe;
		}
		public void setSuperheroe(Superhéroe superheroe) {
			this.superheroe = superheroe;
		}
		public Dimension getDimensiones() {
			return dimensiones;
		}
		public void setDimension(Dimension dimensiones) {
			this.dimensiones = dimensiones;
		}
		
		//toString
		public String toString() {
			return "figura [codigo=" + codigo + ", precio=" + precio + ", superheroe=" + superheroe + ", dimension="
					+ dimensiones + "]";
		}
		//met
		public void subirPrecio(double cantidad) {
			this.precio += cantidad;
		}
		

		
}