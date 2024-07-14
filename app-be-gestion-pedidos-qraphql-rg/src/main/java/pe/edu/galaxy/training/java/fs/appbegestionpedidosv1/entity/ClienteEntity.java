package pe.edu.galaxy.training.java.fs.appbegestionpedidosv1.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@Entity(name ="ClienteEntity" ) //JPQL
@Table(name = "tbl_cliente") // SQL
public class ClienteEntity {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cliente_id")
	private Long id;
	
	@Column(name = "razon_social")
	private String razonSocial;
	
	@Column(name = "ruc")
	private String ruc;
	
	@Column(name = "direccion")
	private String direccion;
	
	@Column(name = "telefono")
	private String telefono;

	@Column(name = "correo")
	private String correo;

	@Column(name = "estado")
	private String estado;
	
}

