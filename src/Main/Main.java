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
import java.util.Scanner;
import java.util.UUID;
import Exception.AutenticarPassageiroException;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Passageiro passageiro = new Passageiro(
                "Tawan",
                UUID.randomUUID(),
                "principalacc169@gmail.com",
                2
        );
        try {
            System.out.println("Digite o nome do passageiro: ");
            String nomePassageiro = scanner.nextLine();
            System.out.println("Digite o email do passageiro: ");
            String emailPassageiro = scanner.nextLine();
            passageiro.autenticar(nomePassageiro, emailPassageiro);
        } catch (AutenticarPassageiroException e){
            System.out.println(e.getMessage());
        }




    }
}