package br.com.employeezuulservice.filter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.netflix.zuul.ZuulFilter;

public class ErrorFilter extends ZuulFilter {
	
	private static final Logger log = LoggerFactory.getLogger(ErrorFilter.class);

	@Override
	public String filterType() {
		log.info("ErrorFilter filterType return route");
		return "error";
	}

	@Override
	public int filterOrder() {
		log.info("ErrorFilter filterOrder return 0");
		return 0;
	}

	@Override
	public boolean shouldFilter() {
		log.info("ErrorFilter shouldFilter return true");
		return true;
	}

	@Override
	public Object run() {
		log.info("ErrorFilter Using Route Filter return null");
		return null;
	}

}