package com.fs.service;

import java.util.List;

import com.fs.vo.Clazz;


public interface IClazzService {
	List<Clazz> selectAll();
	List<Clazz> fuzzyQueryByKey(String key);
	int addClazzByNameAndMajor(String name, String major);
	int deleteClazzById(int id);
	int updateClazzByKeys(int clazzId,String clazzCol,String newText);
}
