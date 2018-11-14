package blogpost;

import blog.Blog;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


        Blog blog = new Blog();
        ArrayList<BlogPost> blogPosts = new ArrayList<>();
        BlogPost post1 = new BlogPost(
                "John Doe",
                "Lorem Ipsum",
                "Lorem ipsum dolor sit amet.",
                "2000.05.04."
        );

        BlogPost post2 = new BlogPost(
                "Tim Urban",
                "Wait but why",
                "A popular long-form, stick-figure-illustrated blog about almost everything.",
                "2010.10.10."
        );

        BlogPost post3 = new BlogPost(
                "William Turton",
                "One Engineer Is Trying to Get IBM to Reckon With Trump",
                "Daniel Hanley, a cybersecurity engineer at IBM, "
                    + "doesn’t want to be the center of attention. "
                    + "When I asked to take his picture outside one of IBM’s New York City offices, "
                    + "he told me that he wasn’t really into the whole organizer profile thing.",
                "2017.03.28"
        );
        blog.store(post1,blogPosts);
        blog.store(post3,blogPosts);
        blog.store(post2,blogPosts);

        for (BlogPost blogPost: blogPosts) {
            System.out.println(blogPost.publicationDate);
            System.out.println(blogPost.title);
            System.out.println(blogPost.authorName);
            System.out.println(blogPost.text);

        }


    }
}
