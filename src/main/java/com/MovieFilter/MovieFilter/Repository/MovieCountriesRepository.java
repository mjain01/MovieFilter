package com.MovieFilter.MovieFilter.Repository;

import com.MovieFilter.MovieFilter.Model.MovieCountries;
import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieCountriesRepository extends CassandraRepository<MovieCountries, Integer> {
}
