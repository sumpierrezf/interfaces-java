public class RobotLiviano extends SistemaArmas implements Volador {

    public RobotLiviano(int energia) {
        super(energia);
    }

    @Override
    public void mostrar() {
        System.out.println("Robot Liviano - Energía: " + obtenerEnergia());
    }

    @Override
    public void defender() {
        System.out.println("Robot Liviano defendiendo.");
    }

    @Override
    public void atacar() {
        System.out.println("Robot Liviano disparando misiles.");
    }

    @Override
    public void volar() {
        System.out.println("Robot Liviano volando.");
    }
}

