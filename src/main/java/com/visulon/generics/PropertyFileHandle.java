package com.visulon.generics;

import java.io.FileInputStream;
import java.util.Properties;

import com.visulon.generics.AutoConstant;

public class PropertyFileHandle
{
	public static String getPropertyvalue(String key)
	{
		Properties p=new Properties();
		try 
		{
			p.load(new FileInputStream(AutoConstant.propertypath));
		} 
		catch (Exception e) 
		{
			
		}
		return p.getProperty(key);
	}


}
