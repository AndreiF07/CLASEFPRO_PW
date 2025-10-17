public class Entrada {
    public static void main(String[] args) {
        saludar("Borja");
        Operaciones operacionesMatematicas = new Operaciones();
        operacionesMatematicas.sumar(4,7);
        operacionesMatematicas.restar(9,4);
    }

    public static void saludar(String data) {
        System.out.println("Hola " + data);

    }
}