package Model.AbstractClass;
import Exception.AutenticarPassageiroException;

import java.util.UUID;

public class Passageiro {
    public String nomeP;
    public UUID uuid;
    public String emailP;
    public Reserva[] reservas;

    public Passageiro(String nome, UUID uuid, String email, int qntMaxReservas){
        this.nomeP = nome;
        this.uuid = uuid;
        this.emailP = email;
        this.reservas = new Reserva[qntMaxReservas];
    }
    public void exibirInfo(){
        System.out.println("Nome do passageiro: " + nomeP);
        System.out.println("ID do passageiro: " + uuid);
        System.out.println("Email do passageiro: " + emailP);
    }

    public void autenticar(String nome, String email){
        if (!nome.equals(nomeP)){
            throw new AutenticarPassageiroException("ERRO -> NOME DO PASSAGEIRO INCORRETO");
        }
        else if (!email.equals(emailP)) {
            throw new AutenticarPassageiroException("ERRO: EMAIL DO PASSAGEIRO INCORRETO");
        }
    }
}
