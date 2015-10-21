package state.connection;

public class Parado extends State {

	public Parado(Estado estado) {
		super(estado);
	}

	@Override
	public void abrir(Conexion conexion) {
		throw new UnsupportedOperationException("Acción no permitida... ");
	}

	@Override
	public void cerrar(Conexion conexion) {
		throw new UnsupportedOperationException("Acción no permitida... ");
	}

	public void parar(Conexion conexion) {
	}

	@Override
	public void iniciar(Conexion conexion) {
		conexion.state = (new Preparado(Estado.PREPARADO));
	}

	@Override
	public void enviar(Conexion conexion, String msg) {
		throw new UnsupportedOperationException("Acción no permitida... ");
	}

	@Override
	public void recibir(Conexion conexion, int respuesta) {
		throw new UnsupportedOperationException("Acción no permitida... ");
	}
}
