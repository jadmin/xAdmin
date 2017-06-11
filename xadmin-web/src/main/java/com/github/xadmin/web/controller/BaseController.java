/*
 * @(#)BaseController.java	2017年5月19日
 *
 * Copyright (c) 2017. All Rights Reserved.
 *
 */

package com.github.xadmin.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.shandiangou.commons.Constants;
import com.shandiangou.commons.algorithm.crypt.Encryptor;
import com.shandiangou.commons.core.BizObjects;

/**
 * BaseController
 *
 * @author <a href="mailto:gerald.chen.hz@gmail.com">Gerald Chen</a>
 * @version $Id: BaseController.java 2017年5月19日 11:47:05 Exp $
 */
@Controller
@RequestMapping("/tools")
public class BaseController {
	
	/**
	 * 经过一层简单的授权密码校验
	 */
	protected boolean matchedOpsKey(String opsKey) {
		String encryptText = Encryptor.encrypt(Constants.DEF_ORGINAL_TEXT, opsKey);
		return BizObjects.contains(Constants.DEF_ENCRYPT_TEXT, encryptText);
	}
	
	
}
