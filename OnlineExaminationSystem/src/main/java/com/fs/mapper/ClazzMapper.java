package com.fs.mapper;

import java.util.List;

import com.fs.po.Clazz;

public interface ClazzMapper {
	/***/
	/**通过一个班级对象修改此对象*/
	int updateByClazz(Clazz clazz);
	/**通过一个班级添加班级*/
	int insertByClazz(Clazz clazz);
	/**查询所有班级*/
	List<Clazz> selectAll();
	/**模糊查询所有班级*/
	List<Clazz> fuzzyQueryByClazz(Clazz clazz);
	/**通过班级id删除班级*/
	int deleteClazzById(int id);
}
