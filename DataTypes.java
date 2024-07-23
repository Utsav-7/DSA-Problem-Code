public class DataTypes{
    public static void main(String[] args){
        byte a=1;               // 1 byte       
        boolean d=false;        // 1 byte

        short b=103;            // 2 byte
        char c= 'a';            // 2 byte
        
        int e=210;              // 4 byte    
        float g=22.3f;          // 4 byte
        
        long f=2323;            // 8 byte
        double h=213.1d;        // 8 byte

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);        
     
        int ch=(char)c;
        System.out.println(ch);
        char num=(char)98;
        System.out.println(num);
    }
   

}