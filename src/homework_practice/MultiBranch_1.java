package homework_practice;

import java.util.Scanner;

public class MultiBranch_1 {
    public static void main(String[] args) {
        /*
        create a class ChooseLanguage
ask the user to enter a number based on the language they wanted to use.
	1 - English
	2 - Spanish
	3 - Turkish
	4 - Russian
	5 - French
based on the number they picked print a message:
	1 : "hello, thank for your call"
    2 : "hola, gracias para llamar"
    3 : "merhaba, aradiginiz icin tesekkurler"
    4 : "privet, spasibo za vash zvonok"
    5 : "Merci ,pour votre appel"
    any other number: "We will use English by default"
   Extra: add your own options
         */
        Scanner input = new Scanner (System.in);
        System.out.println("Enter your language. \n1 - English \n2 - Spanish \n3 - Turkish \n4 - Russian \n5 - French");
        int language = input.nextInt();
        if (language==1) {
            System.out.println("hello, thank for your call");
        } else if (language==2) {
            System.out.println("hola, gracias para llamar");
        }else if (language==3) {
            System.out.println("merhaba, aradiginiz icin tesekkurler");
        }else if (language==4) {
            System.out.println("privet, spasibo za vash zvonok");
        }else if (language==5) {
            System.out.println("Merci ,pour votre appel");
        }

        System.out.println("=============================================");

        String[] reply = {"hello, thank for your call","hola, gracias para llamar", "merhaba, aradiginiz icin tesekkurler","privet, spasibo za vash zvonok","Merci ,pour votre appel"};
        System.out.println(reply[language-1]);






    }

}
