package reSystem;

import java.text.SimpleDateFormat;
import java.util.Date;
import reSystem.models.Certificates.OwnershiCert;
import reSystem.models.owners.*;
import reSystem.models.realEstates.*;
import tuc.ece.cs102.util.StandardInputRead;

public class SytemConsole {
	private SystemCo sc= new SystemCo("This is the name.", "This is url.");

	
	
	public static void main(String[] args) {
		StandardInputRead in = new StandardInputRead();
		
		SytemConsole sc2 = new SytemConsole();
		
		System.out.println("System name: "+sc2.sc.getName()+ "\n"+"        url: "+sc2.sc.getUrl());
			Space();
		boolean c=true;
		
		while(c) {
			MainMenu();	
			
			int choice =in.readPositiveInt("Enter your choice:");
			System.out.println();
			
			switch(choice) {
			//Find real estate by code
				case 1:
						String code = in.readString("Enter property code:");
						sc2.sc.SearchAndPrintRealEstates(code);
						Space();
					break;
					
			//prints all real estates
				case 2:
						sc2.sc.printRealEstates();
						Space();
					break;
			//Print all in hierarchy	
				case 3:
					String className = in.readString("Enter type of real estate:");
					sc2.sc.PrintItems(className);
					break;
			//Find owner by afm	
				case 4:
						String afm= in.readString("Enter afm of owner:");
						System.out.println();
						sc2.sc.SearchAndPrintOwner(afm);
						Space();
					break;
			//Enter certificate	
				case 5:
						System.out.println("New ownership certificate.");
					
				//Find Owner
					afm= in.readString("Enter afm of owner:");
					if(sc2.sc.ReturnOW(afm)==null)
							break;
						System.out.println();
						
				//Find Real Estate
					code=in.readString("Enter property code:");
					if(sc2.sc.ReturnRE(code)==null)
						break;
							
				//Creation Date
					int tmpChoice;
					Date date2 = new Date();
					
						System.out.println("\n"+"1.If creation date is now.");
						System.out.println("2.If you want to add creation date."+"\n");
						tmpChoice= in.readPositiveInt("Enter your choice: ");
						
						if(tmpChoice==1) {
							SimpleDateFormat form = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
							form.format(date2);
						}
						if(tmpChoice==2) {
							date2=in.readDate("Enter date: ");
							
							//Check date input
							if(date2==null) {
								System.out.println("Enter valid date. Please try again.");
								break;
							}
							//Check again
							Date tmpDate = new Date();
							if(date2.compareTo(tmpDate)>0) {
								System.out.println("Enter valid date. Please try again.");
								break;
							}
						}
						if(tmpChoice<1 || tmpChoice>2) {
							System.out.println("Enter valid value.");
							break;
						}
						
				//Certificate code
						String CerCode=RandomGen();
						   
				//Type of ownership	
						System.out.println("\n"+"1.If complete ownership.");
						System.out.println("2.If petty ownership.");
						System.out.println("3.If Usufruct ownership.");
						int choice2 = in.readPositiveInt("Enter type of ownership:");
								
						if(choice2>4 || choice2<1) {
							System.out.println("Incorrect choice, please try again.");										
								break;
						}
									
				//Percentage
						float per = in.readPositiveFloat("\n"+"Enter percentage of ownership:");
						if(per>100 || per<0) {
							System.out.println("Enter percentage between bounds(0-100)%.");
								break;
						}
					
				//Insert ownership certificate
						OwnershiCert oc = new OwnershiCert(
								CerCode, date2, sc2.sc.ReturnRE(code), sc2.sc.ReturnOW(afm), 
								per, choice2);
						
						sc2.sc.addOwnershipCertificate(oc);
					System.out.println("Certificate successfully stored!"+"\n");
					Space();
					
					break;
			//Search certificate
				case 6:
					boolean c3=true;
					while(c3) {
						System.out.println("1.Search by property code.");
						System.out.println("2.Search by owner's afm.");
						System.out.println("Any other number to exit.");
						int choice3 = in.readPositiveInt("Enter your choice:");
						System.out.println();
						
						switch(choice3) {
						//By real estate code
							case 1:								
									code=in.readString("Enter property code:");
									sc2.sc.FindAndPrintCertByCode(code);
									Space();
								break;
						//By owner afm
							case 2:
									afm=in.readString("Enter afm:");
									sc2.sc.FindAndPrintCertByAfm(afm);
									Space();
								break;
								
							default:
									System.out.println("Exiting");
									c3=false;
								break;
								
						}
					}
					System.out.println();
					break;
			//Calculate owner total estate
				case 7:
						System.out.println("Calculate estate.");
						afm=in.readString("Enter afm:");
						sc2.sc.FindTotalEstate(afm);
						Space();
					break;
			//Calculate taxes		
				case 8:
					System.out.println("Calculate total estate taxes.");
					afm = in.readString("Enter afm:");
					sc2.sc.FindTotalTaxes(afm);
					Space();
					break;
			//Register owner		
				case 9:
					 c3=true;
					while(c3) {
						System.out.println("1.Enter person.");
						System.out.println("2.Enter business.");
						System.out.println("Any other number to exit.");
						int choice3 = in.readPositiveInt("Enter your choice:");
						System.out.println();
						
						switch(choice3) {
						
							case 1:								
									afm = in.readString("Enter afm: ");
									String name = in.readString("Enter name: ");
									String country = in.readString("Enter city: ");
									
									date2=in.readDate("Enter date of birth: ");
									if(date2==null) {
										System.out.println("Enter valid date. Please try again");
										break;
									}
										
									
									//now date
									Date date3 = new Date();
									
									if(date3.compareTo(date2)<0) {
										System.out.println("Wrong age. Please try again.");
										break;
									}
									sc2.sc.addOwner(new Person(name, afm, country, date2));
									Space();
								break;
							
							case 2:
									afm=in.readString("Enter afm:");
									name=in.readString("Enter business name: ");
									country = in.readString("Business main location: ");
									String name2= in.readString("Enter business owner name: ");
									sc2.sc.addOwner(new Business(name, afm, country, name2));
									Space();
								break;
								
							default:
									System.out.println("Exiting");
									c3=false;
								break;	
						}
					}
					
					break;
					
			//Register real estate		
				case 10:
					c3=true;
					System.out.println("1.Enter building plot.");
					System.out.println("2.Enter farm plot.");
					System.out.println("3.Enter apartment.");
					System.out.println("4.Enter detached house.");
					System.out.println("Any other number to exit.");
					int choice3 = in.readPositiveInt("Enter your choice:");
					System.out.println();
					
					switch(choice3) {
					
					case 1:								
							code = in.readString("Enter code: ");
							String country = in.readString("Enter prefecture: ");
							String city = in.readString("Enter municipality: ");
							double area = in.readPositiveDouble("Enter area in square meters: :");
							double price = in.readPositiveDouble("Enter price per square metre: ");
							double cost = in.readPositiveDouble("Enter total price: ");
							double barea = in.readPositiveDouble("Enter building area: ");
							
							sc2.sc.addRealEstate(new BuildingPlot(code, country, city, area, price, cost
									,barea));
								Space();
							break;
						
						case 2:
							code = in.readString("Enter code: ");
							country = in.readString("Enter prefecture: ");
							city = in.readString("Enter municipality: ");
							area = in.readPositiveDouble("Enter area in square meters: :");
							price = in.readPositiveDouble("Enter price per square metre: ");
							cost = in.readPositiveDouble("Enter total price: ");
							
							sc2.sc.addRealEstate(new LandPlot(code, country, city, area, price, cost
									,0));
								
							break;
							
						case 3:
							//find use of apartment business or personal
							System.out.println("1.For personal use.");
							System.out.println("2.For business use.");
							int use= in.readPositiveInt("Select apartment use: ");
							if(use>3) {
								System.out.println("Please try again.");
								break;
							}
							
							code = in.readString("Enter code: ");
							country = in.readString("Enter prefecture: ");
							city = in.readString("Enter municipality: ");
							String address = in.readString("Enter address: ");
							area = in.readPositiveDouble("Enter area in square meters: :");
							price = in.readPositiveDouble("Enter price per square metre: ");
							cost = in.readPositiveDouble("Enter total price: ");
							date2=in.readDate("Enter creation date: ");
							int floor = in.readPositiveInt("Enter floor: ");
							int rooms = in.readPositiveInt("Enter number of rooms: ");
							
							
							//Check date input
							if(date2==null) {
								System.out.println("Enter valid date. Please try again.");
								break;
							}
							//Check again
							Date tmpDate = new Date();
							if(date2.compareTo(tmpDate)>0) {
								System.out.println("Enter valid date. Please try again.");
								break;
							}

							sc2.sc.addRealEstate(new Apartment(use, code, country, city, area, price,
									cost, address, date2, floor, rooms));	
							break;
							
						case 4:
							//find use of apartment business or personal
							System.out.println("1.For personal use.");
							System.out.println("2.For business use.");
							use= in.readPositiveInt("Select apartment use: ");
							if(use>3) {
								System.out.println("Please try again.");
								break;
							}
							
							code = in.readString("Enter code: ");
							country = in.readString("Enter : ");
							city = in.readString("Enter municipality: ");
							address = in.readString("Enter prefecture: ");
							area = in.readPositiveDouble("Enter area in square meters: :");
							price = in.readPositiveDouble("Enter price per square metre: ");
							cost = in.readPositiveDouble("Enter total price: ");
							date2=in.readDate("Enter creation date: ");
							floor = in.readPositiveInt("Enter max floors: ");
							rooms = in.readPositiveInt("Enter number of rooms: ");
							double pool =in.readPositiveDouble("Enter pool area: ");
							
							//Check date input
							if(date2==null) {
								System.out.println("Enter valid date. Please try again.");
								break;
							}
							//Check again
							tmpDate = new Date();
							if(date2.compareTo(tmpDate)>0) {
								System.out.println("Enter valid date. Please try again.");
								break;
							}

							sc2.sc.addRealEstate(new DetachedHouse(use, floor, pool, code,
									country, city, area, price, cost, address, date2));
							break;
							
						default:
								System.out.println("Exiting");
								c3=false;
							break;	
					}
					
					Space();
					break;
					
				default:
					System.out.println("Exiting.");
					c=false;
					break;
			}
			System.out.println();
			}	
		
	}
	
	static String RandomGen(){ 
		 final int maxRecC=10;
		        
		 String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
		  
		 StringBuilder sb = new StringBuilder(maxRecC); 
		  
		 for (int i = 0; i < maxRecC; i++) { 
		        	
		       int index= (int)(AlphaNumericString.length()*Math.random()); 
		       sb.append(AlphaNumericString.charAt(index)); 
		 } 
		 return sb.toString(); 
	}
	
	static void MainMenu() {
		System.out.println("1.Find property.");
		System.out.println("2.Print all properties.");
		System.out.println("3.See a specific category of real estates.");
		System.out.println("4.Find owner.");
		System.out.println("5.New ownership certificate.");
		System.out.println("6.Find owner of a property.");
		System.out.println("7.Calcute total estate cost.");
		System.out.println("8.Calculate taxes.");
		System.out.println("9.Enter new owner.");
		System.out.println("10.Enter new real estate");
		System.out.println("Any other number to exit.");
	}
	
	static void Space() {
		StandardInputRead in = new StandardInputRead();
		System.out.println("_________________________________________");			
		in.readString("Press any key to continue...");
		System.out.println();
	}
}
