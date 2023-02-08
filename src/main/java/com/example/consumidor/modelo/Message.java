package com.example.consumidor.modelo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@ToString
@Entity
@Table(name = "message")
public class Message {
    @GeneratedValue
    @Id
    private Long id;
    private String nombre;
    private String apellido;
    private String pedido;
}
