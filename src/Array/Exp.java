package Array;

public class Exp {

    public static void main(String[] args) {

            int num1[]= new int[] {2,21,4,56,12,10,8,2,12,10,21,21,21,21};

    int num2[]=new int[]{12,8,2,10,56,12,8,8,12,4,12};

    int max = num1[0];

    for(int i=0;i<num1.length-1;i++){

            if (max < num1[i+1]){

                    max = num1[i+1];

            }

    }
    
    System.out.println(max);

/*    for(int i=0;i<num2.length-1;i++){

            if (max < num2[i+1]){

                    max = num2[i+1];

            }

    }*/

    int out[] = new int[max+1];

    for(int i=1;i<=out.length;i++){

            for(int j=0;j<num1.length;j++){

                    if(i==num1[j])

                            out[i] = out[i] + 1;

                   /* if(i==num2[j])

                            out[i] = out[i] + 1;*/

            }

    }
    
    for (int i : out) {
        // fruit is an element of the `fruits` array.
    	System.out.println(out[i] + "   " + num1[i] + "  " + i);
    //	System.out.println();
    }

    for(int i=1;i<=max;i++){

            if(out[i]>0)

    System.out.println("num "+i+ " comes "+out[i]+" times.");

    }

}

}