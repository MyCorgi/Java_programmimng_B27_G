package day12_switch_statement;

import java.util.Scanner;

/*
[Author] - Look at Starbucks from class for an idea
You are an author. You are writing a book and want to figure out some information related to the genre of book you are writing.
Given the genre name figure out: average page length, average profit, average number of sequels, average number of countries published in. Find and print the information based on the genre.
Make variables for all of that information. Given empty defaults for all the variables
    Data based on genre:
       genre - Fantasy
        page length - 500
        profit - 1,000,000
        sequels - 5
        countries - 50

        genre - Detective
        page length - 350
        profit - 700,000
        sequels - 3
        countries - 45

        genre - Science Fiction
        page length - 720
        profit - 900,500
        sequels - 4
        countries - 30

        genre - Short Story
        page length - 150
        profit - 300,000
        sequels - 1
        countries - 40
 */
public class Author {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your favorite genre of the book you would like to write");
        String genre = input.nextLine().toLowerCase();
        int pageLength = 0;
        int profit = 0;
        int sequels = 0;
        int countries = 0;

        switch (genre) {
            case "fantasy":
                pageLength = 500;
                profit = 1_000_000;
                sequels = 5;
                countries = 50;
                break;
            case "detective":
                pageLength = 350;
                profit = 700_000;
                sequels = 3;
                countries = 45;
                break;
            case "science fiction":
                pageLength = 720;
                profit = 900_500;
                sequels = 4;
                countries = 30;
                break;
            case "short story":
                pageLength = 150;
                profit = 300_000;
                sequels = 1;
                countries = 40;
                break;


        }
        System.out.println("genre = " + genre);
        System.out.println("pageLength = " + pageLength);
        System.out.println("profit = " + profit);
        System.out.println("sequels = " + sequels);
        System.out.println("countries = " + countries);

    }
}
