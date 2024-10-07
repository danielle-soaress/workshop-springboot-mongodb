package soares.danielle.workshopmongo.services;

import java.util.Date;
import java.util.List;
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
	
	public List<Post> findByTitle(String text) {
		return rep.searchTitle(text);
	}
	
	public List<Post> fullSearch(String text, Date minDate, Date maxDate) {
		maxDate = new Date(maxDate.getTime() + 24*60*60*1000);
		return rep.fullSearch(text, minDate, maxDate);
		
	}
	

	
}
