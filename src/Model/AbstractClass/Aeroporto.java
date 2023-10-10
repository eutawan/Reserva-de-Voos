package Model.AbstractClass;

public abstract class Aeroporto {
    public String nome;
    public String localizacao;
    public Reserva[] listaDeReservas;

    public Aeroporto(String nome, String localizacao, int qntMaxReservas){
        this.nome = nome;
        this.localizacao = localizacao;
        this.listaDeReservas = new Reserva[qntMaxReservas];
    }

    public void buscarVoo(Voo voo){
        for (int i = 0; i < listaDeReservas.length; i++){
            if (voo.assentosReservados > 10){
                voo.exibirInfo();
            }
        }

    }
    public void fazerReserva(Reserva reserva){
        for (int i = 0; i < reserva.assentosReservados; i++){
            if (listaDeReservas[i] == null){
                listaDeReservas[i] = reserva;
            }
        }
    }
    public void cancelarReserva(Reserva reserva){
        for (int i = 0; i < reserva.assentosReservados; i--){
            if (listaDeReservas[i] == reserva){
                listaDeReservas[i] = null;
            }
        }
    }
    public void exbirInfo(){
        System.out.println("Nome do aeroporto: " + nome);
        System.out.println("Localização: " + localizacao);
        for (int i = 0; i < listaDeReservas.length; i++){
            listaDeReservas[i].exibirInfo();
        }
    }
}
