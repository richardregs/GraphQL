package pe.edu.galaxy.training.java.fs.appbegestionpedidosv1.service;

import java.util.List;
import java.util.Optional;
import pe.edu.galaxy.training.java.fs.appbegestionpedidosv1.entity.ClienteEntity;

public interface ClienteService {

	List<ClienteEntity> findAll();
	
	Optional<ClienteEntity> findById(Long id);
	
	List<ClienteEntity> findByLikeRazonSocial(String razonSocial);
	
	ClienteEntity save(ClienteEntity clienteEntity);
	
	ClienteEntity update(ClienteEntity clienteEntity);
	
	void  delete(Long id);
}
