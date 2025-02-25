package Java.chapter11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ClientEx {

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
			socket = new Socket("localhost", 36223); // 연결 대기
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

			while (true) {
				System.out.print("보내기>>");
				String outputMessage = sc.nextLine();
				if (outputMessage.equals("bye")) {
					out.write(outputMessage + "\n"); // 클라이언트로 메시지 보내기
					out.write("클라이언트 종료 \n"); // 클라이언트로 메시지 보내기
					out.flush(); // 비정상적인 종료일때 메시지 재전송
					break;
				}
				out.write(outputMessage + "\n"); // 클라이언트로 메시지 보내기
				out.flush(); // 비정상적인 종료일때 메시지 재전송
				String inputMessage = in.readLine();
				System.out.println("서버 : "+inputMessage);
			}

		} catch (Exception e) {
			e.printStackTrace(); // 예외처리시 시스템에서 자동으로 출력되는 메시지
		} finally {
			// 자원 반납
		}
		try {
			sc.close();
			socket.close();

		} catch (Exception e2) {
			System.out.println("클라이언트와 채팅 중 오류 발생2");
		}

	}

}