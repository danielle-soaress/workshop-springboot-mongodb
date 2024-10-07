package soares.danielle.workshopmongo.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import soares.danielle.workshopmongo.domain.Post;
import soares.danielle.workshopmongo.services.PostService;

@RestController
@RequestMapping(value="/posts") // é a rota
public class PostResource {
	
	@Autowired
	private PostService service;
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Post> findById(@PathVariable String id) {
		Post obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
	
	
}
