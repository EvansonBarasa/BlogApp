package org.evanson.blog.controller;

import java.util.ArrayList;
import java.util.List;

import org.evanson.blog.entity.Post;
import org.evanson.blog.services.PostsService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostsController {
	
	@RequestMapping("/posts")
	public List<Post> getPosts(){
		return new PostsService().getPosts();
	}
	@RequestMapping("/posts/{id}")
	public Post getPost(@PathVariable int id) {
		return new PostsService().getPosts(id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/posts")
	public void addPost(@RequestBody Post listelements) {
		new PostsService().addPost(listelements);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/posts/{id}")
	public void updatePost(@RequestBody Post post, @PathVariable int id) {
		new PostsService().updatePost(post,id);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/posts/{id}")
	public void deletePost(@PathVariable int id) {
		new PostsService().deletePost(id);
	}
}
