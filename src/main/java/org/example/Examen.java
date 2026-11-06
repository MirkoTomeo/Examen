public class Examen {
    public static void main(String[] args) {
        double precio1 = 12.5;
        double primeraUnidad = 4;
        double total1 = getTotal(precio1, primeraUnidad);
        double descuento1 = getDescuento(total1);
        double precioNeto1 = GetPrecioNeto(total1, descuento1);
        System.out.println("Pedido 1: " + precioNeto1 + " euros");
        double precio2 = 8.0;
        double segundaUnidad = 5;
        double total2 = getTotal(precio2, segundaUnidad);
        double descuento2 = getDescuento(total2);
        double precioNeto2 = GetPrecioNeto(total2, descuento2);
        System.out.println("Pedido 2: " + precioNeto2 + " euros");
        double plazo = (precioNeto1 + precioNeto2) / 3;
        System.out.println("Pago de cada plazo (3 plazos): " +  plazo + " euros");
        double media = (primeraUnidad + segundaUnidad) / 2;
        System.out.println("Media de unidades por pedido: " + media);
    }

    private static double GetPrecioNeto(double total1, double descuento1) {
        return total1 - descuento1;
    }

    private static double getDescuento(double total2) {
        return total2 * 10 / 100;
    }

    private static double getTotal(double precio2, double segundaUnidad) {
        return precio2 * segundaUnidad;
    }
}
