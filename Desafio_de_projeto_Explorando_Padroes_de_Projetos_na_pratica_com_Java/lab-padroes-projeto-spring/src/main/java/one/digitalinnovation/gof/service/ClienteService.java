package one.digitalinnovation.gof.service;

import one.digitalinnovation.gof.model.Cliente;

public interface ClienteService {

	Iterable<Cliente> buscarTodos();
	
	Cliente buscarPorId(Long id);
	
	void inserirCliente(Cliente cliente);
	
	void atualizar(Long id, Cliente cliente);
	
	void deletar(Long id);
	
}
