// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   ReflectDemo.java

package cn.bdqn.test;

import cn.bdqn.bean.Student;
import java.io.PrintStream;

public class ReflectDemo
{
	class A
	{

		final ReflectDemo this$0;

		A()
		{
			this$0 = ReflectDemo.this;
			super();
		}
	}

	class B
	{

		final ReflectDemo this$0;

		B()
		{
			this$0 = ReflectDemo.this;
			super();
		}
	}


	public ReflectDemo()
	{
	}

	public void test01()
	{
		try
		{
			System.out.println((new StringBuilder("��һ�ַ�ʽ ��Class.forName()===>")).append(Class.forName("cn.bdqn.bean.Student").getName()).toString());
			System.out.println((new StringBuilder("�ڶ��ַ�ʽ ������.Class===>")).append(cn/bdqn/bean/Student.getName()).toString());
			System.out.println((new StringBuilder("�����ַ�ʽ ��������.getClass()===>")).append((new Student()).getClass().getName()).toString());
		}
		catch (ClassNotFoundException e)
		{
			e.printStackTrace();
		}
	}
}
