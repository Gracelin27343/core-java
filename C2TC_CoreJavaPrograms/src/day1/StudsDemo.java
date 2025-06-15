package day1;

public class StudsDemo {

	public static void main(String[] args) {
		Students st = new Students();
        st.setId(101);
        st.setName("Grace");
        st.setAge(20);
        
        System.out.println(st);
      
        //for one object
        //System.out.println("ID:"+st1.getId());
 	   //System.out.println("Name:"+st1.getName());
 	   //System.out.println("Age:"+st1.getAge());
        
        Students st1 = new Students();
        st1.setId(102);
        st1.setName("beni");
        st1.setAge(20);
     //two a more object using tostring()   
        System.out.println(st1);
        
        //for one object
        //System.out.println("ID:"+st1.getId());
 	   //System.out.println("Name:"+st1.getName());
 	   //System.out.println("Age:"+st1.getAge());
        

	}

}
