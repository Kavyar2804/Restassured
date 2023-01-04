package genricUtility;

public interface End_points {
	/**
	 * This interface consist of all the endpoints
	 * @author Kavya
	 */
	
	public interface EndPointsLibrary
	{
		String createproject = "/addProject";
		String updateProject = "/projects/";
		String getallprojects = "/projects";
		String getsingleproject = "/projects/";
		String deleteproject = "/projects/";
				
	}
	

}
