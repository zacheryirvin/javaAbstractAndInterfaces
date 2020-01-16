package trans;

public class HorseFromVehicle extends AbstractVehicle
{
	public String name;

	public HorseFromVehicle(String name, int fuel)
	{
		super(fuel);
		this.fuel *= 2;
		this.name = name;
	}
	public HorseFromVehicle(String name)
	{
		this.name = name;
	}

	@Override
	public String getPath()
	{
		return "Grass";
	}

	@Override
	public String getName()
	{
		return name;
	}

	@Override
	public String toString()
	{
		return "Name: " + name + "\n" +
			"Fuel: " + fuel + "\n";
	}
}
