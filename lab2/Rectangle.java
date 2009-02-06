class Rectangle {
  private int length;
  private int width;
  
  public Rectangle(int l, int w) {
    length = l;
    width = w;
  }
  
  public int area() {
    return length * width;
  }
  
  public int perimeter() {
    return 2 * (length + width);
  }
}