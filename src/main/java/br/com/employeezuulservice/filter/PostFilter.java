package br.com.employeezuulservice.filter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.netflix.zuul.ZuulFilter;

public class PostFilter extends ZuulFilter {

	private static final Logger log = LoggerFactory.getLogger(PostFilter.class);
	
	@Override
	public String filterType() {
		log.info("PostFilter filterType return route");
		return "post";
	}

	@Override
	public int filterOrder() {
		log.info("PostFilter filterOrder return 0");
		return 0;
	}

	@Override
	public boolean shouldFilter() {
		log.info("PostFilter shouldFilter return true");
		return true;
	}

	@Override
	public Object run() {
		log.info("PostFilter Using Route Filter return null");

		return null;
	}

}
