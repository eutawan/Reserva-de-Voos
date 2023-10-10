package Model.Aeroportos;

import Model.AbstractClass.Aeroporto;
import Model.AbstractClass.Reserva;

public class AeroSul extends Aeroporto{
    public AeroSul(String nome, String localizacao, int qntMaxReservas){
        super(nome, localizacao, qntMaxReservas);
    }
    public void exbirInfo() {
        System.out.println("Nome do aeroporto: " + nome);
        System.out.println("Localização: " + localizacao + ". Na América do sul.");
        for (int i = 0; i < listaDeReservas.length; i++) {
            listaDeReservas[i].exibirInfo();
        }
    }
    public void fazerReserva(Reserva reserva){
        for (int i = 0; i < reserva.assentosReservados; i++){
            if (listaDeReservas[i] == null){
                listaDeReservas[i] = reserva;
                System.out.println("Voo no Aeroporto da América do Sul realizado com sucesso!");
            }
        }
    }
}
