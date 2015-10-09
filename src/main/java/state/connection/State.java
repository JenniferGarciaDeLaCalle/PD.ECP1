package state.connection;

public abstract class State {

	private Estado estado;
	
	public State(Estado estado){
		setEstado(estado);
	}

	public Estado getEstado() {
		return this.estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	public abstract void abrir();

	public abstract void cerrar();

	public abstract void parar();

	public abstract void iniciar();

	public abstract void enviar(String msg);

	public abstract void recibir(int respuesta);

}
