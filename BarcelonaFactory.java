package ejemploAbstractFactory;

class BarcelonaFactory implements EquipoFactory {
	
	public Jugador crearDelantero() {
        return new DelanteroRealMadrid();
    }
    public Jugador crearDefensa() {
        return new DefensaRealMadrid();
    }

}
