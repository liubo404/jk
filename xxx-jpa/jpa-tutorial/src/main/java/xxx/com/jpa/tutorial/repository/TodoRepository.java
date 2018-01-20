package xxx.com.jpa.tutorial.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import xxx.com.jpa.tutorial.domain.Todo;

import java.util.Optional;
import java.util.stream.Stream;

/**
 * User: liubo
 * Datetime: 2017/12/2914:36
 */
public interface TodoRepository  extends BaseRepository<Todo,Long> {

    @Query("SELECT t.title FROM Todo t where t.id = :id")
    Optional<String> findTitleById(@Param("id") Long id);


    Optional<Todo> findById(Long id);

    Stream<Todo> findByTitle(String title);



    @Query(
            value = "SELECT * FROM todos t where t.title = :title AND t.description = :description",
            nativeQuery=true
    )
    public Optional<Todo> findByTitleAndDescription(@Param("title") String title,
                                                    @Param("description") String description);
}
