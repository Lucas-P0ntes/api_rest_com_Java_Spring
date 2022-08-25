package com.example.fundamento.Dao;

import com.example.fundamento.Model.DepartamentoModel;
import org.springframework.data.repository.CrudRepository;

public interface DepartamentoDAO extends CrudRepository<DepartamentoModel, Integer> {
 // public Object findall();
}
