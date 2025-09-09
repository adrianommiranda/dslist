package com.miranda.dslist.dtos;

import com.miranda.dslist.entities.Game;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.springframework.beans.BeanUtils;

public class GameDTO {

    private Long id;
    private String title;
    private Integer year;
    private String genre;
    private String platforms;
    private Double score;
    private String imgUml;
    private String shortDescription;
    private String longDescription;

    public GameDTO() {
    }

    public  GameDTO(Game entity){
        /*
        * Cópia de origem para destino
        * Vou copiar as propriedades da entidade, para o DTO aonde eu estou.
        * O próprio DTO aonde eu estou, o próprio objeto, conhecido por this.
        * Estou copiando, tudo que está na entidade(entity), para o DTO
        * Para funcionar, tem que ter os método get e set
        * */
        BeanUtils.copyProperties(entity, this);
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
}
