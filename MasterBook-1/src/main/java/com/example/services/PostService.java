/*
 * @file: PostService.java
 * @about: Questo classe rappresenta il DAO dell'entità "Post".
 * Non sono ancora state inserite query custom.
 */

package com.example.services;

import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.entities.Post;
import com.example.repos.PostDAO;

@Service
public class PostService {

	@Autowired
	private PostDAO pDAO;
	
	
	public void addPost(Post p){
		p.setDataDiCreazione(new Date());
		pDAO.save(p);
	}
	
	public List<Post> getPost(){
		return pDAO.findAll();
	}
	
}
