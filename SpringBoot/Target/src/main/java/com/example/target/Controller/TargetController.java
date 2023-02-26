package com.example.target.Controller;



import com.example.target.target.DadosListagemtarget;
import com.example.target.target.DadosTarget;
import com.example.target.target.Target;
import com.example.target.target.TargetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("Target")
public class TargetController {

    /*injetando Repository como Atributo*/
    @Autowired
    private TargetRepository repository;


    /*Inclui o dia e valor no banco de dados*/
    @PostMapping
    @Transactional
   public void incluir(@RequestBody DadosTarget dados){
        repository.save(new Target(dados));

    }

    /*Lista todos os dias cadastrados*/
    @GetMapping
    public List<DadosListagemtarget> Listar() {
        return repository.findAll().stream().map(DadosListagemtarget::new).toList();
    }





}
