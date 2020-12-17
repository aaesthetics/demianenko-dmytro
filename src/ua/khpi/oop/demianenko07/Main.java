package ua.khpi.oop.demianenko07;

public class Main 
{
	public static void main(String[] args) 
	{
		 ClientList list = new ClientList();
		 InfoAboutYourself info = new InfoAboutYourself("Dmitriy", 19, 182, "Brown", "Football");
		 PartnerRequirements requirements = new PartnerRequirements("Woman", 18, 25);
		 list.array[0] = new Client("Man", 1, "21.04.2016", info, requirements);
		 info = new InfoAboutYourself("Alina", 19, 167, "Brown", "Drawing");
		 requirements = new PartnerRequirements("Man", 18, 25);
		 list.array[1] = new Client("Woman", 2, "17.09.2018", info, requirements);
		 list.print();
		 list.array[0].getInformation().setAge(23);
		 list.array[1].getRequirements().setMaxAge(30);
		 info = new InfoAboutYourself("Victoria", 21, 172, "Blue", "Dancing");
		 list.array[1].setInformation(info);
		 list.print();
	}
}

	