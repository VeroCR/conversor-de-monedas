import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        var opc = 0;
        Scanner lectura = new Scanner(System.in);
        Consulta consulta = new Consulta();
        System.out.println("*************************************");
        System.out.println("        CONVERSOR DE MONEDAS        ");
        System.out.println("*************************************");

        do {
            System.out.println(Menu.imprimirMenu());
            System.out.println("Opción:");
            opc = Integer.valueOf(lectura.nextLine());

            switch (opc) {
                case 1:
                    System.out.println(Menu.imprimirPrincipalesMonedas());
                    try {
                        System.out.println("Ingrese el código de la moneda a convertir:");
                        var monedaAConvertir = lectura.nextLine();
                        System.out.println("Ingrese la cantidad a convertir:");
                        var cantidadAConvertir = Integer.valueOf(lectura.nextLine());
                        System.out.println("Ingrese el código de la moneda destino:");
                        var monedaDestino = lectura.nextLine();
                        System.out.println(consulta.convertir(monedaAConvertir, cantidadAConvertir, monedaDestino));
                    } catch (NumberFormatException e) {
                        System.out.println(e.getMessage());
                    } catch (RuntimeException e) {
                        System.out.println(e.getMessage());
                        System.out.println("Finalizando la aplicación.");
                    }
                    break;
                case 2:
                    System.out.println(Menu.imprimirMonedas());
                    break;
                case 3: 
                    System.out.println(consulta.obtenerHistorial());
                    break;
                case 4:
                    System.out.println("Saliendo de la aplicación.");
                    break;
                default:
                    System.out.println("Opción no válida, intente de nuevo.");
                    break;
            }
        } while (opc != 4);

        lectura.close();
    }
}
