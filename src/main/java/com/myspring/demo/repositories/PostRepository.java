package com.myspring.demo.repositories;

import com.myspring.demo.models.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post,Long> {


}
