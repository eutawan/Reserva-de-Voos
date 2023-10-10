package Model.Voos;

import Model.AbstractClass.Voo;

import java.time.LocalDateTime;

public class VooAmericaNorte extends Voo {
    public VooAmericaNorte(int numVoo, String origem, String destino, LocalDateTime dataEHoraPartida,
                           LocalDateTime dataEHoraChegada, int capacidadePassageiros, int assentosReservados){
        super(numVoo, origem, destino, dataEHoraPartida, dataEHoraChegada, capacidadePassageiros,
                assentosReservados);
    }
}
