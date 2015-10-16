package ua.com.helplist.Model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity(name = "team")
@Table(name = "teams")
public class Team extends BaseObject {
	@Column(name = "name")
	private String name;
	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "leader_id", nullable = true)
	private Volunteer leader;
	//@OneToMany(mappedBy = "team_id")
	//private List<Volunteer> volunteers;
}
