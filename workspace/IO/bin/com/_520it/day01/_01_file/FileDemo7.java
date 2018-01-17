// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   FileDemo7.java

package com._520it.day01._01_file;

import java.io.*;

public class FileDemo7
{

	public FileDemo7()
	{
	}

	public static void main(String args[])
	{
		File dir = new File("D:/FeiqWenJian/wolfcode(FCAA14FE4115)/Ð¡Âë¿ÎÌÃ-¸Ä/day01/ÊÓÆµ");
		File fs[] = dir.listFiles(new FilenameFilter() {

			public boolean accept(File dir, String name)
			{
				return name.endsWith(".avi") && (new File(dir, name)).isFile();
			}

		});
		File afile[];
		int j = (afile = fs).length;
		for (int i = 0; i < j; i++)
		{
			File name = afile[i];
			System.out.println(name);
		}

		System.out.println(fs.length);
	}
}
