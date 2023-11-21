package com.example.demo;

import org.junit.jupiter.api.BeforeEach;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.mapper.ClientMapper;
import com.example.demo.service.ConseillerService;

@SpringBootTest
public class clientMapper {
		
		@Mock
		private ConseillerService conseillerService;
		
		
		public ClientMapper clientMapper;
		
		@BeforeEach
		public void setUp() {
			MockitoAnnotations.openMocks(this);
			
			
		}
		 
		
		 
	 }


