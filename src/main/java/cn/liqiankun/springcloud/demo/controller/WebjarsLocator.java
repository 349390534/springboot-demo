/**
 * 
 */
package cn.liqiankun.springcloud.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.webjars.RequireJS;

/**
 * RequireJS的locator定义
 * @author liqiankun
 *
 */
@Controller
public class WebjarsLocator {

	@ResponseBody
	@RequestMapping(value = "/webjarsjs", produces = "application/javascript")
	public String webjarjs() {
	    return RequireJS.getSetupJavaScript("/webjars/");
	}
}
