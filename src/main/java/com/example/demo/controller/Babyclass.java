package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Babymodel;
import com.example.demo.service.Babyservice;

@RestController
public class Babyclass 
{
	@Autowired
	Babyservice bs;
	@PostMapping("/")
	public boolean add(@RequestBody Babymodel bm)
	{
		return bs.saveinfo(bm)!=null;
	}
	@GetMapping("Sort/{name}")
	   public List<Babymodel> getsortinfo(@PathVariable String name)
	   {
		  return  bs.sortinfo(name);
	   }
	   @GetMapping("{pageno}/{pagesize}")
	   public List<Babymodel> showpageinfo(@PathVariable int pageno,@PathVariable int pagesize)
	   {
		   return bs.getbypage(pageno,pagesize);
	   }
	   
	   
	   
	   @GetMapping("{pageNo}/{pageSize}/{sortBy}")
	   public List<Babymodel> getStudents(
	           @PathVariable int pageNo, @PathVariable int pageSize, @PathVariable String sortBy) {
	       // Convert sortDir to Sort.Direction
	       if (sortBy != null && !sortBy.isEmpty()) {
	           // Sorting is requested, apply sorting
	           return bs.getSortedAndPagedData(pageNo, pageSize, sortBy);
	       } else {
	           // No sorting is requested, apply pagination only
	           return bs.getbypage(pageNo, pageSize);
	           
	       }
	   }

}