package general.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import general.domain.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, String>{

}
