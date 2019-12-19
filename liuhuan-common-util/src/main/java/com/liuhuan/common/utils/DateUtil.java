package com.liuhuan.common.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

//日期工具类
public class DateUtil {
	private static SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
	private static SimpleDateFormat dateTimeFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

	// 根据日期算年龄
	public static int getAge(Date birthDate) {
		// 获取日历控件
		Calendar calendar = Calendar.getInstance();
		// 获取当前年
		int nowYear = calendar.get(Calendar.YEAR);
		// 获取当前月
		int nowMonth = calendar.get(Calendar.MONTH);
		// 获取当前日
		int nowDay = calendar.get(Calendar.DAY_OF_MONTH);
		// 将日历时间设置为给定的生日
		calendar.setTime(birthDate);
		// 获取生日的年、月、日
		int birthYear = calendar.get(Calendar.YEAR);
		int birthMonth = calendar.get(Calendar.MONTH);
		int birthDay = calendar.get(Calendar.DAY_OF_MONTH);
		
		// 计算年龄
		int age = nowYear-birthYear;
		//如果当前月份小于生日的月份时，年龄-1
		if(nowMonth<birthMonth){
			age--;
		}
		//如果当前月份等于生日的月份，判断日期
		if(nowMonth==birthMonth && nowDay<birthDay){
			age--;
		}
		return age;
	}
	
	//重载计算年龄方法
	public static int getAge(String birthDate) {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
		Date date = null;
		try {
			date = simpleDateFormat.parse(birthDate);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return getAge(date);
	}
	
	//获取开始日期和结束日期之间有多少天
	public static int getDayNum(Date date1,Date date2) {
		//一天有多少毫秒
		Long dayTime = 1000*60*60*24L;
		Long startTime = date1.getTime();
		Long endTime = date2.getTime();
		Double dayNum = Math.abs(((endTime-startTime)/dayTime*1.0));
		return dayNum.intValue()+1;
	}
	
	//计算指定日期距离今天，过去了多少天或还有多少天
	public static int getDayNum(Date date) {
		Date date2 = new Date();
		return getDayNum(date,date2);
	}
	
	//验证指定日期是否为今天  
	public static boolean isToday(Date theDate) {
		Date nowDate = new Date();
		String nowDateStr = dateFormat.format(nowDate);
		String theDateStr = dateFormat.format(theDate);
		return nowDateStr.equals(theDateStr);
	}
	
	public static int compareTime(Date date1,Date date2) {
		long time1 = date1.getTime();
		long time2 = date2.getTime();
		if(time1==time2) {
			return 0;
		}
		if(time1>time2) {
			return 1;
		}
		return -1;
		
	}
	
	//判断指定日期是否在本周  
	public static boolean isInWeek(Date theDate) {
		Date nowDate = new Date();
		Calendar c = Calendar.getInstance();
		c.setTime(nowDate);
		//本周的第几天
		int dayofweek = c.get(Calendar.DAY_OF_WEEK);
		//设置本周第一天的时间
		c.add(Calendar.DAY_OF_YEAR, 1-dayofweek);
		c.set(Calendar.HOUR_OF_DAY, 0);
		c.set(Calendar.MINUTE, 0);
		c.set(Calendar.SECOND, 0);
		Date firstDate = c.getTime();
		System.out.println(dateTimeFormat.format(firstDate));
		//设置本周最后一天的时间
		c.add(Calendar.DAY_OF_YEAR, 6);
		c.set(Calendar.HOUR_OF_DAY, 23);
		c.set(Calendar.MINUTE, 59);
		c.set(Calendar.SECOND, 59);
		Date lastDate = c.getTime();
		System.out.println(dateTimeFormat.format(theDate));
		System.out.println(dateTimeFormat.format(lastDate));
		return compareTime(theDate,firstDate)>=0 && compareTime(theDate,lastDate)<=0;
	}
	
	//获取指定日期月份的第一天 
	public static Date getFirstDateInMonth(Date theDate) {
		Calendar c = Calendar.getInstance();
		c.setTime(theDate);
		c.set(Calendar.DAY_OF_MONTH, 1);
		c.set(Calendar.HOUR_OF_DAY, 0);
		c.set(Calendar.MINUTE, 0);
		c.set(Calendar.SECOND, 0);
		return c.getTime();
	}
	
	//获得指定日期的最后一天 
	public static Date getLastDateInMonth(Date theDate) {
		Calendar c = Calendar.getInstance();
		c.setTime(theDate);
		c.add(Calendar.MONTH, 1);
		Date firstDateInMonth = getFirstDateInMonth(c.getTime());
		c.setTime(firstDateInMonth);
		c.add(Calendar.SECOND, -1);
		return c.getTime();
	}

	public static String format(Date theDate) {
		return dateFormat.format(theDate);
	}
}
