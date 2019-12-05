package com.liuhuan.common.utils;

import java.util.Calendar;
import java.util.Date;

//日期工具类
public class DateUtil {

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
	
	public static void main(String[] args) {
		System.out.println();
	}
}
