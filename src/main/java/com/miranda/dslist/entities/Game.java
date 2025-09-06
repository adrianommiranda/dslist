package com.miranda.dslist.entities;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "tb_game")
public class Game {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    @Column(name = "game_year") //customizando nome da coluna no bd
    private Integer year;
    private String genre;
    private String platforms;
    private Double score;

    @Column(name = "img_url", length = 512) // URLs podem ser longas
    private String imgUml;

    //@Column(name = "short_description", length = 500)
    @Column(name = "short_description", columnDefinition = "TEXT")
    private String shortDescription;

    // @Column(name = "long_description", length = 2000)
    @Column(name = "long_description", columnDefinition = "TEXT")
    private String longDescription;

    //@Lob  - artigo
   // @Column(name = "long_description")
    //private String longDescription;

    public Game() {
    }


    public Game(Long id, String title, Integer year, String genre, String platforms, Double score, String imgUml, String shortDescription, String longDescription) {
        this.id = id;
        this.title = title;
        this.year = year;
        this.genre = genre;
        this.platforms = platforms;
        this.score = score;
        this.imgUml = imgUml;
        this.shortDescription = shortDescription;
        this.longDescription = longDescription;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getPlatforms() {
        return platforms;
    }

    public void setPlatforms(String platforms) {
        this.platforms = platforms;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public String getImgUml() {
        return imgUml;
    }

    public void setImgUml(String imgUml) {
        this.imgUml = imgUml;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public String getLongDescription() {
        return longDescription;
    }

    public void setLongDescription(String longDescription) {
        this.longDescription = longDescription;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Game game = (Game) o;
        return Objects.equals(id, game.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
