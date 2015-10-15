package ua.com.helplist.DaoImpl;

import java.util.List;

import org.springframework.stereotype.Repository;

import ua.com.helplist.Dao.IVolunteerDao;
import ua.com.helplist.Model.Volunteer;
import ua.com.helplist.Utils.Constants.Role;

@Repository
public class VolunteerDao implements IVolunteerDao {

	@Override
	public Volunteer createVolunteer(Volunteer Volunteer) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Volunteer saveVolunteer(Volunteer Volunteer) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Volunteer getVolunteer(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Volunteer> getVolunteers(boolean enabled, boolean deleted) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Volunteer> getVolunteers(boolean enabled, boolean deleted, Role role) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int removeVolunteer(long id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int removeVolunteers(List<Volunteer> Volunteers) {
		// TODO Auto-generated method stub
		return 0;
	}

}
