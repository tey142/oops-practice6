interface food{
    public String name();
    public String course();
}
class burger implements food{
    public String name(){
        return "burger";
    }
    public String course(){
        return "main";
    }
}
class icecream implements food{
    public String name(){
        return "ice cream";
    }
    public String course(){
        return "desert";
    }
}
public class w{
    public static void main(String[] args){
        burger b=new burger();
        icecream i=new icecream();
        System.out.println(b.name()+": "+b.course());
        System.out.println(i.name()+": "+i.name());
    }
}