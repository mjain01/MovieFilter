package com.MovieFilter.MovieFilter.Model;

import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

@Table("movie_actors")
public class MovieActors {
    @PrimaryKey
    private String actorId;

    @Column("actor_name")
    private String actorName;

    @Column("movie_id")
    private Integer movieID;

    @Column("ranking")
    private Integer ranking;

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

    public Integer getMovieID() {
        return movieID;
    }

    public void setMovieID(Integer movieID) {
        this.movieID = movieID;
    }

    public Integer getRanking() {
        return ranking;
    }

    public void setRanking(Integer ranking) {
        this.ranking = ranking;
    }
}
