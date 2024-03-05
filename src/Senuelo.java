public class Senuelo {
    private int energia;

    public Senuelo(int energia) {
        this.energia = energia;
    }

    public void mostrar() {
        System.out.println("Señuelo - Energía: " + obtenerEnergia());
    }

    public int obtenerEnergia() {
        return energia;
    }
}


