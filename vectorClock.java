import java.util.*;

class vectorClock
{
public static void main(String[] args)
{
int i,j,count1 = 0, count2 = 0;

int M1[] = new int[3];
int M2[] = new int[3];

Scanner sc = new Scanner(System.in);

System.out.println("Enter all the three counters for M1");

for(i=0; i<3; i++)
{
  M1[i] = sc.nextInt();
}


System.out.println("Enter all the three counters for M2");

for(i=0; i<3; i++)
{
  M2[i] = sc.nextInt();
}



for(i = 0,j = 0; i<3 && j<3 ; i++)
{
 if(M1[i]<=M2[j])
{
    count1++;
    j++;  
}
}

for(i = 0,j = 0; i<3 && j<3 ; i++)
{
 if(M1[i]>=M2[j])
{
    count2++;
    j++;  
}
}


if(count1 == 3)
  System.out.println("M1 happened before M2");
else if(count2 == 3)
  System.out.println("M2 happened before M1");
else
  System.out.println("M1 and M2 happened concurrently");
}
}
                