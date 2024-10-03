package soares.danielle.workshopmongo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import soares.danielle.workshopmongo.domain.User;
import soares.danielle.workshopmongo.exception.ObjectNotFoundException;
import soares.danielle.workshopmongo.repositories.UserRepository;

@Service
public class UserService {
	@Autowired // para instanciar automaticamente um objeto
	private UserRepository rep;
	
	public List<User> findAll() {
		return rep.findAll();
	}
	
	public User findById(String id) {
		Optional<User> obj = rep.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));

	}
	

	
}
