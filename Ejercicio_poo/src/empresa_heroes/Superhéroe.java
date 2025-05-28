package empresa_heroes;
public class Superhéroe {
	//prop
		private String nombre;
		private String descripcion;
		private boolean capa;
		//construct
		public Superhéroe(String nombre) {
			super();
			this.nombre =nombre;
			this.descripcion = "";
			this.capa = false;
		}
			//  get y set
		public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		public String getDescripcion() {
			return descripcion;
		}
		public void setDescripcion(String descripcion) {
			this.descripcion = descripcion;
		}
		public boolean getCapa() {
			return capa;
		}
		public void setCapa(boolean capa) {
			this.capa = capa;
		}
		//toString
		@Override
		public String toString() {
			return "Superhéroe [nombre=" + nombre + ", descripcion=" + descripcion + ", capa=" + capa + "]";
		}
	}