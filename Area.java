package sanfoundry;

public class Area {

        int width=1;
        int length=2;
        int volume=3;
        int height=4;
        
       void area() 
        {
           width=5;
           length=6;
        }
        void volume() 
        {
             volume = width*length*height;
        } 
        

        public static void main(String args[])
        {
            Area obj = new Area();
            obj.volume();
            System.out.println(obj.volume);        
        } 
    }