package com.vertxstudy.main;

import io.vertx.core.AbstractVerticle;

public class EventBusSenderVerticle extends AbstractVerticle {

	@Override
	public void start() throws Exception {
		// TODO Auto-generated method stub
		
		vertx.eventBus().publish("anAddress", "message2");
		vertx.eventBus().send("anAddress","message 1");
	}
	
	
}
