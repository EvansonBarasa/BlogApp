package org.evanson.blog.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.evanson.blog.entity.Post;
import org.springframework.stereotype.Service;

@Service
public class PostsService {
	static List<Post> posts = new ArrayList<>(
			Arrays.asList(new Post(1, "DataType", "sample text"),
					new Post(1, "DataType", "sample text"),
					new Post(2, "JAVA", "sample text"),
					new Post(3, "JSP", "sample text"),
					new Post(4, "OPP", "sample text")
					)
			);
	
	public List<Post> getPosts(){
		return posts;
	}

	public Post getPosts(int id) {
		for(Post post: posts) {
			if(post.getPostId() == id) {
				return post;
			}
		}
		
		return null;
	}

	public void addPost(Post listelements) {
	 posts.add(listelements);
	}

	public void updatePost(Post post, int id) {
		for(int i = 0; i < posts.size();i++) {
			Post tempPost = posts.get(i);
			
			if(tempPost.getPostId() == id) {
				posts.set(i, post);
				return;
			}
		}
	}

	public void deletePost(int id) {
		for(int i = 0; i < posts.size();i++) {
			Post tempPost = posts.get(i);
			
			if(tempPost.getPostId() == id) {
				posts.remove(i);
				return;
			}
		}
	}


}
