package Model.AbstractClass;

import java.time.LocalDateTime;
import java.time.LocalTime;

public  abstract class Voo {
    public int numVoo;
    public String origem;
    public String destino;
    public LocalDateTime dataEHoraPartida;
    public LocalDateTime dataEHoraChegada;
    public int capacidadePassageiros;
    public int assentosReservados;

    public Voo(int numVoo, String origem, String destino, LocalDateTime dataEHoraPartida, LocalDateTime dataEHoraChegada,
               int capacidadePassageiros, int assentosReservados){
        this.numVoo = numVoo;
        this.origem = origem;
        this.destino= destino;
        this.dataEHoraPartida = dataEHoraPartida;
        this.dataEHoraChegada = dataEHoraChegada;
        this.capacidadePassageiros = capacidadePassageiros;
        this.assentosReservados = assentosReservados;
    }
    public void exibirInfo(){
        System.out.println("Número do voo: " + numVoo);
        System.out.println("Origem do voo: " + origem);
        System.out.println("Destino do voo: " + destino);
        System.out.println("Data e hora de partida: " + dataEHoraPartida);
        System.out.println("Data e hora de chegada: " + dataEHoraChegada);
        System.out.println("Capacidade de passageiros: " + capacidadePassageiros);
        System.out.println("Assentos reservados: " + assentosReservados);
    }
}
