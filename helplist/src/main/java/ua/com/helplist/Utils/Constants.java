package ua.com.helplist.Utils;

public abstract class Constants {
	public enum Role {
		ADMIN,
		SUPERADMIN
	}
	
	public enum SettlementType {
		VILLAGE,
		TOWN,
		CITY
	}
	
	public enum PersistenceUnit {
		HOME("home"),
		WORK("work"),
		TEST("test");
		
		private final String persistenceUnit;
		
		private PersistenceUnit(final String persistenceUnit){
			this.persistenceUnit = persistenceUnit;
		}
		
		@Override
	    public final String toString() {
	        return persistenceUnit;
	    }
	}
}