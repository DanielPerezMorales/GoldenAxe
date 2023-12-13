package goldenaxe;

public class Carta {

    //Atributos
    protected String FraseCarta;
    protected int Vida, Fuerza;

    //Constructores
    public Carta(String FraseCarta, int Vida, int Fuerza) {
        this.FraseCarta = FraseCarta;
        this.Vida = Vida;
        this.Fuerza = Fuerza;
    }

    //Métodos
    public String getFraseCarta() {
        return FraseCarta;
    }

}
