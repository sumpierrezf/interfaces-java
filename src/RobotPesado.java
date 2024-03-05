public class RobotPesado extends SistemaArmas implements Volador {

    public RobotPesado(int energia) {
        super(energia);
    }

    @Override
    public void mostrar() {
        System.out.println("Robot Pesado - Energía: " + obtenerEnergia());
    }

    @Override
    public void defender() {
        System.out.println("Robot Pesado defendiendo.");
    }

    @Override
    public void atacar() {
        System.out.println("Robot Pesado atacando.");
    }

    @Override
    public void volar() {
        System.out.println("Robot Pesado volando.");
    }
}
