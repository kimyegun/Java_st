package ch20.oracle.sec12;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class BoardExample3 {
	
private Scanner scanner = new Scanner(System.in);
private Connection conn;

public BoardExample3() {
	try {
		//JDBC Driver 등록
		Class.forName("oracle.jdbc.OracleDriver");
		
		//연결하기
		conn = DriverManager.getConnection(
		"jdbc:oracle:thin:@localhost:1521/xe",
		"java",
		"oracle"
		);	
	} catch(Exception e) {
		e.printStackTrace();
		exit();
	}
}
	public void list() {
		System.out.println();
		System.out.println("[게시물 목록]");
		System.out.println("--------------------------------");
		System.out.printf("%-6s%-12s%-16s%-40s\n","writer","date","title");
		System.out.println("--------------------------------------------");

		try {
	      String sql = ""+
			"SELECT bno, btitle, bcontent, bwriter, bdate" +
			"FROM boards" +
			"ORDER BY bno DESC";
	      PreparedStatement pstmt = conn.prepareStatement(sql);
	      ResultSet rs = pstmt.executeQuery();
	      while(rs.next()) {
	    	  Board board = new Board();
	    	  board.setBno(rs.getInt("bno"));
	    	  board.setBtitle(rs.getString("btitle"));
	    	  board.setBcontent(rs.getString("bcontent"));
	    	  board.setBwriter(rs.getString("bwriter"));
	    	  board.setBdate(rs.getDate("bdate"));
	    	  System.out.printf("%-6s%-12s%-16s%-40s\n",
	    		board.getBno(),
	    		board.getBwriter(),
	    		board.getBdate(),
	    		board.getBtitle());
	      }
	      rs.close();
	      pstmt.close();
		} catch(SQLException e) {
			e.printStackTrace();
			exit();
	      }
		}
		
		
	public void mainMenu() {
		System.out.println();
		System.out.println("--------------------------");
		System.out.println("메인메뉴: 1.Create | 2.Read | 3.Clear | 4.Exit");
		System.out.print("메뉴 선택:");
		String menuNo = scanner.nextLine();
		System.out.println();
		
		switch(menuNo) {
		case "1" -> create();
		case "2" -> read();
		case "3" -> clear();
		case "4" -> exit();
	}
	}

		public void create() {
			System.out.println("*** create() 메소드 실행됨");
			list();
		}
		
		public void read() {
			System.out.println("*** read() 메소드 실행됨");
			list();
		}
		
		public void clear() {
			System.out.println("*** clear() 메소드 실행됨");
			list();
		}
		
		public void exit() {
			System.exit(0);
		}

	public static void main(String[] args) {
		BoardExample2 boardExample = new BoardExample2();
		boardExample.list();
		
	}
}

}
