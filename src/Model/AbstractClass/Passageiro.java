package Model.AbstractClass;

import java.util.UUID;

public class Passageiro {
    public String nome;
    public UUID uuid;
    public String email;
    public Reserva[] reservas;

    public Passageiro(String nome, UUID uuid, String email, int qntMaxReservas){
        this.nome = nome;
        this.uuid = uuid;
        this.email = email;
        this.reservas = new Reserva[qntMaxReservas];
    }
    public void exibirInfo(){
        System.out.println("Nome do passageiro: " + nome);
        System.out.println("ID do passageiro: " + uuid);
        System.out.println("Email do passageiro: " + email);
    }
}
