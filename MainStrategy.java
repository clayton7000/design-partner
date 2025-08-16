interface Imposto {
    double calcular(double valor);
}

class ICMS implements Imposto {
    public double calcular(double valor) {
        return valor * 0.1;
    }
}

class ISS implements Imposto {
    public double calcular(double valor) {
        return valor * 0.05;
    }
}

class CalculadoraImpostos {
    private Imposto imposto;

    public CalculadoraImpostos(Imposto imposto) {
        this.imposto = imposto;
    }

    public double calcularImposto(double valor) {
        return imposto.calcular(valor);
    }
}

public class MainStrategy {
    public static void main(String[] args) {
        CalculadoraImpostos calc1 = new CalculadoraImpostos(new ICMS());
        System.out.println("ICMS: " + calc1.calcularImposto(1000));

        CalculadoraImpostos calc2 = new CalculadoraImpostos(new ISS());
        System.out.println("ISS: " + calc2.calcularImposto(1000));
    }
}
