package com.avanade.avamedieval.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "GAME")
@Entity
public class GameModel implements Serializable {

    @Id
    @Column(name = "ID", nullable = false)
    private Long id;
    @Column(name = "PERSONAGENS")
    private String personagens;
    @Column(name = "VIDA")
    private Integer vida;
    @Column(name = "FORCA")
    private Integer forca;
    @Column(name = "DEFESA")
    private Integer defesa;
    @Column(name = "AGILIDADE")
    private Integer agilidade;
    @Column(name = "QTDDADOS")
    private Integer qtdDados;
    @Column(name = "FACESDADO")
    private Integer facesDado;

}
