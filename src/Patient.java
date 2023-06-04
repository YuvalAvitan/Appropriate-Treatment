import java.util.ArrayList;

public class Patient {
	private String Name;
	private String age;
	private String id;
	private String smoke;
	private String pregnent;
	private String fever;
	private String Disese;
	
	private String gender;
	private String region;
	
	
	private String neut;
	private String hct;
	private String Lymph;
	
	public String getNeut() {
		return neut;
	}

	public void setNeut(String neut) {
		this.neut = neut;
	}

	public String getHct() {
		return hct;
	}

	public void setHct(String hct) {
		this.hct = hct;
	}

	public String getLymph() {
		return Lymph;
	}

	public void setLymph(String lymph) {
		Lymph = lymph;
	}



	private String wbc;
	private String rbc;
	private String urea;
	private String hemoglobin;
	private String iron;
	private String creatinine;
	private String hdl;
	private String ap;
	
	
	private int arr[] = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
	private  String[] diagnose = {
			"Anemia",
			"diet",
			"bleeding",
			"Hyperlipidemia (blood lipids)",
			"Disorder of blood / blood cell formation",
			"Hematological disorder",
			"Iron poisoning",
			"Dehydration",
			"Infection",
			"Vitamin deficiency",
			"Viral disease",
			"Diseases of the biliary tract",
			"heart diseases",
			"Blood disease",
			"Liver disease",
			"Kidney disease",
			"Iron deficiency",
			"Muscle diseases",
			"Smokers",
			"Lung disease",
			"Overactive thyroid gland",
			"Adult diabetes",
			"cancer",
			"Increased consumption of meat",
			"Use of various medications",
			"Malnutrition"
			};
			
	private  String[] treatment = {
			"Two 10 mg pilles of B12 a day for a month",
			"Schedule an appointment with a nutritionist",
			"To be evacuated urgently to the hospital",
			"Schedule an appointment with a nutritionist, a 5 mg pill of Simobil daily for a week",
			"10 mg pill of B12 a day for a month 5 mg pill of folic acid a day for a month",
			"An injection of a hormone to encourage red blood cell production",
			"To be evacuated to the hospital",
			"Complete rest while lying down, returning fluids while drinking",
			"Dedicated antibiotics",
			"Referral for a blood test to identify the missing vitamins",
			"Rest at home",
			"Referral to surgical treatment",
			"Schedule an appointment with a nutritionist",
			"A combination of cyclophosphamide and corticosteroids",
			"Referral to a specific diagnosis for the purpose of determining treatment",
			"Balance blood sugar levels",
			"Two 10 mg B12 pills a day for a month",
			"Two 5 mg pills of Altman c3 turmeric a day for a month",
			"to stop smoking",
			"Stop smoking / refer to X-ray of the lungs",
			"ropylthiouracil to reduce thyroid activity",
			"Insulin adjustment for the patient",
			"Entrectinib",
			"Schedule an appointment with a nutritionist",
			"Referral to a family doctor for a match between medications",
			"Schedule an appointment with a nutritionist"
			};
	public Patient(String name, String age, String id)
	{
		this.setName(name);
		this.setAge(age);
		this.setId(id);
	}

	public String getSmoke() {
		return smoke;
	}

	public void setSmoke(String smoke) {
		this.smoke = smoke;
	}

	public String getPregnent() {
		return pregnent;
	}

	public void setPregnent(String pregnent) {
		this.pregnent = pregnent;
	}

	public String getFever() {
		return fever;
	}

	public void setFever(String fever) {
		this.fever = fever;
	}

	public String getDisese() {
		return Disese;
	}

	public void setDisese(String disese) {
		Disese = disese;
	}

	public String getWbc() {
		return wbc;
	}

	public void setWbc(String wbc) {
		this.wbc = wbc;
	}

	public String getRbc() {
		return rbc;
	}

	public void setRbc(String rbc) {
		this.rbc = rbc;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getUrea() {
		return urea;
	}

	public void setUrea(String urea) {
		this.urea = urea;
	}

	public String getHemoglobin() {
		return hemoglobin;
	}

	public void setHemoglobin(String hemoglobin) {
		this.hemoglobin = hemoglobin;
	}

	public String getIron() {
		return iron;
	}

	public void setIron(String iron) {
		this.iron = iron;
	}

	public String getCreatinine() {
		return creatinine;
	}

	public void setCreatinine(String creatinine) {
		this.creatinine = creatinine;
	}

	public String getHdl() {
		return hdl;
	}

	public void setHdl(String hdl) {
		this.hdl = hdl;
	}

	public String getAp() {
		return ap;
	}

	public void setAp(String ap) {
		this.ap = ap;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	
	public void wbc_test()
	{
		float num1 = Float.parseFloat(age);
		float num2 = Float.parseFloat(wbc);
	
		if(num1 > 17) {		
			if(num2 < 4500) {
				arr[10]= arr[10] + 1;
				arr[22] = arr[22] + 1;
				}
			else if(num2 > 11000 )
			{
				if(fever == "yes")
				{
					arr[8]= arr[8] + 1;
				}
				else 
				{
					arr[13] = arr[13] + 1;
					arr[22] = arr[22] + 1;
				}
			}		
		}
		
		else if(num1 >= 4 && num1<=17) {
			if(num2 < 5500) {
				arr[10]= arr[10] + 1;
				arr[22] = arr[22] + 1;
				}
			else if(num2 > 15500 )
			{
				if(fever == "yes")
				{
					arr[8]= arr[8] + 1;
				}
				else 
				{
					arr[13] = arr[13] + 1;
					arr[22] = arr[22] + 1;
				}
			}	
		}
		else {
			if(num2 <6000) {
				arr[10]= arr[10] + 1;
				arr[22] = arr[22] + 1;
				}
			else if(num2 > 17500)
			{
				if(fever == "yes")
				{
					arr[8]= arr[8] + 1;
				}
				else 
				{
					arr[13] = arr[13] + 1;
					arr[22] = arr[22] + 1;
				}
			}	
		}	
	}
	
	public void neut()
	{

		float num2 = Float.parseFloat(wbc);
		float nut = Float.parseFloat(neut);
		
		if(num2 * 0.28 > nut )
		{
			arr[4] = arr[4] + 1;
			arr[8] = arr[8] + 1;
			arr[22] = arr[22] + 1;
		}
		
		else if(num2 * 0.54 < nut )
		{
			arr[8] = arr[8] + 1;
		}

	}
	
	
	public void lymph()
	{

		float num2 = Float.parseFloat(wbc);
		float lymp = Float.parseFloat(Lymph);
		
		if(num2 * 0.36 > lymp )
		{
			arr[4] = arr[4] + 1;
		}
			
		else if(num2 * 0.52 < lymp )
		{
			arr[8] = arr[8] + 1;
			arr[22] = arr[22] + 1;
		}
	}
	
	public void rbc_test()
	{
		float num2 = Float.parseFloat(rbc);
		

		if(4.5 > num2 )
		{
			arr[0] = arr[0] +1;
			arr[8] = arr[8] +1;
		}

		else if(6 < num2 )
		{
			arr[4] = arr[4] + 1;
			arr[18] = arr[18] + 1;
			arr[19] = arr[19] + 1;
		}
	}
	
	
	public void hct()
	{

		float num2 = Float.parseFloat(rbc);
		float hc = Float.parseFloat(hct);
		
		if(gender == "Male")
		{
			if(num2* 0.37 > hc )
			{
				arr[0] = arr[0] +1;
				arr[2] = arr[2] +1;
			}
			
			else if(num2* 0.54 < hc )
			{
				arr[18] = arr[18] +1;
			}

		}
		else
		{
			if(num2* 0.33 > hc )
			{
				arr[0] = arr[0] +1;
				arr[2] = arr[2] +1;
			}
			else if(num2* 0.47< hc )
			{
				arr[18] = arr[18] +1;
			}
		}
	}
	
	public void urea()
	{

		float num2 = Float.parseFloat(urea);
		
		
		if(region == "West")
		{
			if(17 > num2 && pregnent == "no")
			{
				arr[25] = arr[25] +1;
				arr[1] = arr[1] +1;
				arr[14] = arr[14] +1;
			}

			else if(43 < num2 )
			{
				arr[7] = arr[7] +1;
				arr[1] = arr[1] +1;
				arr[15] = arr[15] +1;
			}
		}
		else
		{
			if(17 + 17*0.10 > num2 && pregnent == "no" )
			{
				arr[25] = arr[25] +1;
				arr[1] = arr[1] +1;
				arr[14] = arr[14] +1;
			}

			else if(43 + 43*0.10< num2 )
			{
				arr[7] = arr[7] +1;
				arr[1] = arr[1] +1;
				arr[15] = arr[15] +1;
			}
		}
	}
	
	
	public void hb()
	{
		float num1 = Float.parseFloat(age);
		float num2 = Float.parseFloat(hemoglobin);
		
		
		if(num1 <= 17)
		{
			if(11.5 > num2 )
			{
				arr[0] = arr[0] + 1;
			}

		}
		else if(gender == "Male")
		{
			if(12 > num2 )
			{
				arr[0] = arr[0] + 1;
			}
		}
		else
		{
			if(12 > num2 )
			{
				arr[0] = arr[0] + 1;
			}
		}
	}
	
	
	public void creatinine_test()
	{
		float num1 = Float.parseFloat(age);
		float num2 = Float.parseFloat(creatinine);
		
		if(num1 < 3) {		
			if(num2 < 0.2)
			{
				arr[17] = arr[17] + 1;
				arr[25] = arr[25] + 1;
			}
			
			else if(num2 > 0.5)
			{
				arr[15] = arr[15] + 1;
				arr[17] = arr[17] + 1;
				arr[23] = arr[23] + 1;
			}
		}
		
		else if(num1 < 18) {
			if(num2 <0.5)
			{
				arr[17] = arr[17] + 1;
				arr[25] = arr[25] + 1;
			}
			else if(num2 > 1)
			{
				arr[15] = arr[15] + 1;
				arr[17] = arr[17] + 1;
				arr[23] = arr[23] + 1;
			}

		}
		else if(num1 < 60) {
			
			if(num2 < 0.6)
			{
				arr[17] = arr[17] + 1;
				arr[25] = arr[25] + 1;
			}
			else if(num2 > 1)
			{
				arr[15] = arr[15] + 1;
				arr[17] = arr[17] + 1;
				arr[23] = arr[23] + 1;
			}
		}	
		else
		{
			if(num2 < 0.6)
			{
				arr[17] = arr[17] + 1;
				arr[25] = arr[25] + 1;
			}
			
			else if(num2 > 1.2)
			{
				arr[15] = arr[15] + 1;
				arr[17] = arr[17] + 1;
				arr[23] = arr[23] + 1;
			}
		}
	}
	
	public void iron_test()
	{

		float num2 = Float.parseFloat(iron);
		
		if(gender == "Male")
		{
			if(60 > num2 )
			{
				arr[16] = arr[16] + 1;
				arr[25] = arr[25] + 1;
				arr[2] = arr[2] + 1;
			}
			else if(160 < num2 )
			{
				arr[6] = arr[6] + 1;
			}
		}
		else
		{
			if(60 - 60*0.2 > num2 && pregnent == "no" )
			{
				arr[25] = arr[25] + 1;
				arr[2] = arr[2] + 1;
				arr[16] = arr[16] + 1;
			}
			else if(60 - 60*0.2 > num2 && pregnent == "yes")
			{
				arr[16] = arr[16] + 1;
			}
			
			else if(160 - 160*0.2 < num2 )
			{
				arr[6] = arr[6] + 1;
			}
		}
	}
	
	
	public void hdl_test()
	{

		float num2 = Float.parseFloat(hdl);
		
		
		if(region == "Ethiopian")
		{
			if(gender == "Male")
			{
				if(29 + 29*0.2> num2 )
				{
					arr[3] = arr[3] + 1;
					arr[12] = arr[12] + 1;
					arr[21] = arr[21] + 1;
				}
			}
			else
			{
				if(34 + 34*0.2 > num2 )
				{
					arr[3] = arr[3] + 1;
					arr[12] = arr[12] + 1;
					arr[21] = arr[21] + 1;
				}
			}
		}
		
		else
		{
			if(gender == "Male")
			{
				if(29> num2 )
				{
					arr[3] = arr[3] + 1;
					arr[12] = arr[12] + 1;
					arr[21] = arr[21] + 1;
				}
			}
			else
			{
				if(34 > num2 )
				{
					arr[3] = arr[3] + 1;
					arr[12] = arr[12] + 1;
					arr[21] = arr[21] + 1;
				}
			}
		}

	}
	
	public void ap_test()
	{

		float num2 = Float.parseFloat(ap);
		
		
		if(region == "East")
		{
			if(60 > num2 )
			{
				arr[9] = arr[9] + 1;
				arr[25] = arr[25] + 1;
			}
			else if(120 < num2 && pregnent == "no")
			{
				arr[14] = arr[14] + 1;
				arr[11] = arr[11] + 1;
				arr[20] = arr[20] + 1;
				arr[24] = arr[24] + 1;
			}
		}
		else
		{
			if(30 > num2 )
			{
				arr[9] = arr[9] + 1;
				arr[25] = arr[25] + 1;
			}
			else if(90 < num2 && pregnent == "no" )
			{
				arr[14] = arr[14] + 1;
				arr[11] = arr[11] + 1;
				arr[20] = arr[20] + 1;
				arr[24] = arr[24] + 1;
			}
		}
	}
	
	public ArrayList<Integer> find_max()
	{
		
		int max = 0;
		
		wbc_test();
		neut();
		lymph();
		rbc_test();
		hct();
		urea();
		hb();
		creatinine_test();
		iron_test();
		hdl_test();
		ap_test();
	
		
		ArrayList<Integer> index = new ArrayList<>();
		
		
		for(int i=0; i< arr.length; i++)
		{
			if(arr[i] > max)
				max = arr[i];
		}
		
		for(int i=0; i < arr.length; i++)
		{
			if(max == arr[i])
				index.add(i);
		}
		
		return index;
	}

	public int[] getArr() {
		return arr;
	}

	public void setArr(int arr[]) {
		this.arr = arr;
	}

	public  String[] getTreatment() {
		return treatment;
	}



	public String[] getDiagnose() {
		return diagnose;
	}

}
