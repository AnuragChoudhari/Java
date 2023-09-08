package Strings;

// Strings are immutable in java
// Java string methods
// 1) name.length();
// 2) name.toUpperCase();
// 3) name.toLowerCase();
// 4) name.trim();
// 5) name.substring(start_index, end_index);
// 6) name.replace(char to be replaced, char to replace with);

class Main{
    public static void main(String[]args){
        String name = "Anurag";
        String spaced_name = "    Anurag     ";

        System.out.println("The length of the strings is : " + name.length());

        System.out.println("String method toUpperCase: " + name.toUpperCase());
        System.out.println("String method toLowerCase: " + name.toLowerCase());
        
        System.out.println("String using without trim method: " + spaced_name);

        System.out.println("After using trim method:  " + spaced_name.trim());

        System.out.println("Substring method: " + name.substring(0, 3));
    }
}

