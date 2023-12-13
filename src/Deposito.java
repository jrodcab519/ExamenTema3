public class Deposito {

    private static int capacidad;

    private enum Contenido{aceite, agua, gasoleo, gasolina}

    private static int cantidad;

    private static String tipo;

    private static boolean vacio;

    public Deposito(int capacidad) {
        this.capacidad = capacidad;
    }

    public Deposito(int capacidad, String tipo) {
        this.capacidad = capacidad;
        this.tipo = tipo;
    }


    @Override
    public String toString() {
        if(tipo != null){
        return "Depósito de " + tipo +  " (" +cantidad + "/" + capacidad + " l.)";}
        else {
            return "Depósito de (" +cantidad + "/" + capacidad + " l.)";
        }
    }

    public static boolean estaVacio(){
        if(cantidad >= 0){
            vacio = true;
        }else {
            vacio = false;
        }
        return vacio;
    }

    public static void llenar(int cantidad, String tipo) throws Exception{

        if(cantidad>capacidad){
        throw  new Exception("Se supera la capacidad del depósito");}
        if(tipo != tipo){
        throw  new Exception("Tipo de contenido no coincide con el depósito");}

        cantidad = cantidad + cantidad;
    }

    public static void extraer(int cantidad) throws Exception {
        if(cantidad>cantidad){
            throw new Exception("No hay suficiente para extreaer");
        }

        cantidad = cantidad - cantidad;
    }

    public static double getPorcentaje(){

        double porcentaje = (cantidad / capacidad) * 100;

        return porcentaje;
    }
}
