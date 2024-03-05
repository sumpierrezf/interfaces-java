public abstract class SistemaArmas {
    private int energia;

    public SistemaArmas(int energia) {
        this.energia = energia;
    }


    public abstract void mostrar();
    public abstract void defender();
    public abstract void atacar();


    public int obtenerEnergia() {
        return energia;
    }
}



