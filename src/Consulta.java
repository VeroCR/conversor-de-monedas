import Records.Monedas;
import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.LocalDateTime;

public class Consulta {

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

            Historial.agregarRegistro(monedaAConvertir, cantidadAConvertir, monedaDestino, monedas.conversion_result(), monedas.conversion_rate().toString(), fechaHoraActual);

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

}
