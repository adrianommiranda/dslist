package com.miranda.dslist.projections;

public interface GameminProjection {
    //métodos get correspondente da minha consulta

    Long getId();
    String getTitle();
    Integer getYear();
    String getImgUrl();
    String getShortDescription();
    Integer getPosition();
}
