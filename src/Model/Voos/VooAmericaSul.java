package Model.Voos;

import Model.AbstractClass.Voo;

import java.time.LocalDateTime;

public class VooAmericaSul extends Voo {
    public VooAmericaSul(int numVoo, String origem, String destino, LocalDateTime dataEHoraPartida,
                           LocalDateTime dataEHoraChegada, int capacidadePassageiros, int assentosReservados){
        super(numVoo, origem, destino, dataEHoraPartida, dataEHoraChegada, capacidadePassageiros,
                assentosReservados);
    }
}
