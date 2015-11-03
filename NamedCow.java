class NamedCow extends Cow
{
	protected String myName;
	public NamedCow(String type, String name, String sound)
	{
		myName = name;
		myType = type;      
        mySound = sound;  
	}
	public String getName(){return myName;}
	public String getSound(){return mySound;}     
    public String getType(){return myType;}
}