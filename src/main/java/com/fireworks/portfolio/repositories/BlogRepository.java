package com.fireworks.portfolio.repositories;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import com.fireworks.portfolio.models.Blog;

public interface BlogRepository extends MongoRepository<Blog, String> {
	Blog findBy_id(ObjectId _id);
}
