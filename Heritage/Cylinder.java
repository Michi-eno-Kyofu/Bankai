
public class Cylinder extends Circle {
	
	private double height;
	
	public Cylinder() {// Constructeur pour initialiser radius et height.
		super(); // appel du constructeur sans argument de la superclasse « Circle() »
		height = 1.0; 
		}
	
	public Cylinder(double height) {/*Constructeur avec des valeurs par défaut de radius et color mais height est donnée */
		super(); // appel du constructeur sans argument de la superclasse « Circle() »
		this.height = height; 
		}
	
	public Cylinder(double radius, double height) {/* Constructeur avec des valeurs par défaut de color mais radius et height est donnée*/
		super(radius); // appel du constructeur Circle(r) de la superclasse
		this.height = height;
		}
	
	public double getHeight() {
		return height;
		}
	
	public double getVolume() {/*utilise la méthode getArea() de la se superclasse pour calculer le volume*/
	return getArea()*height;
	}
}
