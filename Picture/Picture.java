
/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael Kölling and David J. Barnes
 * @version 1.1  (24 May 2001)
 */
public class Picture
{
    private Square wall;
    private Square wall1;
    private Square window;
    private Triangle roof;
    private Triangle roof1;
    private Circle sun;
    private Square sky;
    private Square grass;
    private Square tower;
    private Square tower1;
    private Square tower2;
    private Square tower3;
    private Square leftTower;
    private Square rightTower;
    private Square door;
    private Circle door1;
    private Circle lake1;
    private Circle lake2;
    private Square lake;
    private Square lake3;
    private Square leftWindow;
    private Square leftWindow1;
    private Square leftWindow2;
    private Square leftWindow3;
    private Square leftWindow4;
    private Square rightWindow;
    private Square rightWindow1;
    private Square rightWindow2;
    private Square rightWindow3;
    private Square rightWindow4;
    private Square flagPole;
    private Square flagPole1;
    private Triangle flag;
    private Square moat;
    

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        // nothing to do... instance variables are automatically set to null
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        
        //Sky
        sky = new Square();
        sky.changeColor("cyan");
        sky.changeSize(400);
        sky.moveVertical(-150);
        sky.moveHorizontal(-120);
        sky.makeVisible();
        
        
        //Grass
        grass = new Square();
        grass.changeColor("green");
        grass.changeSize(400);
        grass.moveVertical(150);
        grass.moveHorizontal(-150);
        grass.makeVisible();
        
        
        //Lake
        lake1 = new Circle();
        lake1.changeColor("blue");
        lake1.moveHorizontal(190);
        lake1.moveVertical(160);
        lake1.changeSize(50);
        lake1.makeVisible();
        
        lake2 = new Circle();
        lake2.changeColor("blue");
        lake2.moveHorizontal(20);
        lake2.moveVertical(160);
        lake2.changeSize(50);
        lake2.makeVisible();
        
        lake = new Square();
        lake.changeColor("blue");
        lake.moveVertical(120);
        lake.changeSize(100);
        lake.makeVisible();
        
        lake3 = new Square();
        lake3.changeColor("blue");
        lake3.moveVertical(120);
        lake3.moveHorizontal(80);
        lake3.changeSize(100);
        lake3.makeVisible();
        
        //Main Wall
        wall = new Square();
        wall.changeColor("magenta");
        wall.moveVertical(100);
        wall.changeSize(100);
        wall.makeVisible();
        
        wall1 = new Square();
        wall1.changeColor("magenta");
        wall1.moveVertical(100);
        wall1.moveHorizontal(80);
        wall1.changeSize(100);
        wall1.makeVisible();
        
        
        //Left Window
        leftWindow = new Square();
        leftWindow.changeColor("black");
        leftWindow.changeSize(30);
        leftWindow.moveVertical(125);
        leftWindow.moveHorizontal(25);
        leftWindow.makeVisible();
        
        leftWindow1 = new Square();
        leftWindow1.changeColor("white");
        leftWindow1.changeSize(10);
        leftWindow1.moveVertical(128);
        leftWindow1.moveHorizontal(28);
        leftWindow1.makeVisible();
        
        leftWindow2 = new Square();
        leftWindow2.changeColor("white");
        leftWindow2.changeSize(10);
        leftWindow2.moveVertical(128);
        leftWindow2.moveHorizontal(42);
        leftWindow2.makeVisible();
        
        leftWindow3 = new Square();
        leftWindow3.changeColor("white");
        leftWindow3.changeSize(10);
        leftWindow3.moveVertical(142);
        leftWindow3.moveHorizontal(28);
        leftWindow3.makeVisible();
        
        leftWindow4 = new Square();
        leftWindow4.changeColor("white");
        leftWindow4.changeSize(10);
        leftWindow4.moveVertical(142);
        leftWindow4.moveHorizontal(42);
        leftWindow4.makeVisible();
        
        
        //Right Window
        rightWindow = new Square();
        rightWindow.changeColor("black");
        rightWindow.changeSize(30);
        rightWindow.moveVertical(125);
        rightWindow.moveHorizontal(125);
        rightWindow.makeVisible();
        
        rightWindow1 = new Square();
        rightWindow1.changeColor("white");
        rightWindow1.changeSize(10);
        rightWindow1.moveVertical(128);
        rightWindow1.moveHorizontal(128);
        rightWindow1.makeVisible();
        
        rightWindow2 = new Square();
        rightWindow2.changeColor("white");
        rightWindow2.changeSize(10);
        rightWindow2.moveVertical(128);
        rightWindow2.moveHorizontal(142);
        rightWindow2.makeVisible();
        
        rightWindow3 = new Square();
        rightWindow3.changeColor("white");
        rightWindow3.changeSize(10);
        rightWindow3.moveVertical(142);
        rightWindow3.moveHorizontal(128);
        rightWindow3.makeVisible();
        
        rightWindow4 = new Square();
        rightWindow4.changeColor("white");
        rightWindow4.changeSize(10);
        rightWindow4.moveVertical(142);
        rightWindow4.moveHorizontal(142);
        rightWindow4.makeVisible();
        
        //Middle Tower
        flag = new Triangle();
        flag.changeColor("red");
        flag.changeSize(10, 30);
        flag.moveHorizontal(92);
        flag.moveVertical(55);
        flag.makeVisible();
        
        flagPole = new Square();
        flagPole.changeColor("black");
        flagPole.changeSize(40);
        flagPole.moveHorizontal(43);
        flagPole.moveVertical(20);
        flagPole.makeVisible();
        
        flagPole1 = new Square();
        flagPole1.changeColor("cyan");
        flagPole1.changeSize(40);
        flagPole1.moveHorizontal(41);
        flagPole1.moveVertical(20);
        flagPole1.makeVisible();
        
        tower = new Square();
        tower.changeColor("magenta");
        tower.changeSize(50);
        tower.moveVertical(50);
        tower.moveHorizontal(65);
        tower.makeVisible();
        
        tower1 = new Square();
        tower1.changeColor("cyan");
        tower1.changeSize(7);
        tower1.moveVertical(50);
        tower1.moveHorizontal(72);
        tower1.makeVisible();
        
        tower2 = new Square();
        tower2.changeColor("cyan");
        tower2.changeSize(7);
        tower2.moveVertical(50);
        tower2.moveHorizontal(87);
        tower2.makeVisible();
        
        tower3 = new Square();
        tower3.changeColor("cyan");
        tower3.changeSize(7);
        tower3.moveVertical(50);
        tower3.moveHorizontal(102);
        tower3.makeVisible();
        
        
        //Right Tower
        rightTower = new Square();
        rightTower.changeColor("magenta");
        rightTower.changeSize(30);
        rightTower.moveVertical(70);
        rightTower.moveHorizontal(150);
        rightTower.makeVisible();
        
        roof = new Triangle();
        roof.changeColor("yellow");
        roof.changeSize(30, 50);
        roof.moveHorizontal(25);
        roof.moveVertical(75);
        roof.makeVisible();
        
        
        //Left Tower
        leftTower = new Square();
        leftTower.changeColor("magenta");
        leftTower.changeSize(30);
        leftTower.moveVertical(70);
        leftTower.makeVisible();
        
        roof1 = new Triangle();
        roof1.changeColor("yellow");
        roof1.changeSize(30, 50);
        roof1.moveHorizontal(175);
        roof1.moveVertical(75);
        roof1.makeVisible();
        
        
        //Door
        door = new Square();
        door.changeColor("black");
        door.moveHorizontal(75);
        door.moveVertical(170);
        door.makeVisible();
        
        door1 = new Circle();
        door1.changeColor("black");
        door1.moveHorizontal(115);
        door1.moveVertical(150);
        door1.makeVisible();
        
        //Moat
        moat = new Square();
        moat.changeColor("gray");
        moat.moveVertical(200);
        moat.moveHorizontal(75);
        moat.makeVisible();


        sun = new Circle();
        sun.changeColor("yellow");
        sun.moveHorizontal(180);
        sun.moveVertical(-10);
        sun.changeSize(60);
        //sun.makeVisible();
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        if(wall != null)   // only if it's painted already...
        {
            wall.changeColor("black");
            window.changeColor("white");
            roof.changeColor("black");
            sun.changeColor("black");
        }
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        if(wall != null)   // only if it's painted already...
        {
            wall.changeColor("red");
            window.changeColor("black");
            roof.changeColor("green");
            sun.changeColor("yellow");
        }
    }

}
