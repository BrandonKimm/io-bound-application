package class101.foo.io;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepositoryRDB extends JpaRepository<Post, Long> {

    List<Post> findByContentContains(String content);
}
