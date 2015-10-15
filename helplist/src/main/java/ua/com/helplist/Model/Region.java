package ua.com.helplist.Model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity(name = "region")
@Table(name = "regions")
public class Region extends BaseObject {
	@Column(name = "name")
	private String name;
	@OneToMany(fetch = FetchType.EAGER, mappedBy = "region")
	private List<Settlement> settlements;
}
