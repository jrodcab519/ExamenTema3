public class EjercicioExamen {
    public static void main(String[] args) throws Exception {
        Examen a = new Examen("Base",4.2);

        System.out.println(a);

        a.redondear();

        System.out.println(a);

        System.out.println(a.estaAprovado());

        Examen b = new Examen("Programación","Tema 1",5);

        System.out.println(b);
    }
}
