package JavaVeriables;

public class _01_StringInfo {
    public static void main(String[] args) {
//////////////////////////////////////////////////////////////////////////////////

        String s1 = "Hello";
        String s2 = "HELLO";
        boolean eguals1 = s1.equals(s2);
        System.out.println("Eguals? = " + eguals1); //false
        System.out.println("s1.equals(s2)=" + s1.equals(s2)); //false
        System.out.println("s1.equals(Hello=)" + s1.equals("Hello")); //true

/////////////////////////////////////////////////////////////////////////////////

        String s3 = "Hello";
        System.out.println("s3.isEmpty() = " + s3.isEmpty()); // false
        String s4 = " ";  //a character such as the space character A
        System.out.println("s4.isEmpty() = " + s4.isEmpty()); // false
        String s5 = ""; //there is nothing, so bosh, so empty
        System.out.println("s5.isEmpty() = " + s5.isEmpty()); //true
//////////////////////////////////////////////////////////////////////////////////

        // works like indexof bash this search from bash
        // lastIndexof bash the search after the end

        //         0123456
        String s6 = "Merhaba";
        System.out.println("s6.indexOf(a) = " + s6.indexOf("a")); //4
        System.out.println("s6.lastIndexOf(a) = " + s6.lastIndexOf("a"));// 6
        // index is always one only search direction

//////////////////////////////////////////////////////////////////////////////////

//It does the process of getting a certain part of the string

        //           012345678901234567
        String s7 = "Goog moorning Friends";
        String pice1 = s7.substring(3, 9);
        System.out.println("Pice1 = " + pice1);
        String pice2 = s7.substring(8, 15);// 8 to 15 but not 15
        System.out.println("Pice2 = " + pice2);
        String s8 = s7.substring(8); // it starts from what is given and takes it to the end

//////////////////////////////////////////////////////////////////////////////////

        String text = "HCL Technology";
        System.out.println("text.startsWith(HC) = " + text.startsWith("HC"));// true);
        System.out.println("text.startsWith(te) = " + text.startsWith("te")); // falce
        System.out.println("text.startsWith(h) = " + text.startsWith("h")); // falce

//////////////////////////////////////////////////////////////////////////////////

        String text1 = "Good morning";
        System.out.println("text.endsWith(ng) = " + text.endsWith("ng")); // true
        System.out.println("text.endsWith(n) = " + text.endsWith("n")); //false
        System.out.println("text.endsWith(A) = " + text.endsWith("A")); //false
        System.out.println("text.endsWith(morning) = " + text.endsWith("morning"));// true

//////////////////////////////////////////////////////////////////////////////////

        // TOLOWERCASE -> converts string to lowercase

        String text2 = "Hello World";
        System.out.println("Original text2 = " + text2); //Hello World
        System.out.println("text2 = " + text2.toLowerCase());  //hello world
        System.out.println("text2 = " + text2); // If we don't assign it, it won't change.

//////////////////////////////////////////////////////////////////////////////////

        // ToUpperCase converts string to uppercase

        String text3 = "Good Morning";
        System.out.println("Original text3=" + text3); //Good Morning
        System.out.println("text3.toUpperCase() = " + text3.toUpperCase()); //GOOD MORNING

//////////////////////////////////////////////////////////////////////////////////

        //repleace ->replaces the character in a string with the given

        String text4 = "Hello world";
        System.out.println(" Original text4=" + text4);
        System.out.println("text4.replace(o,e) = " + text4.replace("o", "e"));//Helle werld
        System.out.println("text4.replace(lo,do) = " + text4.replace("lo", "do")); //Heldo world
        System.out.println("text4.replace(world,Java) = " + text4.replace("world", "Java")); //Hello Java
        System.out.println("text4.replace(o, ) = " + text4.replace("o", "")); // o deleted

//////////////////////////////////////////////////////////////////////////////////

        // replaceFirst replaces the characters in a string with the given one only the first one(the first thing you found)

        String text5 = "Java first";
        System.out.println(" Original text5 = " + text5);
        System.out.println("text5.replaceFirst(a,e) = " + text5.replaceFirst("a", "e"));
        System.out.println("text5.replaceFirst(va,de) = " + text5.replaceFirst("va", "de"));
        System.out.println("text5.replaceFirst(first,second) = " + text5.replaceFirst("first", "second"));
        System.out.println("text5.replaceFirst(a,'') = " + text5.replaceFirst("a", "")); // first

//////////////////////////////////////////////////////////////////////////////////

        // ReplaceAll : It works like replace. difference criterion (regex) can be given
        // regex : regular expression

        String text6 = "Hello  world 123";
        System.out.println("text6 = " + text6); // orjinal vercion
        System.out.println("Her -> _  = " + text6.replaceAll("[Her]", "_")); // __llo  wo_ld 123
        System.out.println("A-Z -> _  = " + text6.replaceAll("[A-Z]", "_")); //  _ello  world 123
        // Make capital letters _ from A to Z
        System.out.println("0-9 -> _  = " + text6.replaceAll("[0-9]", "")); // Hello  world
        System.out.println("0-9 dışındakile -> _  = " + text6.replaceAll("[^0-9]", "")); //1 23


    }


}

