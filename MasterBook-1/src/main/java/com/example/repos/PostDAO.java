/*
 * @file: PostDAO.java
 * @about: Questo classe rappresenta il DAO dell'entità "Post".
 * Non sono ancora state inserite query custom.
 */

package com.example.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.entities.Post;

public interface PostDAO extends JpaRepository<Post, Long> {

}
