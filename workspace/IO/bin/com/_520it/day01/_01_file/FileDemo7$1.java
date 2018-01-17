// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   FileDemo7.java

package com._520it.day01._01_file;

import java.io.File;
import java.io.FilenameFilter;

// Referenced classes of package com._520it.day01._01_file:
//			FileDemo7

class FileDemo7$1
	implements FilenameFilter
{

	public boolean accept(File dir, String name)
	{
		return name.endsWith(".avi") && (new File(dir, name)).isFile();
	}

	FileDemo7$1()
	{
	}
}
