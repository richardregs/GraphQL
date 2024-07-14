package pe.edu.galaxy.training.java.fs.appbegestionpedidosv1.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import pe.edu.galaxy.training.java.fs.appbegestionpedidosv1.entity.ClienteEntity;

@Repository
public interface ClienteRepository extends JpaRepository<ClienteEntity, Long> {

	//JPQL (Java Persistence Query Language)
	@Query("select p from ClienteEntity p where upper(p.razonSocial) like upper(:razonSocial) and p.estado='1'") // "%"
	List<ClienteEntity> findByLikeRazonSocial(@Param("razonSocial") String razonSocial);

}
