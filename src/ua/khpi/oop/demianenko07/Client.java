package ua.khpi.oop.demianenko07;

public class Client 
{
	private String gender;
	private int id;
	private String registrationDate;
	private InfoAboutYourself information;
	private PartnerRequirements requirements;
	

	public Client(String gender, int id, String date, InfoAboutYourself info, PartnerRequirements requirements)
	{
		this.gender = gender;
		this.id = id;
		this.registrationDate = date;
		this.information = info;
		this.requirements = requirements;
	}
	
	public Client()
	{
		
	}

	public String getClientGender()
	{
		return gender;
	}
	
	public void setClientGender(String gender)
	{
		this.gender = gender;
	}
	
	public int getId()
	{
		return id;
	}
	
	public void setId(int id)
	{
		this.id = id;
	}
	
	public String getDate()
	{
		return registrationDate;
	}
	
	public void setDate(String date)
	{
		this.registrationDate = date;
	}
	
	public InfoAboutYourself getInformation()
	{
		return information;
	}
	
	public void setInformation(InfoAboutYourself info)
	{
		this.information = info;
	}
	
	public PartnerRequirements getRequirements()
	{
		return requirements;
	}
	
	public void setRequirements(PartnerRequirements requirements)
	{
		this.requirements = requirements;
	}
}
