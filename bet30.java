Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();int n,n1,count=0,c;
        for(int i=10;i<=a;i++){
              n=i;
            while(n!=0){
                n1=i%10;
                if(n1==2){
                    count++;
                n=n/10;}
            }
        }c=count+1;
        System.out.println(c); 
    }