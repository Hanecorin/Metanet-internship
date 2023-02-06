package kosa.BoardService;



public class insertBoard {
	public static void main(String[] args) {
		
		MySQLDao mysql = new MySQLDao();
		OracleDao oracle = new OracleDao();
		
		Database db = new Database("오라클",oracle);
		
		db.DB();
		
			
			

	}


}
