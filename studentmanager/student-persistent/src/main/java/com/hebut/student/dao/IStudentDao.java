package com.hebut.student.dao;

import com.hebut.basic.peresist.IBaseDao;
import com.hebut.student.model.Student;

import java.util.List;



public interface IStudentDao extends IBaseDao<Student> {
	/**
	 * 根据学学号检查学生用户是否存在
	 * @param xh
	 * @return
	 */
	public boolean checkStuExist(String xh);
	/**
	 * 添加一组学生数据
	 * @param stus
	 */
	public void addStus(List<Student> stus);
	/**
	 * 通过学期和学年获取所有的奖励的学生
	 * @param year 学年 :如果为空，表示不获取学年
	 * @param semester 学期 如果为空表示不获取学期
	 * @return
	 */
	public List<Student> listRewardStu(Integer year, String semester);


	/**
	 * 通过学期和学年获取所有的处罚的学生
	 * @param year 学年 :如果为空，表示不获取学年
	 * @param semester 学期 如果为空表示不获取学期
	 * @return
	 */
	public List<Student> listPunishStu(Integer year, String semester);
}
