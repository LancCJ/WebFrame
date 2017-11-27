package com.lanccj.frame;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

/**
 * \* @created with IntelliJ IDEA.
 * \* @author: chenjian
 * \* @date: 2017/11/27
 * \* @time: 下午2:53
 * \* @to change this template use File | Settings | File Templates.
 * \* @description:
 */

@SpringBootApplication
public class WebApplication {

	public static void main(String[] args) {
		SpringApplicationBuilder builder = new SpringApplicationBuilder(WebApplication.class);
		//修改Banner的模式为OFF
		//builder.bannerMode(Banner.Mode.OFF).run(args);
		builder.bannerMode(Banner.Mode.CONSOLE).run(args);

		//SpringApplication.run(WebApplication.class, args);
	}
}
