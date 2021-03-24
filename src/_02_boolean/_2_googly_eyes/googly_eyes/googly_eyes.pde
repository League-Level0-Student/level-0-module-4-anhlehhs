PImage face;
void setup() {
  face=loadImage("bob.jpg");
  size(800,600);
  face.resize(800,600);
}

void draw() {
  background(face);
  fill(255);
  ellipse(382,188,230,230);
  ellipse(570,187,190,190);
  fill(0);
  if(mouseX < 317){
    mouseX = 317; 
  }
  if(mouseX>447){
  mouseX=447;
  }
  if(mouseY>250){
  mouseY=250;
  }
    if(mouseY<125){
  mouseY=125;
  }
  ellipse(mouseX + 150,mouseY,100,100);
  
  ellipse(mouseX,mouseY,100,100);
  if(mousePressed){
  println(mouseX+"  "+mouseY);
  }
  
}
