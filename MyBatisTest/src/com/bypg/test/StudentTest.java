package com.bypg.test;

import org.apache.ibatis.session.SqlSession;

import com.bypg.dao.StudentInfoDao;
import com.bypg.model.StudentInfo;
import com.bypg.util.SqlSessionFactoryUtil;

public class StudentTest {
	
	public static void main(String[] args) {
	//1. �������ݿⵥ��ģʽ����	
		SqlSession sqlSession = SqlSessionFactoryUtil.openSession();
		
	//2. �ӿڷ����ȡ�ӿ�ʵ��
		StudentInfoDao studentInfoDao = sqlSession.getMapper(StudentInfoDao.class);
		
	//3. New��ʵ����ʵ��������
		StudentInfo studentInfo = new StudentInfo("����",12);
		
	//4. ����Dao�㷽��,ִ��SQL
		int rows=studentInfoDao.addStudentInfo(studentInfo);
		//�ύ����
		sqlSession.commit();
		
		if(rows>0) {
			System.out.println("��ӳɹ�");
		}
	}
}
