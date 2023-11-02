package com.example.obezuana.Repositories;

import com.example.obezuana.Models.Bron;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BronRepositories extends JpaRepository<Bron, Integer> {

}