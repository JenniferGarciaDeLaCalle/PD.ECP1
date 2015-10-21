package state.connection;

public class Conexion {

	State state;

	private Link link;

	public Conexion(Link link) {
		assert link != null;
		this.link = link;
		state = new Cerrado(Estado.CERRADO);
	}

	public Link getLink() {
		return link;
	}

	public Estado getEstado() {
		return state.getEstado();
	}

	public void abrir() {
		state.abrir(this);
	}

	public void cerrar() {
		state.cerrar(this);
	}

	public void parar() {
		state.parar(this);
	}

	public void iniciar() {
		state.iniciar(this);
	}

	public void enviar(String msg) {
		state.enviar(this, msg);
	}

	public void recibir(int respuesta) {
		state.recibir(this, respuesta);
	}

}