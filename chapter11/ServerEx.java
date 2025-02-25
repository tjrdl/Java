package Java.chapter11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerEx {

	public static void main(String[] args) {
		// 서버 소켓 선언
		ServerSocket listener = null;

		// 클라이언트 소켓 선언
		Socket socket = null;

		// 입력: 클라이언트에서 들어오는 데이터
		BufferedReader in = null;

		// 출력: 서버에서 보내는 데이터
		BufferedWriter out = null;

		Scanner sc = new Scanner(System.in);

		try {
			listener = new ServerSocket(36223);
			System.out.println("연결을 기다리고 있습니다.....");
			socket = listener.accept(); // 연결 대기
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

			while (true) {
				String inputMessage = in.readLine();
				System.out.println("클라이언트: " + inputMessage); // 클라이언트에서 온 메세지
				if (inputMessage.equals("bye")) {
					System.out.println("클라이언트에서 bye로 연결을 종료함");
					break;
				}
				System.out.println("보내기>>");
				String outputMessage = sc.nextLine();
				out.write(outputMessage + "\n"); // 클라이언트로 메시지 보내기
				out.flush(); // 비정상적인 종료일때 메시지 재전송
			}

		} catch (Exception e) {
			e.printStackTrace(); // 예외처리시 시스템에서 자동으로 출력되는 메시지
		} finally {
			// 자원 반납
		}
		try {
			sc.close();
			socket.close();
			listener.close();

		} catch (Exception e2) {
			System.out.println("클라이언트와 채팅 중 오류 발생1");
		}

	}

}
