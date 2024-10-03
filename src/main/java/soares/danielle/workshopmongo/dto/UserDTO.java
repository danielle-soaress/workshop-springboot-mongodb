package soares.danielle.workshopmongo.dto;

import soares.danielle.workshopmongo.domain.User;

public class UserDTO { // dto é um objeto que tem o papel de carregar dados das entidades de forma
						// mais simples, excluindo dados que são desnecessários para a operação
	private String id;	// melhora o processamento, já que retorna apenas o que é necessário.
	private String name;
	private String email;
	
	public UserDTO() {
		
	}
	
	public UserDTO(User obj) {
		id = obj.getId();
		name = obj.getName();
		email = obj.getEmail();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
