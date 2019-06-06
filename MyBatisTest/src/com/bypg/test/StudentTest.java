package com.bypg.test;

import org.apache.ibatis.session.SqlSession;

import com.bypg.dao.StudentInfoDao;
import com.bypg.model.StudentInfo;
import com.bypg.util.SqlSessionFactoryUtil;

public class StudentTest {
	
	public static void main(String[] args) {
	//1. 连接数据库单例模式并打开	
		SqlSession sqlSession = SqlSessionFactoryUtil.openSession();
		
	//2. 接口反射获取接口实例
		StudentInfoDao studentInfoDao = sqlSession.getMapper(StudentInfoDao.class);
		
	//3. New出实体类实例化传参
		StudentInfo studentInfo = new StudentInfo("你妹",12);
		
	//4. 调用Dao层方法,执行SQL
		int rows=studentInfoDao.addStudentInfo(studentInfo);
		//提交事务
		sqlSession.commit();
		
		if(rows>0) {
			System.out.println("添加成功");
		}
	}
}
