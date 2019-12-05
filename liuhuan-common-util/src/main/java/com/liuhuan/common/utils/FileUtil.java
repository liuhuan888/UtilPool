package com.liuhuan.common.utils;

import java.io.File;

import org.omg.PortableInterceptor.USER_EXCEPTION;

public class FileUtil {

	//获取文件扩展名
	public static String getExpandedName(String fileName){
		if(fileName!=null && fileName.length()>0){
			return fileName.substring(fileName.lastIndexOf("."));
		}
		return "不是有效文件";
	}
	
	//获取操作系统用户目录
	public static File getUserDirectory(){
		String property = System.getProperty("user.home");
		return new File(property);
	}
	
	public static void main(String[] args) {
		System.out.println(getUserDirectory());
	}
}
