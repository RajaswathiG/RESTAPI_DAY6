package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Babymodel;

public interface Babyrepo extends JpaRepository<Babymodel, Integer>
{

}