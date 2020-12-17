package ua.khpi.oop.demianenko07;

public class InfoAboutYourself
{

	private String name;
	private int age;
	private int height;
	private String eyeColour;
	private String hobby;
	

	public InfoAboutYourself(String name, int age, int height, String eyeColour, String hobby)
	{
		this.name = name;
		this.age = age;
		this.height = height;
		this.eyeColour = eyeColour;
		this.hobby = hobby;
	}
	
	public InfoAboutYourself()
	{
		
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public int getAge()
	{
		return age;
	}
	
	public void setAge(int age)
	{
		this.age = age;
	}
	
	public int getHeight()
	{
		return height;
	}
	
	public void setHeight(int height)
	{
		this.height = height;
	}
	
	public String getEyeColour()
	{
		return eyeColour;
	}
	
	public void setEyeColour(String eyeColour)
	{
		this.eyeColour = eyeColour;
	}
	
	public String getClientHobby()
	{
		return hobby;
	}
	
	public void setClientHobby(String hobby)
	{
		this.hobby = hobby;
	}
}
