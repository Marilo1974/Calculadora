public class Calculadora {

    public double sumar(double a, double b) {
        return a + b;
    }

    public double restar(double a, double b) {
        return a - b;
    }

    public double multiplicar(double a, double b) {
        return a * b;
    }

    public double potencia(double base, double exponente) {
        return Math.pow(base, exponente);
    }

    public static void main(String[] args) {

        Calculadora calc = new Calculadora();

        System.out.println("Suma: " +
                calc.sumar(10, 5));

        System.out.println("Resta: " +
                calc.restar(10, 5));

        System.out.println("Multiplicación: " +
                calc.multiplicar(10, 5));

        System.out.println("Potencia: " +
                calc.potencia(2, 3));
    }
}