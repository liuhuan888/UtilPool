package com.liuhuan.common.utils;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class StreamUtil {

	// 关闭流
	public static void closeAll(AutoCloseable... autoCloseables) {
		for (AutoCloseable autoCloseable : autoCloseables) {
			if (autoCloseable != null) {
				try {
					autoCloseable.close();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

	// 读取文本文件
	public static String readTextFile(File file) {
		String str = "";
		InputStream inputStream = null;
		try {
			inputStream = new FileInputStream(file);
			byte[] b = new byte[1024];
			while (inputStream.read(b) > 0) {
				str += new String(b);
			}
			return str;
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		} finally {
			closeAll(inputStream);
		}
	}

	// 重载读取文本文件
	public static String readTextFile(String fileFullName) {
		File file = new File(fileFullName);
		return readTextFile(file);
	}

	// 按行读取文本文件
	public static List<String> readTextFileList(File file) {
		List<String> list = new ArrayList<String>();
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(file));
			while (br.read() != -1) {
				list.add(br.readLine());
			}
			return list;
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		} finally {
			closeAll(br);
		}

	}

	// 重载按行读取文本文件
	public static List<String> readTextFileList(String fileFullName) {
		File file = new File(fileFullName);
		return readTextFileList(file);
	}

	// 写入文本文件
	public static void writerFile(String content, File file, boolean append) {
		BufferedWriter bufferedWriter = null;
		try {
			bufferedWriter = new BufferedWriter(new FileWriter(file,append));
			bufferedWriter.write(content);
			bufferedWriter.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			closeAll(bufferedWriter);
		}
	}
	
	// 重载写入文本文件
	public static void writerFile(String content, String fileFullName, boolean append) {
		File file = new File(fileFullName);
		writerFile(content, file, append);
	}

	public static void main(String[] args) {
		writerFile("123456789zxcvvbnbn",new File("C:\\Users\\83795\\Desktop\\aa.txt"),true);
	}
}
