package com.liuhuan.common.utils;

import java.util.Random;

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
		String matches = "\\w+@\\w+.(com|cn|com.cn|net)";
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
	
	//获取随机英文字母
	public static char getRandomChar() {
		//随机类
		Random random = new Random();
		//获得英文字母对应的哈希码
		int hashChar = 'a'+random.nextInt(26);	
		return (char)hashChar;
	}
	
	//获取n位随机英文字符串
	public static String getRandomString(int n) {
		StringBuffer stringBuffer = new StringBuffer();
		for(int i = 0; i<n;i++){
			stringBuffer.append(getRandomChar());
		}
		return stringBuffer.toString();
	}
	
	public static boolean judgeTelephoneIsOk(String src){
		if(!isNotBlank(src)){
			return false;
		}
		String matches = "1\\d{10}";
		return src.matches(matches);
	}
	
	public static boolean isNumber(String str) {
		if(!isNotBlank(str)){
			return false;
		}
		String matches = "[0-9]+";
		return str.matches(matches);
	}
	
	public static void main(String[] args) {
		System.out.println(getRandomString(26));
	}
}
