package com.bypg.util;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

//建立数据库连接的单例模式
public class SqlSessionFactoryUtil {
	
	private static SqlSessionFactory sqlSessionFactory; //单例工厂
//获取单例工厂	
	public static SqlSessionFactory getSqlSessionFactory(){
		
		if(sqlSessionFactory==null){
			InputStream inputStream=null;
			try{
				inputStream=Resources.getResourceAsStream("mybatis-config.xml");
				sqlSessionFactory=new SqlSessionFactoryBuilder().build(inputStream);
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		return sqlSessionFactory;
	}
	
//打开此单例工厂方法
		public static SqlSession openSession(){
			return getSqlSessionFactory().openSession();
			}
		}

	

