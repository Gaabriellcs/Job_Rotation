package com.example.target.target;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;


@Table(name = "target")
@Entity(name = "Target")
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Target {

    @Id
    private Long dia;
    private double valor;


/* Contrutor para persistir no banco de dados*/
    public Target(DadosTarget dados) {
        this.dia = dados.dia();
        this.valor = dados.valor();
    }
}
