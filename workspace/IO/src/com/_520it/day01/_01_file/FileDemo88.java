package com._520it.day01._01_file;

import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.List;
//失败--->忘记之前的需求---想要做什么了...

public class FileDemo88 {
	public static void main(String[] args) {
		File dir = new File("D:/FeiqWenJian/wolfcode(FCAA14FE4115)/小码课堂-改/day01/视频");
		test(dir);
	}

	private static void test(File dir) {
		File[] fs = dir.listFiles(new FilenameFilter() {
			public boolean accept(File dir, String name) {
				return name.endsWith(".avi") && new File(dir, name).isFile();
			}
		});
		for (File file : fs) {
			System.out.println(file.getName());
		}
	}
}
