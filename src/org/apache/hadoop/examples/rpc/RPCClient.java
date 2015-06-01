package org.apache.hadoop.examples.rpc;

import java.io.IOException;
import java.net.InetSocketAddress;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.ipc.RPC;
import org.apache.log4j.Logger;

public class RPCClient {

	private static transient Logger logger = Logger.getLogger(RPCClient.class);

	public static void main(String[] args) throws IOException {
		Barty proxy = RPC.getProxy(Barty.class, 10010, new InetSocketAddress(
				"123.57.39.109", 9527), new Configuration());
		String sayHi = proxy.sayHi("tomcat");
		logger.info(sayHi);
		System.out.println(sayHi);

	}

}
