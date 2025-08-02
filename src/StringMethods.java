public class StringMethods {
    public static void main(String [] args){
        String name = "Hirunika Nirmani";

//        int length = name.length();
//        char letter = name.charAt(0);
//        int index = name.indexOf("a");
//        int lastIndex = name.lastIndexOf("a");

        //name = name.toUpperCase();
//        name = name.toLowerCase();
//        name = name.trim();
//        name = name.replace("a" , "b");


//        System.out.println(name);
//
//        System.out.println(length);
//        System.out.println(letter);
//        System.out.println(index);
//        System.out.println(lastIndex);

        //System.out.println(name.isEmpty());

        /*
        if (name.isEmpty()){
            System.out.println("Your name is empty");
        }
        else{
            System.out.println("Hello " + name);
        }
         */

        /*
        if(name.contains(" ")){
            System.out.println("Your name contains a space");
        }
        else {
            System.out.println("Your name DOESN'T contain any spaces");
        }
         */

        if (name.equalsIgnoreCase("password")){
            System.out.println("Your name can't be password");
        }
        else{
            System.out.println("Hello " + name);
        }
    }
}
