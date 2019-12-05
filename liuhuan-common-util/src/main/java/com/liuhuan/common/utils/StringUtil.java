package com.liuhuan.common.utils;

public class StringUtil {

	//判断源字符串是否有值，空引号和空格也算没值
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
	
	public static void main(String[] args) {
		
	}
}
