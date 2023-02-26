package com.example.target.target;

public record DadosListagemtarget(Long dia, double valor) {

    public DadosListagemtarget(Target target){
        this(target.getDia(), target.getValor());
}}
