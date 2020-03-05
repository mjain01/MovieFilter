package com.MovieFilter.MovieFilter.Model;

import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

@Table("movie_actors")
public class MovieActors {
    @PrimaryKey("actor_id")
    private String actorId;

    @Column("actor_name")
    private String actorName;

    @Column("movie_id")
    private String movieID;

    @Column("ranking")
    private String ranking;

    public MovieActors(String actorId) {
        this.actorId = actorId;
    }

    public String getActorId() {
        return actorId;
    }

    public void setActorId(String actorId) {
        this.actorId = actorId;
    }

    public String getActorName() {
        return actorName;
    }

    public void setActorName(String actorName) {
        this.actorName = actorName;
    }

    public String getMovieID() {
        return movieID;
    }

    public void setMovieID(String movieID) {
        this.movieID = movieID;
    }

    public String getRanking() {
        return ranking;
    }

    public void setRanking(String ranking) {
        this.ranking = ranking;
    }
}
