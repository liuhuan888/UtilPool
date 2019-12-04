package com.lh.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.support.DaoSupport;
import org.springframework.stereotype.Service;

import com.lh.dao.SortDao;
import com.lh.pojo.Sort;
import com.lh.service.SortService;
@Service
public class SortServiceImpl implements SortService {

	@Autowired
	private SortDao sortDao;

	@Override
	public List<Sort> list() {
		return sortDao.list();
	}
	
	
}
