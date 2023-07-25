package objetclass;
import java.util.Objects;
class Engine
{
	String nameOfEngine;
	String engineType;
	int hp;
	public Engine(String nameOfEngine, String engineType, int hp) {
		super();
		this.nameOfEngine = nameOfEngine;
		this.engineType = engineType;
		this.hp = hp;
	}
	@Override
	public String toString() {
		return "Engine [nameOfEngine=" + nameOfEngine + ", engineType=" + engineType + ", hp=" + hp + "]";
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Engine other = (Engine) obj;
		return Objects.equals(engineType, other.engineType) && hp == other.hp
				&& Objects.equals(nameOfEngine, other.nameOfEngine);
	}
	
	
}
public class Bike  {
	
		String name;
		double price;
		Engine engine;
		
		public Bike(String name, double price, Engine engine) {
			super();
			this.name = name;
			this.price = price;
			this.engine = engine;
		}

		@Override
		public String toString() {
			return "Bike [name=" + name + ", price=" + price + ", engine=" + engine + "]";
		}
		
		@Override
		public boolean equals(Object obj)
		{
			if(!(obj instanceof Bike)) return false;
			Bike b = (Bike) obj;
			return name.equals(b.name) && 
					price == b.price && 
					engine.equals(b.engine);
			
		}

	}
