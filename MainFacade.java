// Subsistemas
class ReservaVoo {
    public void reservar() {
        System.out.println("Voo reservado.");
    }
}

class Pagamento {
    public void pagar() {
        System.out.println("Pagamento realizado.");
    }
}

class CheckIn {
    public void fazerCheckIn() {
        System.out.println("Check-in realizado.");
    }
}

// Facade
class AgenciaViagemFacade {
    private ReservaVoo reserva;
    private Pagamento pagamento;
    private CheckIn checkin;

    public AgenciaViagemFacade() {
        reserva = new ReservaVoo();
        pagamento = new Pagamento();
        checkin = new CheckIn();
    }

    public void comprarPacote() {
        reserva.reservar();
        pagamento.pagar();
        checkin.fazerCheckIn();
        System.out.println("Pacote completo comprado com sucesso!");
    }
}

// Teste
public class MainFacade {
    public static void main(String[] args) {
        AgenciaViagemFacade agencia = new AgenciaViagemFacade();
        agencia.comprarPacote();
    }
}
