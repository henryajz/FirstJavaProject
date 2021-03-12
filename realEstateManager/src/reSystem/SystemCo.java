package reSystem;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.Locale;
import reSystem.models.owners.*;
import reSystem.models.realEstates.*;
import reSystem.models.Certificates.*;


public class SystemCo {
	private String name;
	private String url;
	
	private OwnerShortedList owners;
	private ReShortedList realEstates;
	private CertShortedList certs;
	
	
	public SystemCo(String name, String url) {
		this.name=name;
		this.url=url;
		
		owners = new OwnerShortedList();
		realEstates = new ReShortedList();
		certs = new CertShortedList();
		
		Date date[] = new Date[20];
		String str[] = { "12/5/1978","15/1/1985","13/11/1970","28/7/1990",
				"1/1/1977","1/1/2015","1/1/1990", 
				"1/1/1991","1/1/2017","1/1/1980",
				"12/5/2000","12/5/2000","1/6/2001","20/9/2003","24/11/2010",
				"26/8/2013","2/4/2017","3/7/2016","13/3/2005","3/7/2016"
				};

		//DATES
	{
		try {
			Locale l = new Locale("el", "GR");
			DateFormat df = DateFormat.getDateInstance(DateFormat.SHORT, l);
			
				date[0]= df.parse(str[0]);		}
		 catch (ParseException e) {
				
			e.printStackTrace();
		}
		try {
			Locale l = new Locale("el", "GR");
			DateFormat df = DateFormat.getDateInstance(DateFormat.SHORT, l);
			
				date[1]= df.parse(str[1]);		}
		 catch (ParseException e) {
				
			e.printStackTrace();
		}
		try {
			Locale l = new Locale("el", "GR");
			DateFormat df = DateFormat.getDateInstance(DateFormat.SHORT, l);
			
				date[2]= df.parse(str[2]);		}
		 catch (ParseException e) {
				
			e.printStackTrace();
		}
		try {
			Locale l = new Locale("el", "GR");
			DateFormat df = DateFormat.getDateInstance(DateFormat.SHORT, l);
			
				date[3]= df.parse(str[3]);		}
		 catch (ParseException e) {
				
			e.printStackTrace();
		}
		try {
			Locale l = new Locale("el", "GR");
			DateFormat df = DateFormat.getDateInstance(DateFormat.SHORT, l);
			
				date[4]= df.parse(str[4]);		}
		 catch (ParseException e) {
				
			e.printStackTrace();
		}
		try {
			Locale l = new Locale("el", "GR");
			DateFormat df = DateFormat.getDateInstance(DateFormat.SHORT, l);
			
				date[5]= df.parse(str[5]);		}
		 catch (ParseException e) {
				
			e.printStackTrace();
		}
		try {
			Locale l = new Locale("el", "GR");
			DateFormat df = DateFormat.getDateInstance(DateFormat.SHORT, l);
			
				date[6]= df.parse(str[6]);		}
		 catch (ParseException e) {
				
			e.printStackTrace();
		}
		try {
			Locale l = new Locale("el", "GR");
			DateFormat df = DateFormat.getDateInstance(DateFormat.SHORT, l);
			
				date[7]= df.parse(str[7]);		}
		 catch (ParseException e) {
				
			e.printStackTrace();
		}
		try {
			Locale l = new Locale("el", "GR");
			DateFormat df = DateFormat.getDateInstance(DateFormat.SHORT, l);
			
				date[8]= df.parse(str[8]);		}
		 catch (ParseException e) {
				
			e.printStackTrace();
		}
		try {
			Locale l = new Locale("el", "GR");
			DateFormat df = DateFormat.getDateInstance(DateFormat.SHORT, l);
			
				date[9]= df.parse(str[9]);		}
		 catch (ParseException e) {
				
			e.printStackTrace();
		}
		try {
			Locale l = new Locale("el", "GR");
			DateFormat df = DateFormat.getDateInstance(DateFormat.SHORT, l);
			
				date[10]= df.parse(str[10]);		}
		 catch (ParseException e) {
				
			e.printStackTrace();
		}
		try {
			Locale l = new Locale("el", "GR");
			DateFormat df = DateFormat.getDateInstance(DateFormat.SHORT, l);
			
				date[11]= df.parse(str[11]);		}
		 catch (ParseException e) {
				
			e.printStackTrace();
		}
		try {
			Locale l = new Locale("el", "GR");
			DateFormat df = DateFormat.getDateInstance(DateFormat.SHORT, l);
			
				date[12]= df.parse(str[12]);		}
		 catch (ParseException e) {
				
			e.printStackTrace();
		}
		try {
			Locale l = new Locale("el", "GR");
			DateFormat df = DateFormat.getDateInstance(DateFormat.SHORT, l);
			
				date[13]= df.parse(str[13]);		}
		 catch (ParseException e) {
				
			e.printStackTrace();
		}
		try {
			Locale l = new Locale("el", "GR");
			DateFormat df = DateFormat.getDateInstance(DateFormat.SHORT, l);
			
				date[14]= df.parse(str[14]);		}
		 catch (ParseException e) {
				
			e.printStackTrace();
		}
		try {
			Locale l = new Locale("el", "GR");
			DateFormat df = DateFormat.getDateInstance(DateFormat.SHORT, l);
			
				date[15]= df.parse(str[15]);		}
		 catch (ParseException e) {
				
			e.printStackTrace();
		}
		try {
			Locale l = new Locale("el", "GR");
			DateFormat df = DateFormat.getDateInstance(DateFormat.SHORT, l);
			
				date[16]= df.parse(str[16]);		}
		 catch (ParseException e) {
				
			e.printStackTrace();
		}
		try {
			Locale l = new Locale("el", "GR");
			DateFormat df = DateFormat.getDateInstance(DateFormat.SHORT, l);
			
				date[17]= df.parse(str[17]);		}
		 catch (ParseException e) {
				
			e.printStackTrace();
		}
		try {
			Locale l = new Locale("el", "GR");
			DateFormat df = DateFormat.getDateInstance(DateFormat.SHORT, l);
			
				date[18]= df.parse(str[18]);		}
		 catch (ParseException e) {
				
			e.printStackTrace();
		}
		try {
			Locale l = new Locale("el", "GR");
			DateFormat df = DateFormat.getDateInstance(DateFormat.SHORT, l);
			
				date[19]= df.parse(str[19]);		}
		 catch (ParseException e) {
				
			e.printStackTrace();
		 }
	}
		
	
		//Owners
		owners.insert(new OwItem(new Person("Νικόλαος Αραμπατζής","123456789", "Παπαφλέσσα 2", date[0] )) );
		owners.insert(new OwItem(new Person("Γεώργιος Μιχαήλ", "987456321", "Μάνου 10", date[1] )) );
		owners.insert(new OwItem(new Person("Ιοκάστη Μάνου", "741258963", "Κτιστάκη 1", date[2] )) );
		owners.insert(new OwItem(new Person("Άννα Κατράκη", "236716384", "Τσόχα 7", date[3] )) );
		owners.insert(new OwItem(new Business("Informix", "341345657", "Παπαναστασίου 10", "Ελένη Δήμου")));
		owners.insert(new OwItem(new Business("SuperFood", "423451241", "Σούτσου 20", "Μαρία Παππά")));

		//Buildings
		realEstates.insert(new ReItem(new Apartment(1, "1000030030", "Ρεθύμνου", "Ρεθύμνου", 90, 2, 170000, 
				"Κουντουριώτου 3", date[4], 2, 4)));
		realEstates.insert(new ReItem(new Apartment(1, "1000030031", "Αττικής", "Αθηναίων", 105, 2.5, 180000, 
				"Πανόρμου 20", date[5], 4, 5)));
		realEstates.insert(new ReItem(new Apartment(2, "1000030032", "Ηρακλείου", "Ηρακλείου", 150, 1.5, 150000, 
				"Κνωσσού 12", date[6], 0, 6)));
		
		realEstates.insert(new ReItem(new DetachedHouse(1, 1, 0, "1000040040", "Λασιθίου", "Σητείας", 80, 1.7, 100000, "4ης Σεπτεμβρίου 2", date[7])));
		realEstates.insert(new ReItem(new DetachedHouse(1, 2, 100, "1000040041", "Χανίων", "Χανίων", 600, 1.5, 500000, "Προφήτη Ηλία 13", date[8])));
		realEstates.insert(new ReItem(new DetachedHouse(2, 1, 0, "1000040042", "Αττικής", "Χαλανδρίου", 200, 1, 300000, "Αγίου Γεωργίου 15", date[9])));
		
	
		//Plots
		realEstates.insert(new ReItem(new BuildingPlot("1000020010", "Αττικής", "Αθηναίων",800, 
				0.5, 180000, 600) ));
		realEstates.insert(new ReItem(new BuildingPlot("1000020011", "Χανίων", "Χανίων",700, 
				0.5, 1100000, 400) ));
		realEstates.insert(new ReItem(new LandPlot("1000020012", "Χανίων", "Ακρωτηρίου",1100, 
				0.4, 500000, 0)));

	
		certs.insert(new CertItem(new OwnershiCert("100", date[10], ReturnRE("1000020010"),
				ReturnOW("123456789"), 50, 1)));
		certs.insert(new CertItem(new OwnershiCert("101", date[11], ReturnRE("1000020010"),
				ReturnOW("987456321"), 50, 1)));
		certs.insert(new CertItem(new OwnershiCert("102", date[12], ReturnRE("1000020011"),
				ReturnOW("123456789"), 100, 1)));
		certs.insert(new CertItem(new OwnershiCert("103", date[13], ReturnRE("1000020012"),
				ReturnOW("741258963"), 100, 1)));
		certs.insert(new CertItem(new OwnershiCert("104", date[14], ReturnRE("1000030030"),
				ReturnOW("236716384"), 100, 1)));
		certs.insert(new CertItem(new OwnershiCert("105", date[15], ReturnRE("1000030031"),
				ReturnOW("236716384"), 100, 2)));
		certs.insert(new CertItem(new OwnershiCert("106", date[16], ReturnRE("1000030032"),
				ReturnOW("423451241"), 100, 1)));
		certs.insert(new CertItem(new OwnershiCert("107", date[17], ReturnRE("1000040040"),
				ReturnOW("741258963"), 100, 1)));
		certs.insert(new CertItem(new OwnershiCert("108", date[18], ReturnRE("1000040041"),
				ReturnOW("741258963"), 100, 3)));
		certs.insert(new CertItem(new OwnershiCert("109", date[19], ReturnRE("1000040042"),
				ReturnOW("341345657"), 100, 1)));
	
	}
	
	//Getters
	public String getName() {
		return name;
	}

	public String getUrl() {
		return url;
	}
	//Case1
	public void SearchAndPrintRealEstates(String code) {
		ReItem rei = (ReItem)realEstates.search(code);
		if(rei==null) {
			

		}
		else {
			rei.print();
		}
		
	}

	//Case2	
	public void printRealEstates() {
		realEstates.print();
	}
	
	//Case3															
	public void PrintItems(String className) {
		realEstates.PrintItemsInHierarchy(className);
	}
	
	
	//Case4
		public void SearchAndPrintOwner(String afm) {
			OwItem owi = (OwItem)owners.search(afm);
			if(owi==null) {
			}
			else {
				owi.print();
			}
			
		}
	
	//Case5
	public void addOwnershipCertificate(OwnershiCert oc) {
		certs.insert(new CertItem(oc));
	}

	
	//Case6.1
	public void FindAndPrintCertByCode(String code) {
		RealEstate re = ReturnRE(code);
		
		CertItem owc = (CertItem) certs.searchByRealEstate(re);
		if(owc==null) {
		}
		else {
			owc.print();
		}
		
	}
	
	//6.2
	public void FindAndPrintCertByAfm(String afm) {
		Owner ow = ReturnOW(afm);
		
		CertItem owc = (CertItem) certs.searchByOwner(ow);
		
		if(owc==null) {
			
		}

	}
	
	//Case7
	public void FindTotalEstate(String afm) {
		Owner ow = ReturnOW(afm);
		if(ow==null) {
			return;
		}
		System.out.println("Total estate cost: "+certs.ReturnTotalEstate(ow));
	}
	
	//Case8
	public void FindTotalTaxes(String afm) {
		Owner ow = ReturnOW(afm);
		
		if(ow==null) {
			return;
		}
		
		System.out.println("Total taxes: "+certs.ReturnTaxes(ow));
	}


	//Case9
	public void addOwner(Owner ow) {
		owners.insert(new OwItem(ow));
	}
	
	//Case10
	public void addRealEstate(RealEstate re) {
		realEstates.insert(new ReItem(re));
	}
	
	
	//Find and return real estate by code
	public RealEstate ReturnRE(String code) {
		ReItem rei = (ReItem)realEstates.search(code);		
		if(rei==null) {
			
		}
		
		if(rei!=null)
		return (RealEstate) rei.getData();	
		else
			return null;
	}
	
	//Find and return owner by afm
	public Owner ReturnOW(String afm) {
		OwItem owi = (OwItem)owners.search(afm);
		
		if(owi!=null)
		return (Owner) owi.getData();	
		else
			return null;
	}
	
}
