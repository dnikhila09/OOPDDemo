
public class Person5 {

	private Job job;  //composition has a relationship
	
	public Person5()
	{
		this.job = new Job();
		job.setSalary(1000L);//L for long
		job.setId(101);
		job.setRole("manager");
		
	}
	
	public void dispDetails()
	{
		System.out.println(job.getId()+" "+job.getRole()+" "+job.getSalary());
	}
}
