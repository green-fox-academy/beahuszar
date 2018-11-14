package blog;
import blogpost.*;

import java.util.ArrayList;
import java.util.List;

public class Blog {

  /*Reuse your BlogPost class
  Create a Blog class which can
  store a list of BlogPosts
  add BlogPosts to the list
  delete(int) one item at given index
  update(int, BlogPost) one item at the given index and update it with another BlogPos*/

  public List<BlogPost> listOfPosts;

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
