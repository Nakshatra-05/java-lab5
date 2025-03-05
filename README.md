# 🔷 Shape Calculator
A Java-based menu-driven application that allows users to calculate the area and volume of various geometric shapes, including Circle, Rectangle, Square, Sphere, Cylinder, and Equilateral Pyramid.

# 📂 Project Structure

📁 ShapeCalculator  
│── 📁 shapes/                 # Package containing shape classes  
│    ├── 📄 Shape.java         # Abstract base class for all shapes  
│    ├── 📄 Circle.java        # Implements Circle with area calculation  
│    ├── 📄 Rectangle.java     # Implements Rectangle with area calculation  
│    ├── 📄 Square.java        # Implements Square with area calculation  
│    ├── 📄 Sphere.java        # Implements Sphere with volume calculation  
│    ├── 📄 Cylinder.java      # Implements Cylinder with volume calculation  
│    ├── 📄 EquilateralPyramid.java # Implements Pyramid with volume calculation  
│    ├── 📄 Volume.java        # Interface for 3D shapes with volume  
│── 📄 Main.java               # Menu-driven program for user interaction  
│── 📄 README.md               # Project documentation  
# 🚀 Features
✅ Calculate Area – Compute the area of 2D shapes (Circle, Rectangle, Square).
✅ Calculate Volume – Compute the volume of 3D shapes (Sphere, Cylinder, Pyramid).
✅ User Input Support – Enter dimensions and get real-time calculations.
✅ Menu-Driven Interface – Select and calculate shape properties interactively.

# 🛠️ Run
1️⃣ Compile & Run

javac -d . shapes/*.java Main.java 

java Main  
# 📝 Usage
1️⃣ Run the program.

2️⃣ Choose a shape from the menu.

3️⃣ Enter the required dimensions.

4️⃣ Get the area or volume based on the shape type.

# 📌 Example Output
Choose a shape:
1. Circle
2. Rectangle
3. Square
4. Sphere
5. Cylinder
6. Equilateral Pyramid
7. Exit
Enter your choice: 1

Enter radius of Circle: 5
Area of Circle: 78.54
