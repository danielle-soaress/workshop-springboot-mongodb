package soares.danielle.workshopmongo.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import soares.danielle.workshopmongo.domain.User;

@RestController
@RequestMapping(value="/users") // é a rota
public class UserResource {
	
	@GetMapping
	public ResponseEntity<List<User>> findAll() {
		User maria = new User("1", "maria", "maria@gmail.com");
		User alex = new User("2", "alex", "alex@gmail.com");
		List<User> list = new ArrayList<>();
		list.addAll(Arrays.asList(maria, alex));
		return ResponseEntity.ok().body(list);
	}
	
	
}
