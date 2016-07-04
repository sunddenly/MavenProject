package com.hebut.student.dao;

import com.hebut.basic.peresist.BaseDao;
import com.hebut.student.model.RewardPunish;
import org.springframework.stereotype.Repository;

import java.util.List;




@Repository("rewardPunishDao")
public class RewardPunishDao extends BaseDao<RewardPunish> implements
		IRewardPunishDao {

	public List<RewardPunish> listPunishByStu(int stuId) {
		String hql = "select rp from RewardPunish rp where rp.student.id=? and isReward=0";
		return this.list(hql, stuId);
	}

	public List<RewardPunish> listRewardByStu(int stuId) {
		String hql = "select rp from RewardPunish rp where rp.student.id=? and isReward=1";
		return this.list(hql, stuId);
	}

	public List<RewardPunish> listRewardPunishByStu(int stuId) {
		String hql = "select rp from RewardPunish rp where rp.student.id=?";
		return this.list(hql, stuId);
	}


}
