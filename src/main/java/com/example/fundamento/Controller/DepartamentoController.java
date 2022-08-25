package com.example.fundamento.Controller;

import com.example.fundamento.Model.DepartamentoModel;
import com.example.fundamento.Dao.DepartamentoDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class DepartamentoController {
    @Autowired
    private  DepartamentoDAO dao;

    @GetMapping("/produtos")
    public ArrayList<DepartamentoModel> recuperarTodos(){

        ArrayList<DepartamentoModel> lista = (ArrayList<DepartamentoModel>)dao.findAll();

        return lista;
    }
}
