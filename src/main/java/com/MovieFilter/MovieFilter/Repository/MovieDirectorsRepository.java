package com.MovieFilter.MovieFilter.Repository;

import com.MovieFilter.MovieFilter.Model.MovieDirectors;
import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieDirectorsRepository extends CassandraRepository<MovieDirectors,String> {
}
