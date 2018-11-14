package blog;

import java.util.ArrayList;
import java.util.List;

public class Blog {
  List<BlogPost> listOfPosts;

  public Blog (List<BlogPost> listOfPosts) {
    this.listOfPosts = listOfPosts;
  }

  public void addPosts(BlogPost input){
    listOfPosts.add(input);
  }

  public void update(int index,BlogPost newPost) {
    listOfPosts.set(index,newPost);
  }

  public void delete(int index) {
    listOfPosts.remove(index);
  }
}
