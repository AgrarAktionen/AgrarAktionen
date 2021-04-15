package com.aktionen.agrar.model;

import com.opencsv.bean.CsvBindByPosition;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Price {

    @Id
    @GeneratedValue
    private int priceId;

    @Column(length = 1000)
    @CsvBindByPosition(position = 8)
    private String bruttopreis;

    @Column(length = 1000)
    @CsvBindByPosition(position = 9)
    private String stattpreis;

    private String timestamp;
    private boolean validFlag;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "itemId")
    private Item item;

    @Override
    public String toString() {
        return "Price{" +
                "id='" + priceId + '\'' +
                ", Bruttopreis='" + bruttopreis + '\'' +
                ", Startpreis='" + stattpreis + '\'' +
                ", timestamp='" + timestamp + '\'' +
                ", validflag='" + validFlag + '\'' +
                ", Item='" + item + '\'' +
                '}';
    }
}