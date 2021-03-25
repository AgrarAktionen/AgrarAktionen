package com.aktionen.agrar.model;

import at.htl.quarkus.demo.model.LinePk;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Line {
    @EmbeddedId
    private LinePk linePk;

    private int amount;

}
