package com.revature.filter;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;

public class LogFilter extends ZuulFilter{

	Logger log = Logger.getLogger(LogFilter.class);
	
	@Override
	public boolean shouldFilter() {
		return true;
	}

	@Override
	public Object run() throws ZuulException {
		System.out.println("Inside filter");
		RequestContext ctx = RequestContext.getCurrentContext();
		log.log(Level.TRACE, "Running new Request From: " + ctx.getRequest().getRemoteAddr());
		return null;
	}

	@Override
	public String filterType() {
		return "pre";
	}

	@Override
	public int filterOrder() {
		return 2;
	}

}
