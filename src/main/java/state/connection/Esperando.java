package state.connection;

public class Esperando extends State {
	
	public Esperando(Estado estado) {
		super(estado);
	}

	@Override
	public void abrir() {
		if (getEstado() == Estado.ESPERANDO) {
			throw new UnsupportedOperationException("Acción no permitida... ");
		}
	}
	
	@Override
	public void cerrar() {
		if (getEstado() == Estado.ESPERANDO) {
			throw new UnsupportedOperationException("Acción no permitida... ");
		}
	}
	
	@Override
	public void parar() {
		if (getEstado() == Estado.ESPERANDO) {
			throw new UnsupportedOperationException("Acción no permitida... ");
		}
	}
	
	@Override
	public void iniciar() {
		if (getEstado() == Estado.ESPERANDO) {
			throw new UnsupportedOperationException("Acción no permitida... ");
		}
	}
	
	@Override
	public void enviar(String msg) {
		if (getEstado() == Estado.ESPERANDO) {
			throw new UnsupportedOperationException("Acción no permitida... ");
		}
	}
	
	@Override
	public void recibir(int respuesta) {
		if (getEstado() == Estado.ESPERANDO) {
			if (respuesta == 0) {
                setEstado(Estado.PREPARADO);
            } else {
                setEstado(Estado.CERRADO);
            }
		}
	}
}
