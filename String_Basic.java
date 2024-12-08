package Java_Code;

public class String_Basic {
    public static void main(String[] args) {
        String firstName="Vaduni";
        String lastName="Niranjan";
        String name="Vaduni";
        String name2="vaduni";
        String name3=new String ("Vaduni");

        //concatenation
        String fullName=firstName+" "+lastName;
        System.out.println(fullName);

        //length()
        System.out.println(fullName.length());

        //charAt()
        for(int i=0;i<fullName.length();i++){
        System.out.println(fullName.charAt(i));
        }

        //compareTo()
        if(firstName.compareTo(name)==0){
            System.out.println("strings are equal");
        }

        //equals()
        System.out.println(fullName.equals(name));

        //equalsIgnoreCase()
System.out.println(name.equalsIgnoreCase(name2));

//operator ==
System.out.println(name==name3);

//substring(beg index,end index)
System.out.println(fullName.substring(2,9));
    }
}
