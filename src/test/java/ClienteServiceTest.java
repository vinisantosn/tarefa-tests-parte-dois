import edu.ebac.dao.ClienteDaoMock;
import edu.ebac.service.ClienteService;
import org.junit.jupiter.api.*;

public class ClienteServiceTest {
    @Test
    public void salvarTest(){
        ClienteDaoMock daoMock = new ClienteDaoMock();
        ClienteService service = new ClienteService(daoMock);
        String retorno = service.salvar();
        Assertions.assertEquals("Sucesso", retorno);

    }

    @Test
    public void buscarTest(){
        ClienteDaoMock daoMock = new ClienteDaoMock();
        ClienteService service = new ClienteService(daoMock);
        boolean retorno = service.buscarPorCliente();
        Assertions.assertEquals(true, retorno);

    }

    @Test
    public void excluirTest(){
        ClienteDaoMock daoMock = new ClienteDaoMock();
        ClienteService service = new ClienteService(daoMock);
        boolean retorno = service.excluirCliente();
        Assertions.assertEquals(false, retorno);

    }
    @Test
    public void atualizarTest(){
        ClienteDaoMock daoMock = new ClienteDaoMock();
        ClienteService service = new ClienteService(daoMock);
        boolean retorno = service.atualizarCliente();
        Assertions.assertEquals(false, retorno);

    }
}
