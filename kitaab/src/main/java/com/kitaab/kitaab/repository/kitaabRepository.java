package com.kitaab.kitaab.repository;

import com.kitaab.kitaab.entity.Kitaab;
import org.springframework.data.jpa.repository.JpaRepository;

public interface kitaabRepository extends JpaRepository<Kitaab,String>{
}
