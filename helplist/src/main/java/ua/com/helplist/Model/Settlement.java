package ua.com.helplist.Model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import ua.com.helplist.Utils.Constants;

@Entity(name = "setllement")
@Table(name = "settlements")
public class Settlement extends BaseObject {
	@Enumerated(EnumType.STRING)
	private Constants.SettlementType type;
	@ManyToOne
	@JoinColumn(name = "region_id")
	private Region region;
	//@OneToMany(mappedBy = "settlement_id", fetch = FetchType.LAZY)
	//private List<Person> persons;
}
