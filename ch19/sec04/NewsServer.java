package ch19.sec04;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.util.Scanner;

public class NewsServer {
	private static DatagramSocket datagramSocket = null;
	
	public static void main(String[] args) throws Exception {
		
			System.out.println("-------------------------------------------");
			System.out.println("서버를 종료하려면 q를 입력하고 Enter 키를 입력하세요");
			System.out.println("-------------------------------------------");
			
			//UDP 서버 시작
			StartServer();
			
			//키보드 입력
			Scanner scanner = new Scanner(System.in);
			while(true) {
				String key = scanner.nextLine();
				if(key.toLowerCase().equals("q")) {
					break;
			}
		}
		scanner.close();
		
		//TCP 서버 종료
		stopServer();
	}
	
	public static void startServer() {
		//작업 스레드 정의
		Thread thread = new Thread() {
		@Override	
		public void run() {
			try {
				//DatagramSocket 생성 및 Port 바인딩
				datagramSocket = new DatagramSocket(50001);
				System.out.println("[서버] 시작됨");
				
				while(true) {
					//클라이언트가 구독하고 싶은 뉴스 주제 얻기
					DatagramPacket receivePacket = new DatagramSocket(50001);
					System.out.println("[서버] 시작됨");
					
					while(true) {
						//클라이언트가 구독하고 싶은 뉴스 주제 얻기
						DatagramPacket receivePacket = new DatagramPacket
						(new byte[1024], 1024);
					}
				}
			}
			
			
			
		}
		

		}
	
	}
}
