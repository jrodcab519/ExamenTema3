public class EjercicioDeposito {
    public static void main(String[] args) {

        Deposito a = new Deposito(54);

        System.out.println(a);

        Deposito b = new Deposito(100,"aceite");

        System.out.println(b);

        System.out.println(a.estaVacio());

    }
}
