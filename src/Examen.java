public class Examen {
    private static String titulo;
    private static double calificacion;

    private static boolean aprovado;

    private static String asignatura;

    public Examen(String titulo, double calificacion) throws Exception {
        this.titulo = titulo;
        this.calificacion = calificacion;

        if (titulo.length()==0){
            throw new Exception("El título no puede estar vacio");
        }

        if (calificacion <0 || calificacion >10){
            throw new Exception("El número tiene que estar entre 0 y 10");
        }
    }



    public Examen(String asignatura, String titulo, double calificacion) throws Exception {
        this.asignatura = asignatura;
        this.titulo = titulo;
        this.calificacion = calificacion;

        if (titulo.length()==0){
            throw new Exception("El título no puede estar vacio");
        }

        if (calificacion <0 || calificacion >10){
            throw new Exception("El número tiene que estar entre 0 y 10");
        }

    }
    public String getTitulo() {
        return titulo;
    }

    public double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }

    @Override
    public String toString() {
        if(asignatura != null){
        return asignatura + " - " +  titulo + " - " + calificacion;}
        else{
        return titulo + " - " + calificacion;}
    }

    public  static int redondear(){
       calificacion = (int) Math.round(calificacion);
        return (int) calificacion;
    }

    public static boolean estaAprovado(){

        if(calificacion >= 5){
            aprovado = true;
        }else {
            aprovado = false;
        }
        return aprovado;
    }
}
