package com.example.demo.Repos;

import com.example.demo.Models.Post;
import org.springframework.data.repository.CrudRepository;

public interface Repo extends CrudRepository<Post, Integer> { }
