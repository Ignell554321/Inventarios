package appfacturacion2.Service;

import appfacturacion2.Entity.Usuario;

public interface IUsuarioService {
	
	public Usuario findByUsername(String username);
	
}
