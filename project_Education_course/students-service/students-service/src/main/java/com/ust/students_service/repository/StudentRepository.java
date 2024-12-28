package com.ust.students_service.repository;

import com.ust.students_service.model.Student;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Flux;

public interface StudentRepository extends ReactiveMongoRepository<Student, String> {
    Flux<Student> findByWebinarId(String webinarId);
}
