package com.inn.cafe.serviceImpl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.inn.cafe.dao.BillDao;
import com.inn.cafe.dao.CategoryDao;
import com.inn.cafe.dao.ProductDao;
import com.inn.cafe.service.DashBoardService;

@Service
public class DashBoardServiceImpl implements DashBoardService 
{
	@Autowired
	CategoryDao categoryDao;
	
	@Autowired
	ProductDao productDao;
	
	@Autowired
	BillDao billDao;

	@Override
	public ResponseEntity<Map<String, Object>> getCount() {
		Map<String,Object> map=new HashMap<>();
		map.put("category",categoryDao.count());
		map.put("category",productDao.count());
		map.put("category",billDao.count());
		return new ResponseEntity<>(map,HttpStatus.OK);
	}
	
}
