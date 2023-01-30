class Pattern_PWSkills{
    public static void main(String[] args) {
     System.out.println("\n\n------ Pattern Of PW SKILLS ------\n\n");
     int n =  5;
     for(int i=0; i<n; i++)
     {
        for(int j=0; j<n; j++)
        {
            if(i==0 || i==(n-1)/2 || j==0 || j==(n-1) && i<=(n-1)/2)
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
            if(i==n-1||j==0||j==(n-1)/2||j==n-1)
            {
                System.out.print("*");
            }
            else
            {
                System.out.print(" ");
            }
        }
        System.out.print("\t\t");
        for(int j=0; j<n; j++)
        {
            if(i==0||i==(n-1)/2||i==n-1||j==0&&i<=(n-1)/2||j==(n-1)&&i>=(n-1)/2)
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
            if(j==0 || i+j==(n-1)/2 || i-j==(n-1)/2)
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
            if(i==0||i==n-1||j==(n-1)/2)
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
            if(i==n-1||j==0)
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
            if(i==n-1||j==0)
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
            if(i==0||i==(n-1)/2||i==n-1||j==0&&i<=(n-1)/2||j==(n-1)&&i>=(n-1)/2)
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
     System.out.println("\n\n\n");
    }
}