package state.connection;

public abstract class State {

	private Estado estado;

	public State(Estado estado) {
		this.estado = estado;
	}

	public abstract void abrir(Conexion conexion);

	public abstract void cerrar(Conexion conexion);

	public abstract void parar(Conexion conexion);

	public abstract void iniciar(Conexion conexion);

	public abstract void enviar(Conexion conexion, String msg);

	public abstract void recibir(Conexion conexion, int respuesta);

	public Estado getEstado() {
		return this.estado;
	}

}
