public class Notes{
	private String note;
	private int st_note;
	private String[] storage = new String[10];

	public Notes(){

	} 

	public String izpis(int st_note){
		return storage[st_note];
	}

}
