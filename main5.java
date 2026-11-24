interface Resizable
{
    void resizeWidth(int width);
    void resizeHeight(int height);
}

class Rectangle implements Resizable
{
    private int width;
    private int height;

    public Rectangle(int width,int height)
    {
        this.width = width;
        this.height = height;
    }

    public void resizeWidth(int width)
    {
        if(width > 0)
        {
            this.width = width;
        }
        else
        {
            System.out.println("Invalid width. Width must be greater than 0.");
        }
    }

    public void resizeHeight(int height)
    {
        if(height > 0 )
        {
            this.height = height;
        }
        else
        {
            System.out.println("Invalid height. Height must be greater than 0.");
        }
    }
    public void display()
    {
        System.out.println("Rectangle:Width="+ width +",Height="+ height);
    }
}
public class main5 {
public static void main(String[] args) {
    Rectangle rec = new Rectangle(10,20);
    System.out.println("Original Rectangle");
    rec.display();

    rec.resizeWidth(15);
    rec.resizeHeight(25);

    System.out.println("Resized Rectangle:");
    rec.display();
   }
}