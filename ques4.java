import java.util.*;
class student {
	Integer age;
	String name;
	public student(Integer age,String name)
	{
		this.age = age;
		this.name = name;
	}
	public static void main(String[] args) {
		ArrayList<student> list = new ArrayList<student>();
		list.add(new student(21,"Neel"));
		list.add(new student(20,"Vinita"));
		list.add(new student(22,"Aditi"));
		Name n = new Name();
		Collections.sort(list,n);
		System.out.println("sorted by name");
		for(student r: list)
		{
			System.out.println(r.age + " " + r.name);
		}
		Age a = new Age();
		Collections.sort(list, a);
		System.out.println(" ");
		System.out.println("sorted by age");
		for(student p : list)
		{
			System.out.println( p.age + " " + p.name);
		}
}
}
	class Age implements Comparator <student>
	{

		public int compare(student s1, student s2)
		{  
		  if(s1.age < s2.age) 
				return -1;
			if(s1.age > s2.age) 
				return 1;
			else return 0;
		}
		
	}
	class Name implements Comparator<student>
	{

		public int compare(student s1, student s2)
		{
			if((s1.name).compareTo(s2.name) > 0 )
				return 1;
			if((s1.name).compareTo(s2.name) < 0 )
				return -1;
			else return 0;
		}
		
	}