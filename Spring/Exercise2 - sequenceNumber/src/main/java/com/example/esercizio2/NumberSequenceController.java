package com.example.esercizio2;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NumberSequenceController {
	
	@GetMapping("/sequence/{n}")
	public ArrayList<Integer> getNumberSequence(@PathVariable int n) {
		ArrayList<Integer> sequence = new ArrayList<>();
		
		for(int i = 0; i <= n; i++)
			sequence.add(i);
		
		return sequence;
	}
}
