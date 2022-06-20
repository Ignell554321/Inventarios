package appfacturacion2.Dao;

import org.springframework.data.repository.CrudRepository;

import appfacturacion2.Entity.Usuario;

public interface IUsuarioDao extends CrudRepository<Usuario, Long>{
	
	public Usuario findByUsername(String username);

}
