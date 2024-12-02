public class infiniteloop
{
    public static void infinite()
    {
        int i=1;
       do
       {
        System.out.println(i);
        i++;
       }while(i>0);
    }
        public static void main(String[] args) {
        infinite();  
    }
}
