import modelos.Registro;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Historial {

    private static List<Registro> historial = new ArrayList<>();

    public static void agregarRegistro(String monedaAConvertir, int cantidadAConvertir, String monedaDestino, Double resultado, String tasaDeConversion, LocalDateTime horaRegistro) {
        historial.add(new Registro(monedaAConvertir, cantidadAConvertir, monedaDestino, resultado, tasaDeConversion, horaRegistro));
    }

    public static String obtenerHistorial() {
        if(historial.isEmpty()) {
            return "No hay historial disponible.";
        }

        String historialDeConversion = """
            \n*************************************
                   Historial de conversión
            *************************************\n
                """;
        for (Registro registro : historial) {
            historialDeConversion += "Fecha y hora de la conversión: " + registro.getHoraRegistro() + "\n";
            historialDeConversion += "modelos.Moneda a convertir: " + registro.getMonedaAConvertir() + "\n";
            historialDeConversion += "Cantidad a convertir: " + registro.getCantidadAConvertir() + "\n";
            historialDeConversion += "modelos.Moneda destino: " + registro.getMonedaDestino() + "\n";
            historialDeConversion += "Resultado: " + registro.getResultado() + "\n";
            historialDeConversion += "Tasa de conversión: " + registro.getTasaDeConversion() + "\n";
            historialDeConversion += "*************************************\n";
        }
        return historialDeConversion;
    }

}
