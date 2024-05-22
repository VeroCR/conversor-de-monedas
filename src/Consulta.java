import com.google.gson.Gson;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.time.LocalDateTime;

public class Consulta {

    private List<Registro> historial = new ArrayList<>();

    public String convertir(String monedaAConvertir, int cantidadAConvertir, String monedaDestino) {

        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/b36651eb6d09141d1e7be0db/pair/" + monedaAConvertir + "/" + monedaDestino + "/" + cantidadAConvertir);
       

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
            .uri(direccion)
            .build();

        try {
            HttpResponse<String> response = null;
            response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

            Monedas monedas = new Gson().fromJson(response.body(), Monedas.class);

            LocalDateTime fechaHoraActual = LocalDateTime.now();

            historial.add(new Registro(monedaAConvertir, cantidadAConvertir, monedaDestino, monedas.conversion_result(), monedas.conversion_rate().toString(), fechaHoraActual));

            String resultado = """
                \n*************************************
                      Resultado de la conversión
                *************************************
                    \n""" + cantidadAConvertir + " " + monedaAConvertir + " es igual a " + monedas.conversion_result() + " " + monedaDestino + ".\n" +
                    "Tasa de conversión: " + monedas.conversion_rate() + ".\n";
            return resultado;
        } catch (Exception e) {
            throw new RuntimeException("Ocurrió un error.");
        }
    }

    public String obtenerHistorial() {
        if(this.historial.isEmpty()) {
            return "No hay historial disponible.";
        }

        String historial = """
            \n*************************************
                   Historial de conversión
            *************************************\n
                """;;
        for (Registro registro : this.historial) {
            historial += "Fecha y hora de la conversión: " + registro.getHoraRegistro() + "\n";
            historial += "Moneda a convertir: " + registro.getMonedaAConvertir() + "\n";
            historial += "Cantidad a convertir: " + registro.getCantidadAConvertir() + "\n";
            historial += "Moneda destino: " + registro.getMonedaDestino() + "\n";
            historial += "Resultado: " + registro.getResultado() + "\n";
            historial += "Tasa de conversión: " + registro.getTasaDeConversion() + "\n";
            historial += "*************************************\n";
        }
        return historial;
    }

}
