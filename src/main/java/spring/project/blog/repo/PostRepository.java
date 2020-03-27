package spring.project.blog.repo;

import org.springframework.data.repository.CrudRepository;
import spring.project.blog.models.Post;

public interface PostRepository extends CrudRepository<Post, Long> {
}
