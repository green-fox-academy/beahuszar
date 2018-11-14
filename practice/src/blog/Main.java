package blog;

import java.util.ArrayList;
import java.util.List;

public class Main {

  public static void main(String[] args) {
    BlogPost newPost = new BlogPost("XX","sfdjdosi","textetxtextetxetxt", "today");
    BlogPost newPost2 = new BlogPost("XX","sfdjdosi","textetxtextetxetxt", "today");
    BlogPost newPost3 = new BlogPost("XX","sfdjdosi","textetxtextetxetxt", "today");
    BlogPost newPost4 = new BlogPost("XX","sfdjdosi","textetxtextetxetxt", "today");
    List<BlogPost> newList = new ArrayList<>();
    Blog myBlog = new Blog(newList);
    myBlog.addPosts(newPost);
    System.out.println(myBlog.listOfPosts.get(0).authorName);
    System.out.println(newList.get(0).authorName);
    myBlog.delete(0);
    myBlog.update(0,newPost2);



  }
}
