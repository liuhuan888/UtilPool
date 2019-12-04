package com.lh.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.lh.service.SortService;

@Controller
public class SortController {

	@Autowired
	private SortService sortService;
}
