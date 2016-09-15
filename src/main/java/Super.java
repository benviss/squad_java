import java.util.ArrayList;
import java.util.List;

public class Super{
  private Integer mID;
  private String mSuperName;
  private Integer mLevel;
  private Integer mHealth;
  // private Integer mAbilityPower?
  private Integer mStrength;
  private Integer mAgility;
  private Integer mDefense;
  private static ArrayList<Super> mSupersRoster = new ArrayList<Super>();

  public Super(String _SuperName, Integer _Health, Integer _Strength, Integer _Agility, Integer _Defense)  {
    mLevel = 1;
    mSuperName = _SuperName;
    mHealth = _Health;
    mStrength = _Strength;
    mAgility = _Agility;
    mDefense = _Defense;
    mSupersRoster.add(this);
    mID = mSupersRoster.size();
  }

  public static void main(String[] args) {
      Super temp1 = new Super("Metalneato",100,10,5,10);
      Super temp2 = new Super("Turbulent Puncher",75,15,10,5);
      Super temp3 = new Super("Karate Sam",100,15,15,10);
      Super temp4 = new Super("Magic Man",50,20,5,5);
      Super temp5 = new Super("Tigress",100,15,10,10);
      Super temp6 = new Super("Chester Cheeto",125,10,10,15);
  }



  // All Stat Getters
  public Integer getLevel() {
    return mLevel;
  }
  public Integer getHealth(){
    return mHealth;
  }
  public Integer getStrength(){
    return mStrength;
  }
  public Integer getAgility(){
    return mAgility;
  }
  public Integer getDefense(){
    return mDefense;
  }
  public String getSuperName(){
    return mSuperName;
  }

  public Integer getID() {
    return mID;
  }
  // End of Stat Getters

  public static Super find(int id) {
    return mSupersRoster.get(id - 1);
  }
  public static ArrayList<Super> allRoster() {
    return mSupersRoster;
  }
}
