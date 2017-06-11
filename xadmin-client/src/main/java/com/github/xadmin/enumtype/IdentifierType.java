/*
 * @(#)IdentifierType.java	2017年5月16日
 *
 * Copyright (c) 2017. All Rights Reserved.
 *
 */

package com.github.xadmin.enumtype;

/**
 * IdentifierType
 *
 * @author <a href="mailto:gerald.chen.hz@gmail.com">Gerald Chen</a>
 * @version $Id: IdentifierType.java 2017年5月16日 9:02:16 Exp $
 */
public enum IdentifierType {
	
	MOBILE(1, "手机号"), 
	EMAIL(2, "邮箱"),
	
	
	;
	

	/**
	 * 枚举值 
	 */
	private int value;
	
	/**
	 * 描述信息 
	 */
	private String desc;
	
	private IdentifierType(int value, String desc) {
		this.value = value;
		this.desc = desc;
	}
	
	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}
}
