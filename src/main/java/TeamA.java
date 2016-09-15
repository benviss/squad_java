import java.util.Random;

import java.util.ArrayList;
import java.util.List;

public class TeamA {


  private String mTeamName;
  private String mMotto;
  private String mObjective;
  private ArrayList<Super> mSuperSquad = new ArrayList<Super>();


  public TeamA() {

  }

  public void createEnemy(TeamA _userTeam) {
    Random myRandomGenerator = new Random();
    int ran1 = myRandomGenerator.nextInt(teamNameArray.length - 1) + 1;
    int ran2 = myRandomGenerator.nextInt(teamMottoArray.length - 1) + 1;
    int ran3 = myRandomGenerator.nextInt(teamObjectiveArray.length - 1) + 1;


    mTeamName = teamNameArray[ran1];
    mMotto = teamMottoArray[ran2];
    mObjective = teamObjectiveArray[ran3];

    ArrayList<Super> teamRoster = Super.allRoster();
    for (int i = 0;this.all().size()< 3 ;i++ ) {
      int ran4 = myRandomGenerator.nextInt(Super.allRoster().size() - 1);
      if ((_userTeam.all().contains(teamRoster.get(ran4)))) {

      } else if ((this.all().contains(teamRoster.get(ran4)))){
      } else {
        this.all().add(teamRoster.get(ran4));
        System.out.println(teamRoster.get(ran4).getSuperName());
      }
    }
  }



  public void addSuper(Super _newSuper) {
    mSuperSquad.add(_newSuper);
  }

  public ArrayList<Super> all() {
    return mSuperSquad;
  }

  public String getTeamName() {
    return mTeamName;
  }
  public String getMotto() {
    return mMotto;
  }
  public String getObjective() {
    return mObjective;
  }
  public void setTeamName(String _input) {
    mTeamName = _input;
  }
  public void setMotto(String _input) {
    mMotto = _input;
  }
  public void setObjective(String _input) {
    mObjective = _input;
  }

  String[] teamNameArray = {"The Unforgivables","The Best Crepe Chefs Around","The Worst Crepe Chef's Around","A Bunch of Nice High-Schoolers", "Survivors of 2012"};
  String[] teamMottoArray = {"Never Stop Never Stopping","Don't poke a bear in his brown eye","Don't forget to bring a towel", "ALL YOUR BASE ARE BELONG TO US"};
  String[] teamObjectiveArray = {"To Adopt All The Puppies","Not sure, just hanging around","Genuinely want to murder everybody","Lost the keys to their house, thought you might have them","If they tell you they will have to kill you. But they will kill you anyways, soooo...."};
}
