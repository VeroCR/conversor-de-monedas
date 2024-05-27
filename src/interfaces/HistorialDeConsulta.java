package interfaces;

import java.time.LocalDateTime;

public interface HistorialDeConsulta {

    void agregarRegistro(String monedaAConvertir, int cantidadAConvertir, String monedaDestino, Double resultado, String tasaDeConversion, LocalDateTime horaRegistro);

    String obtenerHistorial();
}
