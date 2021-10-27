public class Vehicule
{
	private String couleur;

	public Vehicule(String couleur)
	{
		this.couleur = couleur;
	}

	public String getCouleur()
	{
		return this.couleur;
	}

	public String toString()
	{
		String sRet="";
		sRet+=" +--------+\n";
		sRet+=" | "+this.couleur+"  |\n";
		sRet+="-+========+-\n";
		sRet+="  OO    OO ";
		return sRet;

	}
}