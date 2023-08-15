package com.nosql.demo.cassandra.repository;

import com.nosql.demo.cassandra.model.Student;
import org.springframework.data.cassandra.repository.CassandraRepository;

public interface StudentRepository extends CassandraRepository<Student, Integer> {

}
