/*
 * @file: ControllerMVC.java
 * @about: Questo classe rappresenta il router della webapp.
 */

package com.example.presentation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import com.example.entities.Post;
import com.example.repos.PostDAO;
import com.example.services.PostService;

@Controller
public class ControllerMVC {

	@Autowired
	private PostDAO pDAO;
	
	@Autowired
	private PostService postService;
	
	//GET
	
	@GetMapping({"/", "home", "index"})
	public String home() {
		return "index.html";
	}
	
	@GetMapping("posts")
	public String showTesti (Model m) {
		m.addAttribute("posts", pDAO.findAll());
		return "posts.html";
	}
	
	//POST
	
	@PostMapping("/nuovo-post")
	public String addTesto(Post p) {
		postService.addPost(p);
		return "redirect:/posts";
	}
	
	//PUT (ToDo)
	//DELETE (ToDo)
	
}
