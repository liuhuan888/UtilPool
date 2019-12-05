package com.liuhuan.common.utils;

//字符串工具类
public class StringUtil {

	//判断源字符串是否有值，空引号和空格也算没值，有值返回true，没值返回false
	public static boolean isNotBlank(String str){
		if(str==null){
			return false;
		}
		String trimStr = str.trim();
		if(trimStr.length()==0){
			return false;
		}
		return true;
	}
	
	//判断是否为手机号码
	public static boolean isPhoneNum(String str){
		if(!isNotBlank(str)){
			return false;
		}
		String matches = "1[3578]\\d{9}";
		return str.matches(matches);
	}
	
	//判断是否为电子邮箱
	public static boolean isEmail(String str){
		if(!isNotBlank(str)){
			return false;
		}
		String matches = "\\w+@\\w+.com";
		return str.matches(matches);
	}
	
	//判断是否全部为字母
	public static boolean isLetter(String str){
		if(!isNotBlank(str)){
			return false;
		}
		String matches = "[A-z]+";
		return str.matches(matches);
	}
	
	//
	
	public static void main(String[] args) {
		System.out.println(isLetter(null));
	}
}
