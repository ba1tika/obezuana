package com.example.obezuana.Repositories;

import com.example.obezuana.Models.Breakfast;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BreakfastRepositories extends JpaRepository<Breakfast, Integer> {

}