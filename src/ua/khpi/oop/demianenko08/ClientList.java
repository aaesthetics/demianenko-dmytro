package ua.khpi.oop.demianenko08;

import ua.khpi.oop.demianenko07.Client;

public class ClientList 
{
	private int size = 2;

	Client array[] = new Client[size];
	
	public int getSize()
	{
		return size;
	}
	
	public void setSize(int size)
	{
		this.size = size;
	}

	public void printAll()
	{
		if(size > 0)
			for(int i = 0; i < array.length; i++)
			{
				System.out.println("ID - " + array[i].getId() + "\nRegistration date - " + array[i].getDate() + "\nGender - " + array[i].getClientGender() + "\n"); 
				System.out.println("Information about yourself:\nName - " + array[i].getInformation().getName() + "\nAge - " + array[i].getInformation().getAge() +
						"\nHeight - " + array[i].getInformation().getHeight() + "\nEye colour - " + array[i].getInformation().getEyeColour() + 
						"\nHobby - " + array[i].getInformation().getClientHobby() + "\n");
				System.out.println("Partner requirements:\nGender - " + array[i].getRequirements().getPartnerGender() +
						"\nMin age - " + array[i].getRequirements().getMinAge() + "\nMax age - " + array[i].getRequirements().getMaxAge());
				System.out.println("----------------------------------------");
			}
		else
		{
			System.out.println("Empty list");
			System.out.println("----------------------------------------");
		}
	}

	public void print(int num)
	{
		System.out.println("ID - " + array[num].getId() + "\nRegistration date - " + array[num].getDate() + "\nGender - " + array[num].getClientGender() + "\n"); 
		System.out.println("Information about yourself:\nName - " + array[num].getInformation().getName() + "\nAge - " + array[num].getInformation().getAge() +
				"\nHeight - " + array[num].getInformation().getHeight() + "\nEye colour - " + array[num].getInformation().getEyeColour() + 
				"\nHobby - " + array[num].getInformation().getClientHobby() + "\n");
		System.out.println("Partner requirements:\nGender - " + array[num].getRequirements().getPartnerGender() +
				"\nMin age - " + array[num].getRequirements().getMinAge() + "\nMax age - " + array[num].getRequirements().getMaxAge());
		System.out.println("----------------------------------------");
	}
	
	public void add(Client string) 
	{
		Client newArr[] = new Client[size + 1];
		for (int i = 0; i < size; i++) 
			newArr[i] = array[i];
		size++;
		newArr[size - 1] = string;
		array = newArr;
	}
	

	void remove(int num) 
	{
		Client newArr[] = new Client[size - 1];
		for (int i = 0; i < num; i++) 
			newArr[i] = array[i];
		for (int i = num, j = num + 1; j < size; i++, j++) 
			newArr[i] = array[j];
		size--;
		array = newArr;
	}
	

	void clear()
	{
		size = 0;
		Client newArr[] = new Client[size];
		array = newArr;
	}
}
