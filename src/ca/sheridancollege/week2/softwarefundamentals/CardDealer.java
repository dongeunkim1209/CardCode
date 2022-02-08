/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week2.softwarefundamentals;

/**
 * The class where we create Cards
 *
 * @author Dong Eun Kim, 991647641
 */
public class CardDealer
{
   public static void main (String[] args)
   {
      Card nineClubs = new Card("Clbs", 9);
      nineClubs.setSuit("diamonds");
      
      Card c1 = new Card("Jack", 7);
      c1.setSuit("Hearts");
      
      System.out.println(c1.getSuit());
      System.out.println(c1.getValue());
   }
}
//i add comments..
