/**
 * @Organização: Conecta Comunidade
 * @author: Ana Lúcia Seles
 * @DBA e @Designer do banco de dados: Michelle Schmidt 
 * @Versão da Classe = 1
 */

package api.conecta.org.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "login", catalog = "", schema = "public")
public class Login {
	private static final long serialVersionUID = 1L;
	@JsonProperty("id")
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@JsonProperty("usuario")
	@Column(name = "usuario", unique = true, nullable = false)
	private String usuario;

	@JsonProperty("password")
	private String password;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
