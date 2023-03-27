package carpetcostcalculator;
public class Floor
{
    double width;
    double length;

    public Floor(double width,double length) //instance method
    {
        this.width= width;
        this.length=length;
        if(width<0 && length<0) //condition for check length and width
        {
            this.length=0;
            this.width=0;
        }
    }
    public double getArea() //
    {
        return width*length; //return width and length multiplication
    }
}
