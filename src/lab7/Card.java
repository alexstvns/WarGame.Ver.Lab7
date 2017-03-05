/*
Alex Stevens
3/1/2017
Lab-7 Card Class
1
 */
package lab7;

import javafx.scene.image.ImageView;
import javafx.scene.control.*;
import javafx.scene.image.Image;
/**
 *
 * @author Alex
 */
public class Card 
{
// Private Variables

private Label holdimage = new Label();
private  Image cardImg;
private int cardValue;
private String namehold;
private Suit suit;


public Card()
{
    this("file:img\\155.gif");
}
public Card(String Dir)
{
    this.setImage(Dir);
}

    
private boolean loadCard(String Dir)
{
    cardImg = new Image(Dir);
    
    //ImageView newIm = new ImageView(this.cardImg);
    holdimage.setGraphic(new ImageView(cardImg));
    

    
    return true;
}
public void setImage(String Dir)
{
    
   this.namehold = Dir;
       this.getCardValue(Dir);
       this.getCardValue(Dir);
   this.loadCard(Dir);
    
}
public Label getCard()
{
    return this.holdimage;
}
private void getCardValue(String Dir)
{
  int index=0;

for(int i=0;i<Dir.length();i++)
{
 if(Character.isDigit(Dir.charAt(i))){
     index= i;
     break;
 }
}
  
String dig = Dir.substring(index,index+3);

int val = Integer.parseInt(dig);

if(val >=140)
{
    this.suit = Suit.Spades;
}
else if(val >=127){
    this.suit = Suit.Hearts;
}
else if(val >=114){
    this.suit = Suit.Clubs;
}
else{ 
    this.suit = Suit.Diamonds;
}


  // Mod 13 it
   val = (val-100)%13;
   
   if(val >=10 || val==0){
       this.cardValue = 10;
   }
   else if(val ==1){
       this.cardValue=11;
   }
   else{
       this.cardValue= val;
   }
}

  
  public int getValue()
  {
      return this.cardValue;
  }
  public Suit getSuit()
  {
      return this.suit;
  }


}