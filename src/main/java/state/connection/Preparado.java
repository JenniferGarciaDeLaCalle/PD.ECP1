package state.connection;

public class Preparado extends State {

	public Preparado(Estado estado) {
		super(estado);
	}

	public void abrir(Conexion conexion) {
	}

	@Override
	public void cerrar(Conexion conexion) {
		conexion.state = (new Cerrado(Estado.CERRADO));
	}

	@Override
	public void parar(Conexion conexion) {
		conexion.state = (new Parado(Estado.PARADO));
	}

	public void iniciar(Conexion conexion) {
	}

	@Override
	public void enviar(Conexion conexion, String msg) {
		conexion.getLink().enviar(msg);
		conexion.state = (new Esperando(Estado.ESPERANDO));
	}

	@Override
	public void recibir(Conexion conexion, int respuesta) {
		throw new UnsupportedOperationException("Acción no permitida... ");
	}
}
