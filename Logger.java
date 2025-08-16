public class Logger {
    private static Logger instance; // única instância da classe

    private Logger() {
        // construtor privado impede criação externa
    }

    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public void log(String mensagem) {
        System.out.println("[LOG]: " + mensagem);
    }

    // Teste
    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        logger1.log("Primeira mensagem");
        logger2.log("Segunda mensagem");

        System.out.println(logger1 == logger2); // true → mesma instância
    }
}
