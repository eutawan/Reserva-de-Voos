package Model.AbstractClass;

import java.time.LocalDate;

public class Reserva {
    public Passageiro passageiro;
    public Voo voo;
    public LocalDate dataReserva;
    public int assentosReservados;

    public Reserva(Passageiro passageiro, Voo voo, LocalDate dataReserva, int assentosReservados){
        this.passageiro = passageiro;
        this.voo = voo;
        this.dataReserva = dataReserva;
        this.assentosReservados = assentosReservados;
    }
    public void exibirInfo(){
        System.out.println("Passageiro: " + passageiro);
        System.out.println("Voo: " + voo);
        System.out.println("Data da reserva: " + dataReserva);
        System.out.println("Assentos reservados: " + assentosReservados);
    }
}
