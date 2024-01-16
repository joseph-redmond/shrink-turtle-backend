package org.tturtle.shrink_turtle.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.tturtle.shrink_turtle.collection.Url;

// An interface which extends the MongoRepository to perform the CRUD operations with MongoDB database
public interface UrlRepository extends MongoRepository<Url, String> {


}
