package com.example.demo.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.annotation.sql.DataSourceDefinitions;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by Christoffer Grännby
 * Date: 2021-04-15
 * Time: 10:35
 * Project: demo
 * Copyright: MIT
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Friends {

    @Id
    @GeneratedValue
    private int id;
    private String firstName;
    private String email;
    private String phoneNumber;

}
