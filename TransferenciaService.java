import java.time.LocalDate;
import java.util.List;

public interface TransferenciaService {
    List<Transferencia> getTransferencias();
    List<Transferencia> getTransferenciasByNumeroConta(String numeroConta);
    List<Transferencia> getTransferenciasByPeriodo(LocalDate dataInicio, LocalDate dataFim);
    List<Transferencia> getTransferenciasByOperador(String operador);
    List<Transferencia> getTransferenciasByPeriodoAndOperador(LocalDate dataInicio, LocalDate dataFim, String operador);
}
