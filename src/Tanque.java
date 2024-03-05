public class Tanque extends SistemaArmas {

    public Tanque(int energia) {
        super(energia);
    }

    @Override
    public void mostrar() {
        System.out.println("Tanque - Energía: " + obtenerEnergia());
    }

    @Override
    public void defender() {
        System.out.println("Tanque defendiendo.");
    }

    @Override
    public void atacar() {
        System.out.println("Tanque disparando cañón.");
    }
}

