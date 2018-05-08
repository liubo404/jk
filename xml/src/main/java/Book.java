import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("book")
public class Book {
    @XStreamAlias("title")
    private String title;

    @XStreamAlias("author")
    private String author;

    @XStreamAlias("pages-count")
    private int pagesCount;//this can also be Integer or any other numeric type

    private String fieldThatIsNotInTheXml = "field not in xml";

    @Override
    public String toString() {
        return "Book [title=" + title + ", author=" + author + ", pagesCount="
                + pagesCount + ", fieldThatIsNotInTheXml="
                + fieldThatIsNotInTheXml + "]";
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPagesCount() {
        return pagesCount;
    }

    public void setPagesCount(int pagesCount) {
        this.pagesCount = pagesCount;
    }

    public String getFieldThatIsNotInTheXml() {
        return fieldThatIsNotInTheXml;
    }

    public void setFieldThatIsNotInTheXml(String fieldThatIsNotInTheXml) {
        this.fieldThatIsNotInTheXml = fieldThatIsNotInTheXml;
    }
}
