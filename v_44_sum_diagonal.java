public class v_44_sum_diagonal {
    public static int sumDiagonalElements(int[][] array) {
      int sums = 0;
      int rows = array.length;
      for(int  i =0;i<rows;i++){
          sums+=array[i][i];
      }
      return sums;
  }
}