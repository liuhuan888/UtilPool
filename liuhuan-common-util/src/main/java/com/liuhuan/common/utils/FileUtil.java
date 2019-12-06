package com.liuhuan.common.utils;

import java.io.File;

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
	
	//删除文件，如果是目录，则下面的文件和所有子目录中的文件都要删除
	public static void deleteFile(File file) {
		//判断传入的是否为文件夹
		if(file.isDirectory()){
			File[] files = file.listFiles();
			for (File listFile : files) {
				//递归删除文件
				deleteFile(listFile);
			}
			file.delete();
		}else {
			file.delete();
		}
	}
	
	//重载删除文件方法
	public static void deleteFile(String fileFullName) {
		File file = new File(fileFullName);
		deleteFile(file);
	}
	
	//返回文件以指定单位大小表示
	public static String getFileSize(File file) {
		long length = file.length();
		double kb = length/1024.0;
		if(kb/1024/1024>1){
			return String.format("%.2f", kb/1024/1024)+"GB";
		}else if(kb/1024>1){
			return String.format("%.2f", kb/1024)+"MB";
		}else {
			return String.format("%.2f", kb)+"KB";
		}
	}
	
	//重载查询文件大小
	public static String getFileSize(String fileFullName) {
		File file = new File(fileFullName);
		return getFileSize(file);
	}
	
	public static void main(String[] args) {
		System.out.println(getFileSize(new File("E:\\CMS\\笔记\\day7\\day7-完善日期工具类.mp4")));
	}
}
