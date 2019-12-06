package com.liuhuan.common.utils;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class StreamUtil {

	//关闭流
	public static void closeAll(AutoCloseable ...autoCloseables){
		for (AutoCloseable autoCloseable : autoCloseables) {
			if(autoCloseable!=null){
				try {
					autoCloseable.close();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	
	//读取文本文件	
	public static String readTextFile(File file){
		String str = "";
		InputStream inputStream = null;
		try {
			inputStream = new FileInputStream(file);
			byte[] b = new byte[1024];
			while(inputStream.read(b)>0){
				str+=new String(b);
			}
			return str;
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}finally {
			closeAll(inputStream);
		}
	}
	
	public static void main(String[] args) {
		System.out.println(readTextFile(new File("E:/MyGit/hello.txt.txt")));
	}
}
