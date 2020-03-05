package com.MovieFilter.MovieFilter.Model;

import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

@Table("movie_countries")
public class MovieCountries {

    @PrimaryKey("movie_id")
    private String movieID;

    @Column("movie_country")
    private String country;

    public MovieCountries() {
    }

    public String getMovieID() {
        return movieID;
    }

    public void setMovieID(String movieID) {
        this.movieID = movieID;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
