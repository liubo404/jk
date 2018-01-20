package xxx.com.jpa.tutorial.repository;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;
import xxx.com.jpa.tutorial.domain.Todo;

import java.util.Date;
import java.util.stream.Stream;


@RunWith(SpringRunner.class)
@DataJpaTest
public class TodoRepositoryTest {
    @Autowired
    TodoRepository repository;

    @Before
    public void setUp() throws Exception {
        Todo t = new Todo();
        t.setTitle("abc");
        t.setDescription("def");
        t.setCreationTime(new Date());
        t.setModificationTime(new Date());
        repository.save(t);
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void findTitleById() throws Exception {
    }

    @Test
    public void findById() throws Exception {
    }

    @Test
    public void findByTitle() throws Exception {
        try(Stream<Todo> t = repository.findByTitle("abc")){
            t.forEach(System.out::println);
        }
    }

    @Test
    public void findByTitleAndDescription() throws Exception {
    }

}