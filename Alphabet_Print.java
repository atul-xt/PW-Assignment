class Alphabet_Print{
    public static void main(String[] args) {
        System.out.println("\n\n------ Patterns Of A,B,C,D,E,F,G,H ------\n\n");
        int n = 7;

        for(int i=0; i<n; i++)
        {
         for(int j=0; j<n; j++)
         {
            if(i==0||i==(n-1)/2||j==0||j==n-1)
            {
               System.out.print("*");
            }
            else
            {
               System.out.print(" ");
            }
         }
         System.out.print("  ");
         for(int j=0; j<n; j++)
         {
            if(i==0||i==(n-1)/2||i==n-1||j==0||j==n-1)
            {
               System.out.print("*");
            }
            else
            {
               System.out.print(" ");
            }
         }
         System.out.print("  ");
         for(int j=0; j<n; j++)
         {
            if(i==0||i==(n-1)||j==0)
            {
               System.out.print("*");
            }
            else
            {
               System.out.print(" ");
            }
         }
         System.out.print("  ");
         for(int j=0; j<n; j++)
         {
            if(i==0||i==(n-1)||j==0||j==n-1)
            {
               System.out.print("*");
            }
            else
            {
               System.out.print(" ");
            }
         }
         System.out.print("  ");
         for(int j=0; j<n; j++)
         {
            if(i==0||i==(n-1)/2||i==n-1||j==0)
            {
               System.out.print("*");
            }
            else
            {
               System.out.print(" ");
            }
         }
         System.out.print("  ");
         for(int j=0; j<n; j++)
         {
            if(i==0||i==(n-1)/2||j==0)
            {
               System.out.print("*");
            }
            else
            {
               System.out.print(" ");
            }
         }
         System.out.print("  ");
         for(int j=0; j<n; j++)
         {
            if(i==0||i==n-1||j==0||i==(n-1)/2&&j>=(n-1)/2||j==n-1&&i>=(n-1)/2)
            {
               System.out.print("*");
            }
            else
            {
               System.out.print(" ");
            }
         }
         System.out.print("  ");
         for(int j=0; j<n; j++)
         {
            if(i==(n-1)/2||j==0||j==(n-1))
            {
               System.out.print("*");
            }
            else
            {
               System.out.print(" ");
            }
         }
         System.out.println();
        }
    }
}