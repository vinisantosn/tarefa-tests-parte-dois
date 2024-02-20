package edu.ebac.dao;

public class ClienteDaoMock implements IClienteDao {
    @Override
    public String salvar() {
        return "Sucesso";
    }

    @Override
    public boolean buscar() {
        return false;
    }

    @Override
    public boolean excluir() {
        return false;
    }

    @Override
    public boolean atualizar() {
        return false;
    }
}
