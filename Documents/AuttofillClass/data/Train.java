import java.util.List;
import java.util.Iterator;
import java.util.List;
import java.lang.Iterable;

public class Train implements Iterable<Vehicule>
{
	private int nbVehicule;
	private Vehicule[] ensVehi;

	public Train()
	{
		this.nbVehicule = 0;
		this.ensVehi = new Vehicule[100];
	}

	public boolean ajouterVehicule(Vehicule v)
	{
		if(this.nbVehicule <=100)
		{
			this.ensVehi[this.nbVehicule++] = v;
			return true;
		}

		return false;

	}

	 public Iterator<Vehicule> iterator() {
        return (Iterator<Vehicule>) new MyIterator();
    }

    private class MyIterator implements Iterator<Vehicule> 
	{
        private int currentIndex = 0;

        
        public boolean hasNext() {
           return this.currentIndex < Train.this.nbVehicule;
        }
 
        
        public Vehicule next() {
        	if(this.hasNext())
				return Train.this.ensVehi[this.currentIndex++];
			return null;
        }
 
    }

    public static void main(String[] args)
    {
    	Train t = new Train();
    	t.ajouterVehicule(new Vehicule("Rouge"));
     	t.ajouterVehicule(new Vehicule("Vert"));
    	t.ajouterVehicule(new Vehicule("Bleu"));
    	t.ajouterVehicule(new Vehicule("Noir"));
	   	t.ajouterVehicule(new Vehicule("Jaune"));

	   	for(Vehicule c : t)
	   	{
	   		System.out.println(c);
	   	}

    }
 
}

