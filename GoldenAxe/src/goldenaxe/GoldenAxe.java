package goldenaxe;

import java.util.Scanner;

public class GoldenAxe {

    public static void main(String[] args) {
        Scanner Jug = new Scanner(System.in);
        Scanner NombreJug = new Scanner(System.in);
        System.out.println("---------------GOLDEN AXE---------------");
        System.out.println("Elige el número de jugadores de 1 a 5: ");
        int jug = Jug.nextInt();
        Jugador[] Jugadores = new Jugador[jug];
        Cthulhu Cthulhu = new Cthulhu(jug);
        for (int i = 0; i < jug; i++) {
            System.out.println("Seleccione personaje entre ENANO / GUERRERO / AMAZONA");
            String Nombre = NombreJug.next();
            switch (Nombre) {
                case "ENANO":
                    Enano enano = new Enano();
                    Jugadores[i] = enano;
                    break;
                case "GUERRERO":
                    Guerrero guerrero = new Guerrero();
                    Jugadores[i] = guerrero;
                    break;
                case "AMAZONA":
                    Amazona amazona = new Amazona();
                    Jugadores[i] = amazona;
                    break;
            }

        }
        int rondas = 8 - jug;
        System.out.print("COMIENZA EL JUEGO");
        while ((rondas != 0 || Cthulhu.getVida() != 0) || Jugadores[jug].Vida != 0) {
            for (int i = 0; i < jug; i++) {
                System.out.println("Jugador: " + Jugadores[i].getNombre());
                System.out.println("Elige que quieres hacer:");
                System.out.println("1: Luchar con Cthulhu 2: Coger una carta 3: Descansar");
                int opcion = Jug.nextInt();
                switch (opcion) {
                    case 1:
                        //lucharCthulhu();
                        break;
                    case 2:
                        //cogerCarta();
                        break;
                    case 3:
                        //reponerVida();
                        break;
                    default:
                        System.out.println("No existe esa opción, pierdes un turno, " + Jugadores[i].getNombre());
                        break;
                }
            }
            rondas--;
        }
        System.out.print("EL JUEGO HA TERMINADO");
    }

    /*
    public void lucharCthulhu() {
        int res;
        for (int i = 0; i < Jugadores[].getFuerza(); i++)
        {int dados = (int) (Math.random() * 6 + 1);
            System.out.print("El resultado de la tirada ha sido de " + dados);
            res = dados;
        }
        System.out.print("Suma de dados: " + res);
        System.out.print("Vida de Cthulhu: " +Cthulhu.getVida());
        int CthulhuRestante = Cthulhu.getVida() - res;
        System.out.print("Vida de Cthulhu restante: " + CthulhuRestante);
        Jugadores[i].getVida() - 1;
        System.out.print("Vida del jugador: " + Jugadores[i].getVida());
    }
    
    public void cogerCarta() {
        int numeroCarta=(int) (Math.random() * 5 + 1);
        Carta carta=Jugadores[].getCarta(numeroCarta);
        System.out.print(carta.getFraseCarta());
        if (carta.isFuerza==1){Jugadores[].setFuerza()+1}
        else if(carta.isVida==1){Jugadores[].setVida()+1}
        else if(carta.isVida==2){Jugadores[].setVida()+2}
        else if(carta.isFuerza==(-1)){Jugadores[].setVida()-1}
        else {Jugadores[].setFuerza()-1}
    }
    
    public void reponerVida() {
        Jugadores[].getVida()+1;
    }
     */
    //FALTAN LOS MÉTODOS PARA JUGAR, PERO LAS RONDAS VAN PERFECTAMENTE Y LA CREACIÓN DE JUGADORES IGUAL
}
