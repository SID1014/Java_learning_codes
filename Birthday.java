
public class Birthday {

  public static void main(String[] args) {
   

    int days = Integer.parseInt(args[0]);
    int trials = Integer.parseInt(args[1]);

    // Initialize counters for each number of people
    long[] peopleCounts = new long[days + 1];

    for (int trial = 0; trial < trials; trial++) {
      int peopleInRoom = 0;
      boolean[] birthdaysSeen = new boolean[days]; // Track seen birthdays

      while (true) {
        peopleInRoom++;
        int birthday =  ((int)(Math.random()*days));
        if (birthdaysSeen[birthday]) {
          break;
        }
        birthdaysSeen[birthday] = true;
      }

      peopleCounts[peopleInRoom]++;
    }

    // Calculate and print results
    double total = 0;
    
    for (int i = 1; i <= days; i++) {
      total += peopleCounts[i];
      double fraction = total / trials;
      if (fraction >= 0.5) {
        System.out.printf("%d\t%d\t%.4f\n", i, peopleCounts[i], fraction);
        break; // Stop once probability reaches or exceeds 50%
      } else {
        System.out.printf("%d\t%d\t%.4f\n", i, peopleCounts[i], fraction);
      }
    }
  }
}