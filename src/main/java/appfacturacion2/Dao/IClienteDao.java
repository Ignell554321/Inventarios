package appfacturacion2.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import appfacturacion2.Entity.Cliente;

public interface IClienteDao extends JpaRepository<Cliente, Long>{

	
	
}
