package br.com.employeezuulservice.filter;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;

public class PreFilter extends ZuulFilter {
	
	private static final Logger log = LoggerFactory.getLogger(PreFilter.class);
	
	@Override
	public String filterType() {
		log.info("PreFilter filterType return route");
		return "pre";
	}

	@Override
	public int filterOrder() {
		log.info("PreFilter filterOrder return 0");
		return 0;
	}

	@Override
	public boolean shouldFilter() {
		log.info("PreFilter shouldFilter return true");
		return true;
	}

	@Override
	public Object run() {
		RequestContext ctx = RequestContext.getCurrentContext();
		HttpServletRequest request = ctx.getRequest();
		log.info("PreFilter -> Request Method : " + request.getMethod() + " Request URL : " + request.getRequestURL().toString());

		return null;
	}

}