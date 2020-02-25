public class Pokemon {
	String name;
	int health;
	String type;
	static int count;
	public void Pokemon() {
    this.name = name;
	this.health = health;
	this.type = type;
	count+=1;
    }
	public void attackPokemon(Pokemon pokemon) {
	pokemon.health = pokemon.health - 10;
	}
	public String getName() {
		return name;
	}
	public int getHealth() {
		return health;
	}
	public String getType() {
		return type;
	}
	public String setName(String name) {
		this.name = name;
	}
	public int setHealth(int health) {
		this.health = health;
	}
	public String setType(String type) {
		this.type = type;
	}
}
