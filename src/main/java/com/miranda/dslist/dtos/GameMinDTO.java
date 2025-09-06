package com.miranda.dslist.dtos;

import com.miranda.dslist.entities.Game;
import jakarta.persistence.Column;

public class GameMinDTO {

    private Long id;
    private String title;
    private Integer year;
    private String imgUml;
    private String shortDescription;

    public GameMinDTO() {
    }

    public GameMinDTO(Game entity){
        id = entity.getId();
        title = entity.getTitle();
        year = entity.getYear();
        imgUml = entity.getImgUml();
        shortDescription = entity.getShortDescription();
    }

    //Vou gerar apenas os get, como é uma resumido(resposta)

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Integer getYear() {
        return year;
    }

    public String getImgUml() {
        return imgUml;
    }

    public String getShortDescription() {
        return shortDescription;
    }
}
