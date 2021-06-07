package com.example.demo.interfaces;

import com.example.demo.models.usermodels;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Iusers extends JpaRepository<usermodels,Long> {
}
