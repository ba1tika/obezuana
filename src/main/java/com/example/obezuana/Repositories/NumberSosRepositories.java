package com.example.obezuana.Repositories;

import com.example.obezuana.Models.Breakfast;
import com.example.obezuana.Models.NumberSos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NumberSosRepositories extends JpaRepository<NumberSos, Integer> {

}