package ua.com.helplist.Dao;

import java.util.List;

import ua.com.helplist.Model.Volunteer;
import ua.com.helplist.Utils.Constants;

public interface IVolunteerDao {
	public Volunteer createVolunteer(Volunteer Volunteer);

	public Volunteer saveVolunteer(Volunteer Volunteer);

	public Volunteer getVolunteer(long id);

	public List<Volunteer> getVolunteers(boolean enabled, boolean deleted);

	public List<Volunteer> getVolunteers(boolean enabled, boolean deleted, Constants.Role role);

	public int removeVolunteer(long id);

	public int removeVolunteers(List<Volunteer> Volunteers);
}
