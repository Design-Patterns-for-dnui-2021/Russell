# Tank War  
### Version 1.0 : Generate a Window  
a). Function: generate a window  
b). Class and method naming conventions :   
- The first letter of the class must be uppercase 
- The first letter or word in methods and variables must be in lowerCamelCase ex: ```keyPressed()```

c). There are two ways to display window:
- Define a separate Frame object
- Write a class and inherit from Frame class  
```java
public class TankClient extends Frame {
    public static void main(String[] args) {
        TankClient tc = new TankClient();
        tc.launchFrame();
    }

    public void launchFrame() {
        this.setLocation(300, 100);
        this.setSize(800, 600);
        this.setVisible(true);
        this.setTitle("Tank War Game");
    }

    public void paint(Graphics g) {}

    public void update(Graphics g) {}
}
```

### Version 2.0 : Configure Window 
a). Function: configure window attributes and behaviour  
b). Add window closing behaviour using ```System.exit(0)``` on ```lauchFrame()``` method  
c). Add window background color, size, visibility, location and resizable attributes  
```java
public void launchFrame() {
    this.setLocation(300, 100);
    this.setSize(GAME_WIDTH, GAME_HEIGHT);
    this.setVisible(true);
    this.setTitle("Tank War Game");
    this.addWindowListener(new WindowAdapter() {
        @Override
        public void windowClosing(WindowEvent e) {
            System.exit(0);
        }
    });
    this.setResizable(false);
    this.setBackground(Color.DARK_GRAY);
}
```

### Version 3.0 : Draw / Paint a Tank  
a). Function: Paint a tank in the window frame  
b). Using java graphics object to set the shape and color attributes of the tank  
c). Draw the tank inside ```paint()``` method in class ```TankClient``` using oval shape  
d). Specify the oval shape position and color using ```setColor()``` and ```fillOval()```  
e). Make a thread called ```PaintThread``` to always repaint the Frame/Window to reflect upon value changes like shape position  
f). Override ```update()``` method to manage offscreen image to mimic the default frame background
```java
public void paint(Graphics g) {
    Color c = g.getColor();
    g.setColor(Color.RED);
    g.fillOval(this.x, this.y, 30, 30);
    g.setColor(c);
}

public void update(Graphics g) {
    if (this.offScreenImage == null) {
        this.offScreenImage = this.createImage(800, 600);
    }
    Graphics gOffScreen = this.offScreenImage.getGraphics();
    Color c = gOffScreen.getColor();
    gOffScreen.setColor(Color.DARK_GRAY);
    gOffScreen.fillRect(0, 0, 800, 600);
    gOffScreen.setColor(c);
    print(gOffScreen);
    g.drawImage(offScreenImage, 0, 0, null);
}
```
### Version 4.0 : Tank Movement  
a). Function: Make the tank move by pressing arrow keys in keyboard  
b). Create a private class inside ```TankClient``` class that extends ```KeyAdapter``` class called ```KeyMonitor```
c). Override ```keyPressed()``` method and fill it with switch control flow to determine the pressed key based on its key code  
d). adjust the x and y position of the tank by adding and subtracting x and y position of the tank by 5  
e). call ```this.setKeyListener(new KeyMonitor())``` method in ```launchFrame()``` method and inject it with the ```KeyMonitor``` private class to start listening on keyboard pressed  
```java
private class KeyMonitor extends KeyAdapter {
    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();
        switch(key) {
            case KeyEvent.VK_LEFT:
                x -= 5;
                break;
            case KeyEvent.VK_UP:
                y -= 5;
                break;
            case KeyEvent.VK_RIGHT:
                x += 5;
                break;
            case KeyEvent.VK_DOWN:
                y += 5;
                break;
        }
    }
}
```
```java
    // in launchFrame()
    this.addKeyListener(new KeyMonitor());
```

### Version 5.0 : Tank Class Abstraction  
a). Function: To make cleaner code and make the tank reusable in the future  
b). Create a class named ```Tank``` and create ```draw()```and ```keyPressed()``` method inside it  
c). Move the draw tank logic in ```paint()``` in ```TankClient``` to the ```draw()``` method in ```Tank``` class  
d). Move the switch control flow logic in ```keyPressed()``` in ```KeyMonitor``` to the ```keyPressed()``` method in ```Tank``` class  
e). Instantiate the tank object and call both ```draw()``` and ```keyPressed()``` methods in ```TankClient``` class respectively
```java
import java.awt.*;
import java.awt.event.KeyEvent;

public class Tank {
    private int x, y;

    Tank(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void draw(Graphics g) {
        Color c = g.getColor();
        g.setColor(Color.RED);
        g.fillOval(this.x, this.y, 30, 30);
        g.setColor(c);
    }

    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();
        switch(key) {
            case KeyEvent.VK_LEFT:
                x -= 5;
                break;
            case KeyEvent.VK_UP:
                y -= 5;
                break;
            case KeyEvent.VK_RIGHT:
                x += 5;
                break;
            case KeyEvent.VK_DOWN:
                y += 5;
                break;
        }
    }
}
```
```java
public void launchFrame() {
    //...other code

    // init tank
    this.tank = new Tank(30, 50);
}
```
```java
public void paint(Graphics g) {
    tank.draw(g);
}
private class KeyMonitor extends KeyAdapter {
    public void keyPressed(KeyEvent e) {
        tank.keyPressed(e);
    }
}
```