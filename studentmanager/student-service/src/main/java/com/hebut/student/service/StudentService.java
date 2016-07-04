package com.hebut.student.service;

import com.hebut.basic.model.Pager;
import com.hebut.student.dao.IRewardPunishDao;
import com.hebut.student.dao.IStudentDao;
import com.hebut.student.model.RewardPunish;
import com.hebut.student.model.Student;
import com.hebut.student.model.StudentException;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.util.List;



@Service("studentService")
public class StudentService implements IStudentService {
	private IStudentDao studentDao;
	private IRewardPunishDao rewardPunishDao;
	
	
	
	public IRewardPunishDao getRewardPunishDao() {
		return rewardPunishDao;
	}
	@Inject
	public void setRewardPunishDao(IRewardPunishDao rewardPunishDao) {
		this.rewardPunishDao = rewardPunishDao;
	}
	public IStudentDao getStudentDao() {
		return studentDao;
	}
	@Inject
	public void setStudentDao(IStudentDao studentDao) {
		this.studentDao = studentDao;
	}

	public void addStus(List<Student> stus) {
		studentDao.addStus(stus);
	}

	public Pager<Student> find() {
		return studentDao.find("from Student");
	}

	public void update(Student stu) {
		studentDao.update(stu);
	}

	public void delete(int id) {
		List<RewardPunish> rps = rewardPunishDao.listRewardPunishByStu(id);
		if(rps.size()>0) throw new StudentException("学生有相应的奖惩存在，不能删除");
		studentDao.delete(id);
	}

	public boolean checkStuExist(String xh) {
		return studentDao.checkStuExist(xh);
	}

	public List<Student> listRewardStu(Integer year, String semester) {
		return studentDao.listRewardStu(year, semester);
	}

	public List<Student> listPunishStu(Integer year, String semester) {
		return studentDao.listPunishStu(year, semester);
	}
	public Student load(int id) {
		return studentDao.load(id);
	}
	public Student getStudentByXh(String xh) {
		String hql = "select s from Student s where s.xh=?";
		return studentDao.loadByHql(hql, xh);
	}

}
