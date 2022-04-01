package MySQL;

import java.sql.SQLException;

public class Walletdata {
	int walletId,bal,withdrow,deposit;
	String walletname,walletsirname,address;
	void ins(int walletId, int bal, int withdrow, int deposit, String walletname, String walletsirname,
			String address)throws SQLException{
		
		
		
	}
	
	
	public static void main(String[] args){


	}
	public Walletdata() {
	
	}

	public Walletdata(int walletId, int bal, int withdrow, int deposit, String walletname, String walletsirname,
			String address) {
		super();
		this.walletId = walletId;
		this.bal = bal;
		this.withdrow = withdrow;
		this.deposit = deposit;
		this.walletname = walletname;
		this.walletsirname = walletsirname;
		this.address = address;
	}

}
