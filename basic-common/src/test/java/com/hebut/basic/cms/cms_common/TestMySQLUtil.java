package com.hebut.basic.cms.cms_common;


import com.hebut.basic.util.MySQLUtil;
import org.junit.Test;

public class TestMySQLUtil {

	@Test
	public void testSave() {
		MySQLUtil msu = MySQLUtil.getInstance();
		msu.setCfg("jxy","123456","mybatis","得到","d:/webservice");
		msu.backup(true);

	}
	
	@Test
	public void testList() {
		MySQLUtil msu = MySQLUtil.getInstance();

		msu.setCfg("jxy","123456","mybatis","得到","d:/webservice");
		String[] strs = msu.listAllBackupFile();
		for(String str:strs) {
			System.out.println(str);
		}
	}
	
	@Test
	public void testLoad() {
		MySQLUtil msu = MySQLUtil.getInstance();
		msu.setCfg("jxy","123456","mybatis","得到_2016_07_04.sql","d:/webservice");
//		msu.load();
	}
}
