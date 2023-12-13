package goldenaxe;

public class Jugador {

    //Atributos
    protected int Vida, Fuerza;
    protected String Nombre;
    protected boolean estaVivo;
    protected Carta[] carta;

    //Constructores
    public Jugador() {
        Carta[] carta = new Carta[5];
        carta[0] = new Carta("Obtienes un punto de vida", 1, 0);
        carta[1] = new Carta("Obtienes un punto de fuerza", 0, 1);
        carta[2] = new Carta("Obtienes dos puntos de vida", 2, 0);
        carta[3] = new Carta("Te quitan un punto de vida", -1, 0);
        carta[4] = new Carta("Te quitan un punto de fuerza", 0, -1);
    }

    //Métodos
    protected int getVida() {
        return Vida;
    }

    protected String getNombre() {
        return Nombre;
    }

    protected int getFuerza() {
        return Fuerza;
    }

    public void setVida(int Vida) {
        this.Vida = Vida;
    }

    public void setFuerza(int Fuerza) {
        this.Fuerza = Fuerza;
    }

            
}
