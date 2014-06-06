package com.nolinksoft.execotor;

import org.apache.thrift.server.TNonblockingServer;
import org.apache.thrift.server.TNonblockingServer.Args;
import org.apache.thrift.server.TServer;
import org.apache.thrift.transport.TNonblockingServerTransport;
import org.apache.thrift.transport.TServerSocket;
import org.apache.thrift.transport.TServerTransport;

public class CalculatorServer {

	public static void main(String[] args) {
		try {
			CalculatorHandler handler = new CalculatorHandler();
			Calculator.Processor  processor = new Calculator.Processor(handler);
			TServerSocket serverTransport = new TServerSocket(9090);
			TServer server = new TNonblockingServer(
					new Args(serverTransport).processor(processor));

			// Use this for a multithreaded server
			// TServer server = new TThreadPoolServer(new
			// TThreadPoolServer.Args(serverTransport).processor(processor));

			System.out.println("Starting the simple server...");
			server.serve();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
