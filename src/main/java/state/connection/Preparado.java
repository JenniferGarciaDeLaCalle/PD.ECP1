package state.connection;

public class Preparado extends State {

	public Preparado(Estado estado) {
		super(estado);
	}

	private Link link;

	@Override
	public void abrir() {
		if (getEstado() == Estado.PREPARADO) {
			throw new UnsupportedOperationException("Acción no permitida... ");
		}
	}

	@Override
	public void cerrar() {
		if (getEstado() == Estado.PREPARADO) {
			setEstado(Estado.CERRADO);
		}
	}
	
	@Override
	public void parar() {
		if (getEstado() == Estado.PREPARADO) {
			setEstado(Estado.PARADO);
		}
	}
	
	@Override
	public void iniciar() {
		if (getEstado() == Estado.PREPARADO) {
		}
	}
	
	@Override
	public void enviar(String msg) {
		if (getEstado() == Estado.PREPARADO) {
			this.link.enviar(msg);
			setEstado(Estado.ESPERANDO);
		}
	}
	
	@Override
	public void recibir(int respuesta) {
		if (getEstado() == Estado.PREPARADO) {
			 throw new UnsupportedOperationException("Acción no permitida... ");
		}
	}
}
