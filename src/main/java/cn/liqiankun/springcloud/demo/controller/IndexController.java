/**
 * 
 */
package cn.liqiankun.springcloud.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author liqiankun
 *
 */
@Controller
public class IndexController {

	@RequestMapping("index")
	public String index(){
		
		return "index";
	}
	
	@RequestMapping("test")
	public String test(){
		
		return "test";
	}
	
}
