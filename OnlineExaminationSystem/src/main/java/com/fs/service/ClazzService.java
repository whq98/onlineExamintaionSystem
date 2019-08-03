package com.fs.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fs.mapper.ClazzMapper;
import com.fs.vo.Clazz;

@Service
public class ClazzService implements IClazzService {
	@Autowired
	private ClazzMapper clazzMapper;

	@Override
	public List<Clazz> selectAll() {
		List<com.fs.po.Clazz> list1 = this.clazzMapper.selectAll();
		List<Clazz> list2 = new ArrayList();
		for (int i = 0; i < list1.size(); i++) {
			com.fs.po.Clazz clazz1 = list1.get(i);
			Clazz clazz = new Clazz(clazz1.getId(), clazz1.getName(), clazz1.getMajor(), clazz1.strDate());
			list2.add(clazz);
		}
		return list2;
	}

	@Override
	public int addClazzByNameAndMajor(String name, String major) {
		com.fs.po.Clazz clazz = new com.fs.po.Clazz();
		clazz.setName(name);
		clazz.setMajor(major);
		clazz.setBeginDate(new Date(System.currentTimeMillis()));
		return this.clazzMapper.insertByClazz(clazz);
	}

	@Override
	public int deleteClazzById(int id) {
		return this.clazzMapper.deleteClazzById(id);
	}

	@Override
	public List<Clazz> fuzzyQueryByKey(String key) {
		com.fs.po.Clazz clazz = new com.fs.po.Clazz();
		clazz.setName("%"+key+"%");
		clazz.setMajor("%"+key+"%");
		List<com.fs.po.Clazz> list1 = this.clazzMapper.fuzzyQueryByClazz(clazz);
		List<Clazz> list2 = new ArrayList();
		for (int i = 0; i < list1.size(); i++) {
			com.fs.po.Clazz clazz1 = list1.get(i);
			Clazz clazz2 = new Clazz(clazz1.getId(), clazz1.getName(), clazz1.getMajor(), clazz1.strDate());
			list2.add(clazz2);
		}
		return list2;
	}

	@Override
	public int updateClazzByKeys(int clazzId, String clazzCol, String newText) {
		com.fs.po.Clazz clazz = new com.fs.po.Clazz();
		clazz.setId(clazzId);
		//去除td前缀
		String clazzcol = clazzCol.substring(2);
		switch (clazzcol) {
		case "name":
			clazz.setName(newText);
			break;
		case "major":
			clazz.setMajor(newText);
			break;
		default:
			break;
		}
		return this.clazzMapper.updateByClazz(clazz);
	}

}
