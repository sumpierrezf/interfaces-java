public class Main {

    public static void main(String[] args) {

        RobotPesado robotPesado = new RobotPesado(200);
        RobotLiviano robotLiviano = new RobotLiviano(150);
        Tanque tanque = new Tanque(300);
        Senuelo senuelo = new Senuelo(50);

        robotPesado.mostrar();
        robotPesado.atacar();
        robotPesado.volar();

        robotLiviano.mostrar();
        robotLiviano.defender();
        robotLiviano.volar();

        tanque.mostrar();
        tanque.atacar();

        senuelo.mostrar();
        int energiaSenuelo = senuelo.obtenerEnergia();
        System.out.println("Energía del señuelo: " + energiaSenuelo);
    }
}
