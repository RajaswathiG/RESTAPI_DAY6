package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.demo.model.Babymodel;
import com.example.demo.repository.Babyrepo;

@Service
public class Babyservice 
{
	@Autowired
	Babyrepo br;
	public Babymodel saveinfo(Babymodel bm)
	{
		return br.save(bm);
	}
	public List<Babymodel> sortinfo(String s)
    {
	return br.findAll(Sort.by(Sort.DEFAULT_DIRECTION,s));
    }
    public List<Babymodel> getbypage(int pgno,int pgsize)
    
    {
    	Page<Babymodel> p= br.findAll(PageRequest.of(pgno, pgsize));
    	
    	
    	return p.getContent();
    }
    
    public List<Babymodel> getSortedAndPagedData(int pgno, int pgsize, String sortProperty) {
        Sort.Direction sortDirection = Sort.Direction.ASC; // Default to ascending order
        Page<Babymodel> p = br.findAll(PageRequest.of(pgno, pgsize,Sort.by(sortDirection, sortProperty)));
        return p.getContent();
    }
	
}