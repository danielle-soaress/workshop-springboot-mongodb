package soares.danielle.workshopmongo.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import soares.danielle.workshopmongo.domain.Post;
import soares.danielle.workshopmongo.exception.ObjectNotFoundException;
import soares.danielle.workshopmongo.repositories.PostRepository;

@Service
public class PostService {
	@Autowired // para instanciar automaticamente um objeto
	private PostRepository rep;
	
	public Post findById(String id) {
		Optional<Post> obj = rep.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));

	}
	
	

	
}
