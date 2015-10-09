package state.connection;

public class Parado extends State {

	public Parado(Estado estado) {
		super(estado);
	}

	@Override
	public void abrir() {
		if (getEstado() == Estado.PARADO) {
			throw new UnsupportedOperationException("Acción no permitida... ");
		}
	}
	
	@Override
	public void cerrar() {
		if (getEstado() == Estado.PARADO) {
			throw new UnsupportedOperationException("Acción no permitida... ");
		}
	}
	
	@Override
	public void parar() {
		if (getEstado() == Estado.PARADO) {
		}
	}
	
	@Override
	public void iniciar() {
		if (getEstado() == Estado.PARADO) {
			setEstado(Estado.PREPARADO);
		}
	}
	
	@Override
	public void enviar(String msg) {
		if (getEstado() == Estado.PARADO) {
			throw new UnsupportedOperationException("Acción no permitida... ");
		}
	}
	
	@Override
	public void recibir(int respuesta) {
		if (getEstado() == Estado.PARADO) {
			throw new UnsupportedOperationException("Acción no permitida... ");
		}
	}
}
