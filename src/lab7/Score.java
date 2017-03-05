/*
 Alex Stevens
Lab 7 - Score Class 
3/1/2017
Csis 123B-3183
0495503
 */
package lab7;

/**
 *
 * @author alder
 */
public class Score {
    
    static int rightScore=0;
      static int leftScore=0;
    
    
     public static void setRightScore(int y){
        
        Score.rightScore +=y;
        
        
    }
    
    
     public static void setRightScore(String x){
        
        int set = Integer.parseInt(x);
        Score.setRightScore(set);
        
        
    }
    
     public static void setLeftScore(int z){
        
        Score.leftScore +=z;
        
    }
    
    public static void setLeftScore(String a){
        
        int set = Integer.parseInt(a);
        Score.setLeftScore(set);
        
    }
    
    
     public static int getRightScore(){
        
        return rightScore;
    }
    
     public static int getLeftScore(){
        
        return leftScore;
        
    }
    
     public static void resetScore(){
        
        Score.leftScore =0;
        Score.rightScore=0;
        
    }
}
