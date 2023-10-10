package Main;

import Model.AbstractClass.Aeroporto;
import Model.AbstractClass.Passageiro;
import Model.AbstractClass.Reserva;
import Model.AbstractClass.Voo;
import Model.Aeroportos.AeroNorte;
import Model.Aeroportos.AeroSul;
import Model.Voos.VooAmericaNorte;
import Model.Voos.VooAmericaSul;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

public class Main {
    public static void main(String[] args) {
        AeroSul aeroportoSul = new AeroSul(
                "Aeroporto Internacional do México",
                "México",
                100
        );
        AeroNorte aeroportoNorte = new AeroNorte(
                "Hartsfield Jackson Atlanta International Airport",
                "Estados Unidos",
                100
        );
        aeroportoNorte.exbirInfo();
        aeroportoSul.exbirInfo();

        VooAmericaSul vooSul = new VooAmericaSul(
                257,
                "Aeroporto Internacional do México",
                "Caixa prega",
                LocalDateTime.of(2023, 6, 16, 11, 20, 30),
                LocalDateTime.of(2023, 6, 19, 12, 30, 12),
                100,
                89
        );
        VooAmericaNorte vooNorte = new VooAmericaNorte(
                555,
                "Hartsfield Jackson Atlanta International Airport",
                "Só deus sabe",
                LocalDateTime.of(2023, 7, 5, 16, 0, 0),
                LocalDateTime.of(2023, 6, 7, 13, 30, 0),
                200,
                173
        );
        Passageiro passageiro1 = new Passageiro(
                "Tawan",
                UUID.randomUUID(),
                "tawanlindo@gmail.com",
                1
        );
        Passageiro passageiro2 = new Passageiro(
                "Guidda Castelar",
                UUID.randomUUID(),
                "guidda123@gmail.com",
                1
        );

        passageiro1.exibirInfo();
        passageiro2.exibirInfo();

        Reserva reserva = new Reserva(
                passageiro1,
                vooSul,
                LocalDate.of(2023, 10, 9),
                7
        );

        Reserva reserva2 = new Reserva(
                passageiro2,
                vooNorte,
                LocalDate.of(2023, 10, 10),
                6
        );



    }
}