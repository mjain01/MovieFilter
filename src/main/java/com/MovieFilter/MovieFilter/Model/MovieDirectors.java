package com.MovieFilter.MovieFilter.Model;

import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;

public class MovieDirectors {

    @PrimaryKey
    private Integer movieID;

    @Column("director_id")
    private String directorID;

    @Column("director_name")
    private String directorName;

    public Integer getMovieID() {
        return movieID;
    }

    public void setMovieID(int movieID) {
        this.movieID = movieID;
    }

    public String getDirectorID() {
        return directorID;
    }

    public void setDirectorID(String directorID) {
        this.directorID = directorID;
    }

    public String getDirectorName() {
        return directorName;
    }

    public void setDirectorName(String directorName) {
        this.directorName = directorName;
    }
}
