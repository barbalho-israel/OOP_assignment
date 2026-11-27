import java.security.InvalidAlgorithmParameterException;

public class Tempo {
    private DiaSemana dia;
    double inicioHora;
    double fimHora;
    public Tempo(DiaSemana dia, double inicioHora ,double tempoGasto){
        this.dia = dia;
        if(inicioHora + tempoGasto > 24.0){
            throw new InvalidAlgorithmParameterException("Escala com mais de 24 horas");
        }
        this.inicioHora = inicioHora;
        fimHora = inicioHora + tempoGasto;
    }
    public DiaSemana getDia() {
        return dia;
    }
    public double getFimHora() {
        return fimHora;
    }
    public double getInicioHora() {
        return inicioHora;
    }
}
