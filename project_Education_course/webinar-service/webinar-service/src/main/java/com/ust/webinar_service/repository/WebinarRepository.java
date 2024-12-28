package com.ust.webinar_service.repository;

import com.ust.webinar_service.model.Webinar;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Flux;

public interface WebinarRepository extends ReactiveMongoRepository<Webinar, String> {
    // Custom query to find webinars by tutor
    Flux<Webinar> findByTutor(String tutor);
}
