

public class Employe {
  private int id;
  private String name;
  private String salary;
  
    
  
  @Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + id;
	result = prime * result + ((name == null) ? 0 : name.hashCode());
	result = prime * result + ((salary == null) ? 0 : salary.hashCode());
	return result;
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Employe other = (Employe) obj;
	if (id != other.id)
		return false;
	if (name == null) {
		if (other.name != null)
			return false;
	} else if (!name.equals(other.name))
		return false;
	
	if (salary == null)
	{
		if (other.salary != null)
			return false;
	}
	else if (!salary.equals(other.salary))
		return false;
	
	return true;
}

public static void main(String[] args) {
	  Employe  emp1=new Employe();
	  Employe  emp2=new Employe();
	  System.out.println(emp1.equals(emp2));
}
}

