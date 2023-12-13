package goldenaxe;

public class Cthulhu {
//Atributos

    protected int Vida, Fuerza;
    protected boolean estaVivo;
    //Constructores

    public Cthulhu(int Jug) {
        this.Fuerza = 1;
        this.Vida = 20 + (Jug * 2);
        estaVivo=true;
    }

    public int getVida() {
        return Vida;
    }

    public int getFuerza() {
        return Fuerza;
    }

    public void setVida(int Vida) {
        this.Vida = Vida;
    }

    public void setFuerza(int Fuerza) {
        this.Fuerza = Fuerza;
    }

    public boolean isEstaVivo() {
        return estaVivo;
    }

    public void setEstaVivo(boolean estaVivo) {
        this.estaVivo = estaVivo;
    }

}
