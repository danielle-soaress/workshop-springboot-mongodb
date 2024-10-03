package soares.danielle.workshopmongo.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import soares.danielle.workshopmongo.domain.User;

@Repository						// argumentos: tipo de entidade que vai monitorar, tipo do id
public interface UserRepository extends MongoRepository<User, String>{
	
}
