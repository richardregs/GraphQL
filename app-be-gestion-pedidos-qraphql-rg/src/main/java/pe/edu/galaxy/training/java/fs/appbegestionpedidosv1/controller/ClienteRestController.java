package pe.edu.galaxy.training.java.fs.appbegestionpedidosv1.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.galaxy.training.java.fs.appbegestionpedidosv1.entity.ClienteEntity;
import pe.edu.galaxy.training.java.fs.appbegestionpedidosv1.service.ClienteService;

@Controller
public class ClienteRestController  {

	private final ClienteService clienteService;

	public ClienteRestController(ClienteService clienteService) {
		this.clienteService = clienteService;
	}
	
	@QueryMapping
	public List<ClienteEntity> listAll(){
		return clienteService.findAll();
	}
	
}
