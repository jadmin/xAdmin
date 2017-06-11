package com.github.xadmin.web.controller.status;

import java.util.Objects;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.shandiangou.commons.web.HttpResult;


/**
 * ServerStartCheckController Web应用启动自检
 *
 * @author <a href="mailto:gerald.chen.hz@gmail.com">Gerald Chen</a>
 * @version $Id: ServerStartCheckController.java 2017年5月17日 11:27:50 Exp $
 */
@Controller
public class ServerStartCheckController {
	
	static final Logger LOG = LoggerFactory.getLogger(ServerStartCheckController.class);
	
	@Value("#{APP_PROP['config.env']}")
    private String dev;
	
    @RequestMapping(value = {"/index", "check", "webStatus"})
    @ResponseBody
    public HttpResult check() {
    	if(!Objects.equals("online", dev)) { // 避免线上频繁打日志
    		LOG.warn("============ xAdmin server started successfully ============");
    	}
        return HttpResult.success();
    }
    
}
