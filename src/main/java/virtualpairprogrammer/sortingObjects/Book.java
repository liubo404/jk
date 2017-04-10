package virtualpairprogrammer.sortingObjects;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Created by Thinkpad on 2017/4/9.
 */
@Data
@AllArgsConstructor
public class Book implements Comparable<Book> {
    private int id;
    private String title;
    private String author;

    public int compareTo(Book o) {
        if (this.id == o.getId()) {
            return 0;
        } else if (this.id > o.getId()) {
            return 1;
        }else{
            return -1;
        }
    }
}
