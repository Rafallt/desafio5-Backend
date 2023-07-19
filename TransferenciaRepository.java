import java.util.List;

public interface TransferenciaRepository {
    List<Transferencia> findAll();
    List<Transferencia> findByNumeroConta(String numeroConta);
    List<Transferencia> findByPeriodo(LocalDate dataInicio, LocalDate dataFim);
    List<Transferencia> findByOperador(String operador);
    List<Transferencia> findByPeriodoAndOperador(LocalDate dataInicio, LocalDate dataFim, String operador);
}
