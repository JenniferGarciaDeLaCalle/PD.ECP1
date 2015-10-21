package state.connection;

public class Cerrado extends State {

	public Cerrado(Estado estado) {
		super(estado);
	}

	@Override
	public void abrir(Conexion conexion) {
		conexion.state = (new Preparado(Estado.PREPARADO));
	}

	public void cerrar(Conexion conexion) {
	}

	@Override
	public void parar(Conexion conexion) {
		throw new UnsupportedOperationException("Acción no permitida... ");
	}

	@Override
	public void iniciar(Conexion conexion) {
		throw new UnsupportedOperationException("Acción no permitida... ");
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
