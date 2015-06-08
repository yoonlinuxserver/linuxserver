package com.vertxstudy.main;

import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;
import io.vertx.core.Vertx;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vertx vertx = Vertx.vertx();
		
//		vertx.deployVerticle("com.vertxstudy.main.MyVerticle");
//		vertx.deployVerticle(new BasicVerticle());
//		vertx.deployVerticle(new BasicVerticle(), new Handler<AsyncResult<String>>() {
//			@Override
//			public void handle(AsyncResult<String> stringAsyncResult) {
//				// TODO Auto-generated method stub
//				System.out.println("BasicVerticle deployment complete");
//			}
//		});
		
		vertx.deployVerticle(new EventBusReceiverVerticle("YOON"));
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		vertx.deployVerticle(new EventBusSenderVerticle());
		
		
	}

}
