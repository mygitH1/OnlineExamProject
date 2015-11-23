package com.pvr.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Random;

import com.pvr.bean.ExamBean;
import com.pvr.db.ConnectionManager;

public class ExamDAO {

	public static ExamBean SelectExam(ExamBean bean) throws ClassNotFoundException, SQLException {
		bean.getExam();
		String name=bean.getUserName();
		String password=bean.getPassword();
		Connection ncon=null;
		ResultSet rs=null;
		//System.out.println("==============>"+name+"==##=="+password+"<=============");
		ncon=ConnectionManager.getConnection();
		Statement st=ncon.createStatement();
		String sql="select * from euser where username='"+name+"' and password='"+password+"'";
		//System.out.println("==============>"+sql+"<=============");
		rs=st.executeQuery(sql);
		boolean flag=rs.next();
		//System.out.println("==============>"+flag+"<=============");
		if(flag)
		{
			bean.setCorrect(true);
			Random rd=new Random();
			int randomInt = rd.nextInt(4);
			System.out.println("==============>"+randomInt+"<=============");
			bean.setPaperID(randomInt);
		}
		else
		{
			bean.setCorrect(false);
		}
		
		return bean;
	}
	public static ExamBean insert(ExamBean bean) throws ClassNotFoundException, SQLException {
		bean.getExam();
		String name=bean.getUserName();
		String password=bean.getPassword();
		Connection ncon=null;
		ResultSet rs=null;
		//System.out.println("==============>"+name+"==##=="+password+"<=============");
		ncon=ConnectionManager.getConnection();
		Statement st=ncon.createStatement();
		
		String sql="insert into euser values('"+name+"','"+password+"',00)";
		//System.out.println("==============>"+sql+"<=============");
		int f=st.executeUpdate(sql);
				//System.out.println("==============>"+flag+"<=============");
		if(f!=0)
		{
			bean.setCorrect(true);
					}
		else
		{
			bean.setCorrect(false);
		}
		
		return bean;
	
	}
	public static ExamBean findResult(ExamBean bean) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		int paperID=bean.getPaperID();
		String result1=bean.getResult();
		int count=0;
	
		Connection ncon=null;
		ResultSet rs=null;
		//System.out.println("==============>"+name+"==##=="+password+"<=============");
		ncon=ConnectionManager.getConnection();
		Statement st=ncon.createStatement();
		String sql="select * from resulttable where paperid="+paperID;
		//System.out.println("==============>"+sql+"<=============");
		rs=st.executeQuery(sql);
		boolean flag=rs.next();
		//System.out.println("==============>"+flag+"<=============");
		if(flag)
		{
			bean.setCorrect(true);
			String result2=rs.getString(2);
			for(int i=0;i<5;i++)
			{
				if(result1.charAt(i)==result2.charAt(i))
				{
					count++;
				}
			}
			bean.setMarks(count);
		}
		else
		{
			bean.setCorrect(false);
		}
	
		return bean;
	}
}
