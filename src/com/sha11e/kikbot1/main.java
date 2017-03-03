package com.sha11e.kikbot1;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class main {

	public static void main(String[] args) {
		int portNumber = 2412;

		ServerSocket serverSocket;
		try {
			serverSocket = new ServerSocket(portNumber);
			Socket clientSocket = serverSocket.accept();
		} catch (IOException e) {
			e.printStackTrace();
		} 
		
		System.out.println("boom");
	}
}