class polygon{
    public void render(){
        System.out.println("Rendering polygon...");
    }
}
class Rectangle extends polygon{
    public void render(){
        System.out.println("Rendering rectangle...");
    }
}
class Square extends polygon{
    public void render(){
        System.out.println("Rendering Square...");
    }
}
class Main{
    public static void main(String[] args){

        Square s1=new Square();
        s1.render();
        Rectangle r1=new Rectangle();
        r1.render();
    }
}