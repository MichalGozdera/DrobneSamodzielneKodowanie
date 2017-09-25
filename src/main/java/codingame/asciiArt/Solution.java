package codingame.asciiArt;
import java.util.*;
/*
In stations and airports you often see this type of screen:

Have you ever asked yourself how it might be possible to simulate this display on a good old terminal? We have: with ASCII art!
 	Rules

ASCII art allows you to represent forms by using characters. To be precise, in our case, these forms are words. For example, the word "MANHATTAN" could be displayed as follows in ASCII art:


# #  #  ### # #  #  ### ###  #  ###
### # # # # # # # #  #   #  # # # #
### ### # # ### ###  #   #  ### # #
# # # # # # # # # #  #   #  # # # #
# # # # # # # # # #  #   #  # # # #

?Your mission is to write a program that can display a line of text in ASCII art in a style you are given as input.

 	Game Input

Input
Line 1: the width L of a letter represented in ASCII art. All letters are the same width.

Line 2: the height H of a letter represented in ASCII art. All letters are the same height.

Line 3: The line of text T, composed of N ASCII characters.

Following lines: the string of characters ABCDEFGHIJKLMNOPQRSTUVWXYZ? Represented in ASCII art.

Output
The text T in ASCII art.
The characters a to z are shown in ASCII art by their equivalent in upper case.
The characters that are not in the intervals [a-z] or [A-Z] will be shown as a question mark in ASCII art.
Constraints
0 < L < 30
0 < H < 30
0 < N < 200
Example 1
Input
4
5
E
 #  ##   ## ##  ### ###  ## # # ###  ## # # #   # # ###  #  ##   #  ##   ## ### # # # # # # # # # # ### ###
# # # # #   # # #   #   #   # #  #    # # # #   ### # # # # # # # # # # #    #  # # # # # # # # # #   #   #
### ##  #   # # ##  ##  # # ###  #    # ##  #   ### # # # # ##  # # ##   #   #  # # # # ###  #   #   #   ##
# # # # #   # # #   #   # # # #  #  # # # # #   # # # # # # #    ## # #   #  #  # # # # ### # #  #  #
# # ##   ## ##  ### #    ## # # ###  #  # # ### # # # #  #  #     # # # ##   #  ###  #  # # # #  #  ###  #
Output
###
#
##
#
###
 */

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int L = in.nextInt();
        int H = in.nextInt();
        if (in.hasNextLine()) {
            in.nextLine();
        }
        char[][] art = new char[H][];
        String T = in.nextLine();
        for (int i = 0; i < H; i++) {
            String ROW = in.nextLine();
            art[i] = ROW.toCharArray(); //zapisujemy wszystko do tablicy
        }
        char[] napis = T.toCharArray();
        for (int i = 0; i < napis.length; i++) {
            if ((napis[i] > 122 || napis[i] < 65) || (napis[i] > 90 && napis[i] < 97)) //wy³apujemy wszystkie nieliterki
                napis[i] = 91; //w tablicy artystycznej znak ? jest po Z. Z ma kod ASCII 90, wiêc chc¹c u¿ywaæ ? z tablicy artystycznej dajemy mu kod 91.
            if (napis[i] < 123 && napis[i] > 96) //ma³e literki zamieniamy na du¿e
                napis[i] = Character.toUpperCase(napis[i]);
        }


        // Write an action using System.out.println()
        // To debug: System.err.println("Debug messages...");

        for (int i = 0; i < H; i++)
            printrow(napis, art, L, i); //wyœwietlenie artystycznej tablicy wg rzêdów
    }

    public static void printrow(char[] napis, char[][] art, int L, int H) {

        for (int i = 0; i < napis.length; i++) { //iteracja po literkach z napisu podanego

            for (int j = (napis[i] - 65) * L; j < (napis[i] - 64) * L; j++) //iteracja po pozycji w tablicy artycznej. Pozycja w tablicy danej literki to jej kod ASCII pomniejszony o 64 i pomno¿ony o "gruboœæ" literki
            {
                System.out.print(art[H][j]);
            }
        }
        System.out.println(); //zamkniêcie wiersza
    }
}