 interface area {
     float pi=3.14f;
     float compute(float x,float y);
}
 class rectangle implements area{
    public float compute(float x,float y){
        return (x*y);
    }

}
 class square implements area{
    public float compute(float x,float y){
        return(x*x);
    }
}
 class circle implements area{
    @Override
    public float compute(float x, float y) {
        return(pi*x*x);
    }
}
 class main{
    public static void main(String args[]){
        rectangle a= new rectangle();
       float d= a.compute(10,20);
        square b=new square();
      float e=  b.compute(10,0);
        circle c=new circle();
      float f=  c.compute(8,0);
      System.out.println( d+ " " +e+ " "+ f);
        }
    }

