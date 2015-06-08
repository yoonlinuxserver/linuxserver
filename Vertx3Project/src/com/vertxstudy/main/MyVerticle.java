package com.vertxstudy.main;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.Future;

public class MyVerticle extends AbstractVerticle {

	@Override
	public void start() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("MyVerticle started!");
	}

	@Override
	public void stop() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("MyVerticle stopped!");
	}

	@Override
	public void start(Future<Void> startFuture) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void stop(Future<Void> stopFuture) throws Exception {
		// TODO Auto-generated method stub
		
	}

	
}
