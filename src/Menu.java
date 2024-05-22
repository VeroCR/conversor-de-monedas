public class Menu {
    public static String imprimirMenu(){
        return """
                *************************************
                        SELECCIONE UNA OPCIÓN
                *************************************
                1. Convertir monedas
                2. Mostrar todas las monedas disponibles
                3. Mostrar historial
                4. Salir
                *************************************
                """;
    }

    public static String imprimirMonedas(){
        String monedas = "";
        monedas += "*************************************\n";
        monedas += "        MONEDAS DISPONIBLES        \n";
        monedas += "*************************************\n";
        AllMonedas allMonedas = new AllMonedas();
        for (Moneda moneda : allMonedas.getMonedas()) {
            monedas += moneda + "\n";
        }
        return monedas;
    }

    public static String imprimirPrincipalesMonedas(){
        String monedas = "";
        monedas += "*************************************\n";
        monedas += "        MONEDAS PRINCIPALES        \n";
        monedas += "*************************************\n\n";
        AllMonedas allMonedas = new AllMonedas();
        for (Moneda moneda : allMonedas.getPrincipalesMonedas()) {
            monedas += moneda + "\n";
        }
        return monedas;
    }
}
