public class Main {
    public static void main(String []args){
        // Variables con Datos primitivos
        int numeroSillasParaSalon = 4;
        incrementarNumeroDeSillas(numeroSillasParaSalon);
        System.out.println("El número de sillas para Salon es: " + numeroSillasParaSalon);

        int numeroSillasParaFiestaInfantil = numeroSillasParaSalon;
        incrementarNumeroDeSillas(numeroSillasParaFiestaInfantil);
        System.out.println("El número de sillas para Fiesta es: " + numeroSillasParaFiestaInfantil);
        System.out.println();

        //Variables de Referenica
        Sala salaModular = new Sala("Pavia");
        incrementarSillones(salaModular);
        System.out.println("El número de sillones para la Sala Modular es: " + salaModular.numeroDeSillones);

        Sala salaVictoria = salaModular;
        incrementarSillones(salaVictoria);
        System.out.println("El número de sillones para la Sala Victoria es: " + salaVictoria.numeroDeSillones);

    }

    public static void incrementarSillones(Sala sala){
        sala.setNumeroDeSillones(sala.getNumeroDeSillones() + 1);
    }

    public static void incrementarNumeroDeSillas(int numeroSillasIncrementadas){
        numeroSillasIncrementadas++;
    }
}

class Sala{
    int numeroDeSillones;
    String nombre;

    public Sala(String nombre){
        this.nombre = nombre;
    }

    public int getNumeroDeSillones() {
        return numeroDeSillones;
    }

    public void setNumeroDeSillones(int numeroDeSillones) {
        this.numeroDeSillones = numeroDeSillones;
    }

    // Sobreescribir el método toString()
}
