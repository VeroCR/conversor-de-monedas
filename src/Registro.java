import java.time.LocalDateTime;

public class Registro {
    private String monedaAConvertir;
    private int cantidadAConvertir;
    private String monedaDestino;
    private Double resultado;
    private String tasaDeConversion;
    private LocalDateTime horaRegistro;

    public Registro(String monedaAConvertir, int cantidadAConvertir, String monedaDestino, Double resultado, String tasaDeConversion, LocalDateTime horaRegistro) {
        this.monedaAConvertir = monedaAConvertir;
        this.cantidadAConvertir = cantidadAConvertir;
        this.monedaDestino = monedaDestino;
        this.resultado = resultado;
        this.tasaDeConversion = tasaDeConversion;
        this.horaRegistro = horaRegistro;
    }
    
    public String getMonedaAConvertir() {
        return monedaAConvertir;
    }

    public int getCantidadAConvertir() {
        return cantidadAConvertir;
    }

    public String getMonedaDestino() {
        return monedaDestino;
    }

    public Double getResultado() {
        return resultado;
    }

    public String getTasaDeConversion() {
        return tasaDeConversion;
    }

    public LocalDateTime getHoraRegistro() {
        return horaRegistro;
    }

}

