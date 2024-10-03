package soares.danielle.workshopmongo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import soares.danielle.workshopmongo.domain.User;
import soares.danielle.workshopmongo.repositories.UserRepository;

@Service
public class UserService {
	@Autowired // para instanciar automaticamente um objeto
	private UserRepository rep;
	
	public List<User> findAll() {
		return rep.findAll();
	}
	
	
}
