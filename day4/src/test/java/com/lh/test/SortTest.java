package com.lh.test;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.lh.pojo.Sort;
import com.lh.service.SortService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:spring-beans.xml")
public class SortTest {

	@Autowired
	private SortService sortService;
	
	@Test
	public void listTest(){
		List<Sort> list = sortService.list();
		System.out.println(list);
	}
}
