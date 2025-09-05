package entities;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "tb_game")
public class Game {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;

    @Column(name = "game_ano") //customizando nome da coluna no bd
    private Integer ano;
    private String plataforma;
    private Double score;
    private String imgUml;
    private String descricaoCurta;
    private String descricaoCompleta;

    public Game() {
    }

    public Game(Long id, String titulo, Integer ano, String plataforma, Double score, String imgUml, String descricaoCurta, String descricaoCompleta) {
        this.id = id;
        this.titulo = titulo;
        this.ano = ano;
        this.plataforma = plataforma;
        this.score = score;
        this.imgUml = imgUml;
        this.descricaoCurta = descricaoCurta;
        this.descricaoCompleta = descricaoCompleta;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
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

    public String getDescricaoCurta() {
        return descricaoCurta;
    }

    public void setDescricaoCurta(String descricaoCurta) {
        this.descricaoCurta = descricaoCurta;
    }

    public String getDescricaoCompleta() {
        return descricaoCompleta;
    }

    public void setDescricaoCompleta(String descricaoCompleta) {
        this.descricaoCompleta = descricaoCompleta;
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
