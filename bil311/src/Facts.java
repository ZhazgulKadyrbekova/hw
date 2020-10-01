/*

Small program to search fun facts.

Facts' source:
    https://kids.niehs.nih.gov/games/riddles/jokes/fun-facts-and-trivia/index.htm

 */

import java.util.Scanner;

public class Facts {
    public static void main(String[] args) {
        String[] facts = {"It is impossible for most people to lick their own elbow.",
                "A crocodile cannot stick its tongue out.",
                "A shrimp's heart is in its head.",
                "It is physically impossible for pigs to look up into the sky.",
                "The \"sixth sick sheik's sixth sheep's sick\" is believed to be the toughest tongue twister in the English language.",
                "If you sneeze too hard, you could fracture a rib.",
                "Wearing headphones for just an hour could increase the bacteria in your ear by 700 times.",
                "In the course of an average lifetime, while sleeping you might eat around 70 assorted insects and 10 spiders, or more.",
                "Some lipsticks contain fish scales.",
                "Cat urine glows under a black-light.",
                "Like fingerprints, everyone's tongue print is different.",
                "Rubber bands last longer when refrigerated.",
                "There are 293 ways to make change for a dollar.",
                "The average person's left hand does 56% of the typing (when using the proper position of the hands on the keyboard; Hunting and pecking doesn't count!).",
                "A shark is the only known fish that can blink with both eyes.",
                "The longest one-syllable words in the English language are \"scraunched\" and \"strengthed.\" Some suggest that \"squirreled\" could be included, but squirrel is intended to be pronounced as two syllables (squir-rel) according to most dictionaries. \"Screeched\" and \"strengths\" are two other long one-syllable words, but they only have 9 letters.",
                "\"Dreamt\" is the only English word that ends in the letters \"mt\".",
                "Almonds are a member of the peach family.",
                "Maine is the only state that has a one-syllable name.",
                "There are only four words in the English language which end in \"dous\": tremendous, horrendous, stupendous, and hazardous.",
                "Los Angeles' full name is \"El Pueblo de Nuestra Senora la Reina de los Angeles de Porciuncula\"",
                "A cat has 32 muscles in each ear.",
                "An ostrich's eye is bigger than its brain.",
                "Tigers have striped skin, not just striped fur.",
                "In many advertisements, the time displayed on a watch is 10:10.",
                "The characters Bert and Ernie on Sesame Street were named after Bert the cop and Ernie the taxi driver in Frank Capra's \"It's a Wonderful Life.\"",
                "A dime has 118 ridges around the edge.",
                "The giant squid has the largest eyes in the world.",
                "Most people fall asleep in seven minutes.",
                "\"Stewardesses\" is the longest word that is typed with only the left hand."
        };

        int len = facts.length, max, imax, n = 1;

        Scanner in = new Scanner(System.in);

        while (n != 0) {
            int[] counter = new int[len];
            max = 0;
            imax = -1;
            System.out.println("Type a word to learn interesting fact about it:");
            String search = in.next();

            for (int i = 0; i < len; i++) {
                String[] words = facts[i].toLowerCase().replaceAll("[^a-z]", " ").split(" ");
                for (int j = 0; j < words.length; j++) {

                    if (words[j].equals(search))
                        counter[i]++;


                }
                if (counter[i] > max) {
                    max = counter[i];
                    imax = i;
                }
            }

            if (imax != -1) {
                System.out.println(facts[imax]);
            } else {
                System.out.println("Sorry, there is no fact about " + search);
            }

            System.out.println("Press 1 to enter another word or 0 to exit:");
            n = in.nextInt();
        }


    }
}