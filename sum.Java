public class One{

    public static void main(String args[]){

        double a=1,b=1,c=0;

        System.out.println("for循环:");

        for(c=0,b=1,a=1;a<=10;a++)

        {

            b*=(1.0/a);

            c+=b;

        }

        System.out.println(c);

        System.out.println("do-while循环:");

        do{

            c=b+c;

            a++;

            b=(1.0/a)*b;

        }  while(a<=10);

        System.out.println(c);

    }

}

