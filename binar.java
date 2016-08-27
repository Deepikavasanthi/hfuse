Scanner sc=new Scanner(System.in);
   int n=sc.nextInt();
        int[] a=new int[n]; int count=0,n1,n3,t;
       String[] b=new String[n];
       int[] k=new int[20];
  for(int i=0;i<n;i++){
  a[i]=sc.nextInt();
    }  for(int j=0;j<n;j++){
        b[j]=Integer.toBinaryString(a[j]);
     k[j]=Integer.parseInt(b[j]);
        System.out.println(k[j]);
  }int[] d=new int[n];int[] z=new int[n];
  for(int i=0;i<n;i++){      
     count=0;
      n3=k[i];
      while(n3!=0){
      n1=n3%10;   
      if(n1==1){count++;
          
          }n3=n3/10;
      }
      d[i]=count;
      System.out.println(""+d[i]);}
          for(int i=0;i<n;i++){
             for(int j=i+1;j<n;j++){
                
             if(d[i]<d[j]){t=a[i];
                 a[j]=a[i];
                 a[j]=t;
             }
             if(d[i]==d[j]){
             if(a[i]<a[j]){t=a[i];
                 a[j]=a[i];
                 a[j]=t;
             }}
                 
     }}
         for(int i=0;i<n;i++){
         System.out.println(a[i]);