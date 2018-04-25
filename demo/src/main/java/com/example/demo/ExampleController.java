package com.example.demo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExampleController {
	
	//List<String> list=new ArrayList<String>();
	static Set<String> set=new HashSet<String>();
	
	@RequestMapping(path="/example",method=RequestMethod.GET)
	public Set<String> getExample() {
		set.add("Sravani");
		set.add("atmakuri");
		set.add("vamsi");
		set.add("krishna");
		return set;
	}
	
	@RequestMapping(path="/put",method=RequestMethod.PUT)
	public void putExample() {
		
	}
	
	@RequestMapping(path="/post",method=RequestMethod.POST)
	public Set<String> postExample(@RequestBody String s) {
		set.add(s);
		return set;
	}
	
	
	@RequestMapping(path="/del/{i}",method=RequestMethod.DELETE)
	public Set<String> deleteExample(@PathVariable(name="i") String i) {
		set.remove(i);
		return set;
	}

}
