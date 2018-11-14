package blogpost;

public class BlogPost {
    public String authorName;
    public String title;
    public String text;
    public String publicationDate;

    public BlogPost(String authorName, String title, String text, String publicationDate) {
        this.authorName = authorName;
        this.publicationDate = publicationDate;
        this.text = text;
        this.title = title;
    }
}
