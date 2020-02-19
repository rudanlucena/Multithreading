import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class BufferExemploTeste {

    public static void main(String[] args) {
        ExecutorService teste = Executors.newFixedThreadPool(2);
        BufferExemplo localizacaoCompartilhada = new BufferExemplo();
        try {
            teste.execute(new Produtor(localizacaoCompartilhada));
            teste.execute(new Consumidor(localizacaoCompartilhada));
        } catch (Exception exception) {
            exception.printStackTrace();
        }
        teste.shutdown();
    }
}
