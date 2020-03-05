package com.MovieFilter.MovieFilter.Repository;

import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieActorsRepository extends CassandraRepository<com.MovieFilter.MovieFilter.Model.MovieActors,String> {
}
