package ejemploAbstractFactory;

class RealMadridFactory implements EquipoFactory {
	
	public Jugador crearDelantero() {
        return new DelanteroRealMadrid();
    }
    public Jugador crearDefensa() {
        return new DefensaRealMadrid();
    }

}
