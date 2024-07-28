
public class v_45_best_score {
    public static int[] findTopTwoScores(int[] array){
      // TODO
      if(array.length<2){
          throw new IllegalArgumentException("Your Array should contain more than one element");
      }
      int firstBest = Integer.MIN_VALUE;
      int secondBest = Integer.MIN_VALUE;
      
      for(int i=0;i<array.length;i++){
          int score = array[i];
          if(score>firstBest){
              secondBest = firstBest;
              firstBest = score;
  
          }
          else if (score>secondBest && score!=firstBest){
              secondBest = score;
          }
  
      }
              return new int[]{firstBest,secondBest};
    }
  
  }