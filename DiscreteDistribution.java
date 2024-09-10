/***public class DiscreteDistribution {

    public static void main(String[] args) {
        
        int []num;
        int []sum;
        int csum = 0;
        num = new int[args.length - 1];
        sum =new int[num.length];


        //input array of distribution
        int m = Integer.parseInt( args[0]);
    
        for(int i=1; i< args.length ;i++){
            if (args[i]!= null){
            num[i-1]=Integer.parseInt(args[i]);
            }
        }

        for(int i=0; i< num.length ;i++){

            csum+=num[i];
            sum[i]=csum;
        }
       // for( int i=0 ;i< sum.length ; i++){
        //    System.out.print(sum[i]+"\t");

       // }
        for(int i=0;i<= m;i++){
            double r = (csum-1)*Math.random();
            for (int j=1 ; j<= sum.length ; j++){
                if(sum[j-1]< r && r <= sum[j]){
                    System.out.print(j+"\t");
                    break;

                }
            }
        }



    }

    
}*/
public class DiscreteDistribution {

    public static void main(String[] args) {
      // Check for valid arguments
      if (args.length < 2) {
        System.err.println("Usage: java DiscreteDistribution m a1 a2 ... an");
        return;
      }
  
      // Get number of samples and frequencies
      int m = Integer.parseInt(args[0]);
      int[] frequencies = new int[args.length - 1];
      for (int i = 1; i < args.length; i++) {
        frequencies[i - 1] = Integer.parseInt(args[i]);
        if (frequencies[i - 1] <= 0) {
          System.err.println("Error: Frequencies must be positive integers.");
          return;
        }
      }
  
      // Calculate cumulative sum for efficient random index selection
      int[] cumulativeSum = new int[frequencies.length];
      cumulativeSum[0] = frequencies[0];
      for (int i = 1; i < frequencies.length; i++) {
        cumulativeSum[i] = cumulativeSum[i - 1] + frequencies[i];
      }
  
      // Generate m random indices
      for (int i = 0; i < m; i++) {
        // Generate random number between 0 (inclusive) and total sum (exclusive)
        int randomValue = (int) (Math.random() * cumulativeSum[cumulativeSum.length - 1]);
  
        // Find the index where random value falls within its cumulative range
        int selectedIndex = 0;
        while (selectedIndex < cumulativeSum.length - 1 && randomValue >= cumulativeSum[selectedIndex]) {
          selectedIndex++;
        }
  
        // Print the selected random index
        System.out.print(selectedIndex + " ");
      }
      System.out.println();
    }
  }