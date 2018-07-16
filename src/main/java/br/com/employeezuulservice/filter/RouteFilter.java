package br.com.employeezuulservice.filter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.netflix.zuul.ZuulFilter;

public class RouteFilter extends ZuulFilter {
	private static final Logger log = LoggerFactory.getLogger(RouteFilter.class);
	
	@Override
	public String filterType() {
		log.info("RouteFilter filterType return route");
		return "route";
	}

	@Override
	public int filterOrder() {
		log.info("RouteFilter filterOrder return 0");
		return 0;
	}

	@Override
	public boolean shouldFilter() {
		log.info("RouteFilter shouldFilter return true");
		return true;
	}

	@Override
	public Object run() {
		log.info("RouteFilter Using Route Filter return null");

		return null;
	}

}