package edu.ebac.service;


import edu.ebac.dao.IClienteDao;

public class ClienteService {
    private IClienteDao clienteDao;
    public ClienteService(IClienteDao clienteDao){
        this.clienteDao = clienteDao;
    }
    public String salvar(){
        clienteDao.salvar();
        return "Sucesso";
    }
    public boolean buscarPorCliente(){
        clienteDao.buscar();
        return true;
    }
    public boolean excluirCliente(){
        clienteDao.excluir();
        return false;
    }

    public boolean atualizarCliente(){
        clienteDao.atualizar();
        return false;
    }
}
