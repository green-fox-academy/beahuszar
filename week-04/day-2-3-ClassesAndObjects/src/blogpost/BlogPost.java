package blogpost;

public class BlogPost {
    String authorName;
    String title;
    String text;
    String publicationDate;

    BlogPost(String authorName, String title, String text, String publicationDate) {
        this.authorName = authorName;
        this.publicationDate = publicationDate;
        this.text = text;
        this.title = title;
    }
}
