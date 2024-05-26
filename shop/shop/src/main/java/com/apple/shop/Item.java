package com.apple.shop;

import jakarta.persistence.*;
import lombok.ToString;

@Entity
@ToString
public class Item {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer id;
    public String title;
    public Integer price;


}
