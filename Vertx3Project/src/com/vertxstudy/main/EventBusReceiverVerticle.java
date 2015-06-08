package com.vertxstudy.main;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.Future;

public class EventBusReceiverVerticle extends AbstractVerticle {

	private String name = null;
	 public EventBusReceiverVerticle(String name) {
		// TODO Auto-generated constructor stub
		 this.name = name;
	}
	@Override
	public void start(Future<Void> startFuture) throws Exception {
		// TODO Auto-generated method stub
		vertx.eventBus().consumer("anAddress", message ->{
			System.out.println(this.name + "received message = " + message.body());
		});
	}

	@Override
	public void stop(Future<Void> stopFuture) throws Exception {
		// TODO Auto-generated method stub
		super.stop(stopFuture);
	}

}
