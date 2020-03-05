package com.MovieFilter.MovieFilter.Model;

import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

@Table("movie_countries")
public class MovieCountries {

    @PrimaryKey
    private Integer movieID;

    @Column("movie_country")
    private String country;

    public MovieCountries() {
    }

    public Integer getMovieID() {
        return movieID;
    }

    public void setMovieID(Integer movieID) {
        this.movieID = movieID;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
