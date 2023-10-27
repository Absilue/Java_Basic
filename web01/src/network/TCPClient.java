package network;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPClient {

	public static void main(String[] args) throws Exception {
		// 서버 ip 와 port를 연결
		Socket socket = new Socket("localhost", 9200);
		System.out.println("클라이언트가 서버로 요청을 보냄");
	}
}
