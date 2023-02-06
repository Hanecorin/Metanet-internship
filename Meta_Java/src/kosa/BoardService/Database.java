package kosa.BoardService;

public class Database {
	private String name;
	private Dao dao;
	
	public Database() {
		
	}

	public Database(String name, Dao dao) {
		super();
		this.name = name;
		this.dao = dao;
	}
	
	public void DB() {
		dao.insert();
	}
}
