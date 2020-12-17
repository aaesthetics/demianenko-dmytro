package ua.khpi.oop.demianenko07;

public class ClientList 
{

	Client array[] = new Client[2];
	

	public void print()
	{
		for(int i = 0; i < array.length; i++)
		{
			System.out.println("ID - " + array[i].getId() + "\nRegistration Date - " + array[i].getDate() + "\nGender - " + array[i].getClientGender() + "\n"); 
			System.out.println("Personal information:\nName - " + array[i].getInformation().getName() + "\nAge - " + array[i].getInformation().getAge() +
					"\nHeight - " + array[i].getInformation().getHeight() + "\nEye color - " + array[i].getInformation().getEyeColour() + 
					"\nHobby - " + array[i].getInformation().getClientHobby() + "\n");
			System.out.println("Partner requirements:\nGender - " + array[i].getRequirements().getPartnerGender() +
					"\nMinimum age - " + array[i].getRequirements().getMinAge() + "\nMaximum age - " + array[i].getRequirements().getMaxAge());
			System.out.println("----------------------------------------");
		}
	}
}
