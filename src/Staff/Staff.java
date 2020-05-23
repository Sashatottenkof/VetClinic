package Staff;

/**
 * All staff members have its Id, name, salary level, and position
 *
 */
public abstract class Staff {
	protected String name;
	protected int Id;
	protected int salaryLvl;
	protected String position;
	
	public Staff (String name, int Id, int salaryLvl) {
		this.name = name;
		this.Id = Id;
		this.salaryLvl = salaryLvl;
		
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public int getSalaryLvl() {
		return salaryLvl;
	}
	public void setSalaryLvl(int salaryLvl) {
		this.salaryLvl = salaryLvl;
		
	}
	
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	@Override
	public String toString() {
		return "\r\n" + " position: " + position +  "\r\n" +" name: " + name + "\r\n" +" Id: " + Id + 
				 "\r\n" +" salary level: " + salaryLvl  + "\r\n" + "\r\n" + " ------------------------ ";
	}
	
	
}
