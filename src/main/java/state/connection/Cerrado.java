package state.connection;

public class Cerrado extends State {

	public Cerrado(Estado estado) {
		super(estado);
	}

	@Override
	public void abrir() {
		if (getEstado() == Estado.CERRADO) {
			setEstado(Estado.PREPARADO);
		}
	}
	
	@Override
	public void cerrar() {
		if (getEstado() == Estado.CERRADO) {
		}
	}
	
	@Override
	public void parar() {
		if (getEstado() == Estado.CERRADO) {
			throw new UnsupportedOperationException("Acción no permitida... ");
		}
	}
	
	@Override
	public void iniciar() {
		if (getEstado() == Estado.CERRADO) {
			throw new UnsupportedOperationException("Acción no permitida... ");
		}
	}
	
	@Override
	public void enviar(String msg) {
		if (getEstado() == Estado.CERRADO) {
			throw new UnsupportedOperationException("Acción no permitida... ");
		}
	}
	
	@Override
	public void recibir(int respuesta) {
		if (getEstado() == Estado.CERRADO) {
			throw new UnsupportedOperationException("Acción no permitida... ");
		}
	}
}
